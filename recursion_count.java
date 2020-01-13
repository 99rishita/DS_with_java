package sample;
import java.util.*;

public class recursion_count {
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
	int count_recursively(node node1)
	{
		if(node1==null)
		{
			return 0;
		}
		return 1 + count_recursively(node1.next);
	}
	int count()
	{
		return count_recursively(head);
	}

	public static void main(String[] args) {
		recursion_count rc = new recursion_count();
		rc.insert(3);
		rc.insert(5);
		rc.insert(7);
		rc.insert(9);
		rc.insert(11);
		System.out.println("count of elements is " + rc.count());
		
	}

}
