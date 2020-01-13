package sample;
import java.util.*;

public class count_nodes {
	node head;
	static class node
	{
	int data;
	node next;
	node(int d)
	{
		data=d;
		next=null;
	}
	}
	void insert(int key)
	{
		node temp1 = new node(key);
		temp1.next = head;
		head = temp1;
		
	}
	node temp = new node(2);
	int count = 0;
	void to_count()
	{
		node temp = head;
		while(temp!=null)
		{
			temp = temp.next;
			count++;
		}
		System.out.print("number of data nodes is" + count);
	}
	

	public static void main(String[] args) {
		count_nodes cn = new count_nodes(); 
		cn.insert(1);
		cn.insert(2);
		cn.insert(3);
		cn.insert(4);
		cn.to_count();

	}

}
