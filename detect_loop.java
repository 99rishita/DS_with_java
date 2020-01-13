package sample;

public class detect_loop {
	node head;
	node tail;
	class node
	{
		int data;
		node next;
		node()
		{
			next=null;
		}
	}
	void insert(int value)
	{
		node temp = new node();
		temp.data=value;
		temp.next=head;
		head=temp;
	}
	
	int detect()
	{

		node p=head;
		node t=head;
		while(t!=null && p!=null && t.next!=null)
		{
			p=p.next;
			t=t.next.next;
			if(t==p)
			{
				System.out.println("loop exists");
				return 1;
			}
			int count=1;
			node m=p;
			while(m.next!=p)
			{
				m=m.next;
				count++;
			}
			System.out.println("count is" + count);
		}
		return 0;
	}
	void print()
	{
		node p=head;
		while(p!=null)
		{
			System.out.println(p.data + " ");
			p=p.next;
		}
	}

	public static void main(String[] args) {
		detect_loop dl = new detect_loop();
		dl.insert(1);
		dl.insert(2);
		dl.insert(3);
		dl.insert(4);
		dl.insert(5);
		dl.insert(6);
		dl.print();
		dl.head.next.next.next=dl.head;
		int m=dl.detect();
		System.out.println(m);
	}

}
