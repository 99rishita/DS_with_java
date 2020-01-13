package sample;
import java.util.*;

public class cll_sorted_insertion {
	node head=null;
	node tail=null;
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
	void insert_atbegin(int value)
	{
		if(head==null && tail==null)
		{
			node temp = new node(value);
			head=temp;
			tail=temp;
			temp.next=tail;
		}
		node temp = new node(value);
		temp.next=head;
		head=temp;
		tail.next=head;
	}
	void insert_sorted(int value)
	{
		node p=head;
		while(p.next.data<value)
		{
			p=p.next;
		}
		node temp = new node(value);
		temp.next=p.next;
		p.next=temp;
	}
	void print()
	{
		node t=head;
		do
		{
			System.out.println(t.data + " ");
			t=t.next;
		}while(t.next!=head);
	}

	public static void main(String[] args) {
		cll_sorted_insertion csi = new cll_sorted_insertion();
		csi.insert_atbegin(9);
		csi.insert_atbegin(13);
		csi.insert_atbegin(3);
		csi.insert_sorted(11);
		csi.print();

	}

}
