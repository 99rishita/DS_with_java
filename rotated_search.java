package sample;
import java.util.*;

public class rotated_search {
	int pivot;
	int index;
	void pivot_element(int[] array)
	{
		
		for(int i=0; i<array.length; i++)
		{
			if(array[i]>array[i+1])
			{
				 pivot = array[i];
				 index = i;
			}
		}
	}
	int mid;
	int value;
	void binary_search(int array[], int l, int r, int x)
	{
		mid = index;
		value = pivot;
		if(value==x)
		{
			System.out.println("the key element is at index:" + mid);
		}
		if(x>array[0])
		{
			binary_search(array, l, mid-1, x);
		}
		if(x>array[mid+1])
		{
			binary_search(array, mid+1, r, x);
		}
	}

	public static void main(String[] args) {
		rotated_search rs = new rotated_search();
		int[] array = {3,4,5,1,2};
		int x = 1;
		int n = array.length;
		rs.binary_search(array,0,n-1,1);
	}

}
