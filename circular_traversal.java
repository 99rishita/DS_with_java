package sample;
import java.util.*;

public class circular_traversal {
	
	static class node{
			int data;
			node next;
			node(int d)
			{
				next = null;
				data = d;	
			}
	};
	static node toemptylist(node last, int value)
	{
		if(last==null)
		{
			node temp = new node(value);
			last=temp;
			last.next=last;
		}
		return last;
	}
	static node insertbegin_list(node last, int value)
	{
		if(last==null)
		{
			return last;
		}
		node temp = new node(value);
		temp.next=last.next;
		last.next=temp;
		
		return last;
	}
	static node insertlast_circular(node last, int value)
	{
		node temp = new node(value);
		temp.next=last.next;
		last.next=temp;
		last=temp;
		
		return last;
	}
	static node insertmiddle_circular(node last, int value, int d)
	{
		node p;
		p=last.next;
		if(p.data==d)
		{
			node temp = new node(value);
			temp.next=p.next;
			p.next=temp;
			
			if(p==last)
			{
				last=temp;
			}
		}
		p=p.next;
		while(p!=last.next)
		{
			System.out.println(d + "item not present");
		}
		return last;
	}
	static node traverse_circular(node last)
	{
		node p;
		p=last.next;
		do
		{
			System.out.println(p.data + " ");
			p=p.next;
		}while(p!=last.next);
		
		return last;
	}
	
	public static void main(String[] args) {
		circular_traversal cl = new circular_traversal();
		node last = null;
		last = toemptylist(last, 7);
		last = insertbegin_list(last, 1);
		last = insertbegin_list(last, 2);
		last = insertbegin_list(last, 3);
		
		traverse_circular(last);
		
		

	}

}
