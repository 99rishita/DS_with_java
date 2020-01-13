package sample;

import sample.delete_cll.node;

public class count_cll {
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
	void insert_atempty(int v)
	{
		if(head==null && tail==null)
		{
			node temp=new node(v);
			head=temp;
			tail=temp;
			temp.next=head;
		}
	}
	void insert(int v)
	{
		node temp=new node(v);
		head=temp;
		temp.next=tail.next;
		tail.next=head;
	}
	void count()
	{
		int count=1;
		node p = head;
		do
		{
			count++;
			p=p.next;
		}while(p.next!=head);
		System.out.println(count);
	}
	void exchange(int value)
	{
		node t= new node(value);
		t.data=tail.data;
		tail.data=head.data;
		head.data=t.data;
	}
	void print()
	{
		node p=head;
		do
		{
			System.out.print(p.data + " ");
			p=p.next;
		}while(p!=head);
		
	}

	public static void main(String[] args) {
		count_cll ccl = new count_cll();
		ccl.insert_atempty(1);
		ccl.insert(2);
		ccl.insert(3);
		ccl.print();
		//ccl.count();
		ccl.exchange(5);
		ccl.print();
	}

}
