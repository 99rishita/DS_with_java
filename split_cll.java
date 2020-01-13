package sample;
import java.util.*;

public class split_cll {
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
	void atbegin(int value)
	{
		if(head==null && tail==null)
		{
			node temp = new node(value);
			head=temp;
			tail=temp;
			temp.next=head;
		}
		node temp = new node(value);
		temp.next=tail.next;
		head=temp;
		tail.next=head;
	}
	int size=4;
	void split()
	{
		node p=head;
		node q=head;
		if(p.next.next==head)
		{
			System.out.println(p.data + " ");
			p=p.next;
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
		split_cll scl = new split_cll();
		scl.atbegin(7);
		scl.atbegin(9);
		scl.atbegin(99);
		scl.atbegin(77);
		scl.print();
		scl.split();

	}

}
