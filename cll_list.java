package sample;

public class cll_list {
	node head = null;
	node tail = null;
	
	class node 
	{
		int data;
		node next;
		node(int d)
		{
			next=null;
			data=d;
		}
	}
	void emptylist(int value)
	{
		if(head==null && tail==null)
		{
			node temp = new node(value);
			head=temp;
			tail=temp;
			temp.next=tail;
		}
	}
	void atbegin(int value)
	{
		node t = new node(value);
		t.next=tail.next;
		head=t;
		tail.next=head;
	}
	void atend(int value)
	{
		node t = new node(value);
		tail.next=t;
		tail=t;
		t.next=head;
	}
	void atmiddle(int value, int item)
	{
		node p=head;
		do
		{
		if(p.data==item)
		{
			node temp = new node(value);
			temp.next=p.next;
			p.next=temp;
		}
			p=p.next;
	
			}while(p!=tail.next);
	}
	void print()
	{
		node p=head;
		do
		{
			System.out.println(p.data +" ");
			p=p.next;
		}while(p!=tail.next);
	}

	public static void main(String[] args) {
		cll_list lc = new cll_list();
		lc.emptylist(99);
		lc.atbegin(7);
		lc.atbegin(9);
		lc.atbegin(5);
		lc.atbegin(77);
		lc.atend(59);
		lc.atmiddle(66, 9);
		lc.atmiddle(97, 7);
		lc.print();

	}

}
