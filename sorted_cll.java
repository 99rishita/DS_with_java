package sample;
import java.util.*;

public class sorted_cll {
	node head=null;
	
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
	void insert_sort(int value)
	{
		
		node p=head;
		node temp = new node(value);
		if(p==null)
		{
			
			temp.next=temp;
			head=temp;
			
		}
		
		else if(p.data>=value)
		{
			while(p.next!=null)
			{
				p=p.next;
			}
			
			p.next=temp;
			temp.next=head;
			head=temp;
		}
		else
		{
			while(p.next!=head && p.next.data<value)
			{
				p=p.next;
			}
			
			temp.next=p.next;
			p.next=temp;
		}
	}
	void print()
	{
		if(head!=null)
		{
		node p=head;
		do
		{
			System.out.println(p.data + " ");
			p=p.next;
		}while(p!=head);
		}
	}

	public static void main(String[] args) {
		sorted_cll sll = new sorted_cll();
		sll.insert_sort(12);
		sll.insert_sort(56);
		sll.insert_sort(11);
		sll.insert_sort(3);
		sll.insert_sort(2);
		sll.print();

	}

}
