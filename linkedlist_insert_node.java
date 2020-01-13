package sample;

public class linkedlist_insert_node {
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
	void insert_first(int new_data)
	{
		node new_node = new node(new_data);
		new_node.next = head;
		head = new_node;
	}
	void insert_middle(node prev, int newdata)
	{
		if(prev == null)
		{
			System.out.println("this node cannot be null");
			return;
		}
		node middle_node = new node(newdata);
		middle_node.next = prev.next;
		prev.next = middle_node;
	}
	void insert_last(int newdata1)
	{
		node new_lastnode = new node(newdata1);
		if(head == null)
		{
			head = new node(newdata1);
			return;
		}
		new_lastnode.next = null;
		
		node last = head;
		while(last.next!=null)
		{
			last = last.next;
		}
		last.next = new_lastnode;
		return;
	}
	void print_list()
	{
		node n = head;
		while(n!=null)
		{
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String[] args) {
		linkedlist_insert_node list = new linkedlist_insert_node();
		list.head = new node(1);
		node second = new node(2);
		node third = new node(3);
		list.head.next = second;
		second.next = third;
		list.insert_first(5);
		list.insert_middle(list.head.next.next,6);
		list.insert_last(7);
		list.print_list();
		
		
		

	}

}
