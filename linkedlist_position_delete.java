package sample;
import java.util.*;

public class linkedlist_position_delete {
	node head;
	static class node
	{
		int data;
		node next;
		node (int d)
		{
			data = d;
			next = null;
		}
	}
	void insert_in_list(int datavalue)
	{
		node new_node = new node(datavalue);
		if(head==null)
		{
			head = new node(datavalue);
			return;
		}
		new_node.next = null;
		
		node last = head;
		while(last.next!=null)
		{
			last = last.next;
		}
		last.next = new_node;
		
	}
	void delete_pos(int k)
	{
		node temp = head;
		int i=0;
		if(head == null)
		{
			System.out.println("node can't be deleted");
		}
		if(k ==0)
		{
			head.next = null;
		}
		for(i =0; temp!=null && i<k-1; i++)
		{
			temp = temp.next;
		}
		node h = temp.next.next;
		temp.next = h;
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
		linkedlist_position_delete plist = new linkedlist_position_delete();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements to be present in linkedlist");
		int m = sc.nextInt();
		for(int i=0; i<m; i++)
		{
			System.out.println("Enter element to be inserted in linkedlist");
			int el = sc.nextInt();
			plist.insert_in_list(el);	
		}
		System.out.println("Enter the position from where element need to be deleted in linkedlist");
		int l = sc.nextInt();
		plist.delete_pos(l);
		plist.printlist();
	}

}
