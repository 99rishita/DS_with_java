package sample;
import java.util.*;

public class swap_nodes {
	node head;
	public class node 
	{
		int data;
		node next;
		node(int d)
		{
			data = d;
			next = null;
		}
	}
	void insert(int value)
	{
		node temp = new node(value);
		temp.next = head;
		head = temp;
	}
	void swap(int k1, int k2)
	{
		node temp1 = new node(k1);
		
		node temp2_prev;
		node temp2 = new node(k2);
		temp1 = head;
		temp2 = head;
		while(temp1.next!=null | temp1.data!=k1)
		{
			temp1 = temp1.next;
		}
		while(temp2.next!=null | temp2.data!=k2)
		{
			temp2 = temp2.next;
		}
		
	}

	public static void main(String[] args) {
		swap_nodes sn = new swap_nodes();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the key1");
		int key1 = sc.nextInt();
		System.out.println("enter the key2");
		int key2 = sc.nextInt();
		sn.insert(1);
		sn.insert(2);
		sn.insert(3);
		sn.insert(7);
		sn.insert(9);

	}

}
