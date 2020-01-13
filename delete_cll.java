package sample;

public class delete_cll {
	node head=null;
	node tail=null;
	class node
	{
		int data;
		node next;
		node(int d)
		{
			data=d;
			next=null;
		}
	}
	void insert_atempty(int value)
	{
		if(head==null && tail==null)
		{
			node temp = new node(value);
			head=temp;
			tail=temp;
			temp.next=head;
		}
	}
	void insert(int value)
	{
		node temp = new node(value);
		temp.next=tail.next;
		head=temp;
		tail.next=head;
	}
	void delete(int item)
	{
		if(head==null && tail==null)
		{
			System.out.println("deletion not possible");
		}
		
			node prev=head;
			node p=head;
			while(p.data!=item)
			{
				if(p.next==head)
				{
					System.out.println("element not present");
					break;
				}
				prev=p;
				p=p.next;
			}
			if(p.next==head)
			{
				head=null;
			}
			if(p==head)
			{
				prev=head;
				while(prev.next!=head)
				{
					prev=prev.next;
				}
				head=p.next;
				prev.next=head;
			}
			else if(p.next==head)
			{
				prev.next=head;
			}
			else
			{
				prev.next=p.next;
			}
		}
	
	void print()
	{
		node p=head;
		do
		{
			System.out.println(p.data + " ");
			p=p.next;
		}while(p!=head);
	}

	public static void main(String[] args) {
		delete_cll dl = new delete_cll();
		dl.insert_atempty(7);
		dl.insert(9);
		dl.insert(77);
		dl.insert(99);
		dl.print();
		dl.delete(99);
		dl.print();


	}

}
