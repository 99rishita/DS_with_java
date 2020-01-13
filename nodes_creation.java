package sample;

public class nodes_creation {
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
	
	void printlist()
	{
		node n = head;
		while(n!=null)
		{
			System.out.print(n.data + " ");
			n =  n.next;
		}
	}
	

	public static void main(String[] args) {
		nodes_creation nlist = new nodes_creation();
		nlist.head = new node(1);
		node second = new node(2);
		node third = new node(3);
		
		nlist.head.next = second;
		second.next = third;
		
		nlist.printlist();
	}

}
