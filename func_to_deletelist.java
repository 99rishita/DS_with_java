package sample;
import java.util.*;

public class func_to_deletelist {
	node head;
	
	static class node 
	{
		int data;
		node next;
		node(int d)
		{
			data = d;
			next=null;
		}
	}
	void insert(int newdata)
	{
		node new_node = new node(newdata);
		new_node.next = head;
		head = new_node;
	}
	void deletelist_using_func()
	{
		 head = null;
	}
	void printlist()
	{
		node n = head;
		while(n!=null)
		{
			System.out.println(n.data + " ");
			n=n.next;
		}
	}

	public static void main(String[] args) {
		func_to_deletelist flist = new func_to_deletelist();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of elements to be inserted");
		int m = sc.nextInt();
		for(int i=0; i<m; i++)
		{
			System.out.println("enter element to be inserted");
			int el = sc.nextInt();
			flist.insert(el);
		}
		flist.printlist();
		flist.deletelist_using_func();
        flist.printlist();
	}

}
