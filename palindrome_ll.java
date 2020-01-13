package sample;

public class palindrome_ll {
	node head;
	class node
	{
		int data;
		node next;
		node()
		{
			next=null;
		}
	}
	void insert()
	{
		node temp=new node();
		temp.next=head;
		head=temp;
	}
	int len=0;
	void len_cal()
	{
		node p=head;
		int count=0;
		while(p!=null)
		{
			p=p.next;
			count++;
		}
		len=count;
	}
	void palindrome_check()
	{
		node p=head;
		node t=head;
		int r=len/2;
		int m=0;
		if(len%2==0)
		{
			while(m<r)
			{
				t=t.next;
				m++;
			}
			while(p!=head)
			{
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
