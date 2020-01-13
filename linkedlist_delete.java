package sample;
import java.util.*;

public class linkedlist_delete {
	node head;
	
	static class node
	{
		int data;
		node next;
		node(int d)
		{
			data = d;
			next = null;
		}
	}
	void delete_node(int key)
	{
		node temp = head;
		node prev = null;
		while(temp!=null && temp.data==key)
		{
			head.next = null;
			return;
		}
		while(temp!=null && temp.data!=key)
		{
			prev = temp;
			temp = temp.next;
			
			if(temp.data == key)
			{
				prev.next = temp.next;
			}
		}
	}
	void printlist()
	{
		node n = head;
		while(n!=null)
		{
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String[] args) {
		linkedlist_delete dlist = new linkedlist_delete();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the key to be deleted");
		int key = sc.nextInt();
		dlist.head = new node(1);
		node second = new node(2);
		node third = new node(3);
		
		dlist.head.next = second;
		second.next = third;
		
		System.out.println("the input linked list is as follows:");
		dlist.printlist();
		dlist.delete_node(key);
		System.out.println("\n" +"after deletion the linked list is as follows:");
		dlist.printlist();
	}

}
