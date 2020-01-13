package sample;

public class length_ll {
	node head;
	
	class node
	{
		int data;
		node next;
		node(int d)
		{
			data=d;
			next=null;
		}
	}
	void atbegin(int value)
	{
		node temp=new node(value);
		temp.next=head;
		head=temp;
	}
	int count=0;
	void print()
	{
		node p=head;
		while(p!=null)
		{
			System.out.print(p.data + " ");
			p=p.next;
			count++;
		}
		//System.out.println(count);
		k=count;
	}
	public boolean search(int item)
	{
		node p=head;
		while(p!=null)
		{
			if(p.data==item)
			{
				return true;
			}
			p=p.next;
		}
		return false;
	}
	int k;
	void find(int index)
	{
		int count=1;
		node p= head;
		while(p!=null)
		{
			if(count==index)
			{
				System.out.println(p.data + " ");
			}
			p=p.next;
			count++;
		}
		
	}
	void find_data(int v)
	{
		node p=head;
		int count=0;
		while(p!=null)
		{
			if(p.data==v)
			{
				count++;
			}
			p=p.next;
		}
		System.out.println(count);
	}
	int middle_ele()
	{
		if(k%2==0)
		{
			int m=k/2;
			System.out.println("m is" + m);
			return m;
		}
		else
		{
			int h=k/2 + 1;
			System.out.println("h is" + h);
			return h;
		}
		
	}
	int find_end(int num)
	{
		int n=num;
		int count=0;
		node p=head;
		while(p!=null)
		{
			count++;
			p=p.next;
		}
		//System.out.println(count);
		int r=(count-n);
		return r;
	}

	public static void main(String[] args) {
		length_ll l = new length_ll();
		l.atbegin(1);
		l.atbegin(2);
		l.atbegin(3);
		l.atbegin(1);
		l.atbegin(5);
		l.atbegin(1);
		l.atbegin(1);
		l.print();
		//int s =l.find_end(2);
		//l.find(s);
		//int a=l.middle_ele();
		//l.find(a);
		l.find_data(1);
		//if(l.search(77))
			{
			//System.out.println("yes");
			}
		//else
		{
			//System.out.println("no");
		}
	}

}
