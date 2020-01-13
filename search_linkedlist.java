package sample;
import java.util.*;

public class search_linkedlist {
	node head;
	public class node{
		int data;
		node next;
		node(int d)
		{
			data=d;
			next=null;
		}
	}
	void insert(int value)
	{
		node to_insert = new node(value);
		to_insert.next = head;
		head = to_insert;
	}
	int search(int key)
	{
		node temp;
		temp = head;
		while(temp.next!=null & temp.data!=key)
		{
			temp = temp.next;
		}
		int x = temp.data;
		return x;
	}

	public static void main(String[] args) {
		search_linkedlist sl = new search_linkedlist();
		sl.insert(3);
		sl.insert(4);
		sl.insert(5);
		sl.insert(7);
		sl.search(4);

	}

}
