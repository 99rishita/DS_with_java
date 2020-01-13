package sample;
import java.util.*;

public class search_binary {
	int mid;
	void search(int arr[], int l, int r, int key)
	{
		
		if(r>=l)
		{
			mid = l+(r-l)/2; 
		}
		if(arr[mid]==key)
		{
			System.out.println("the key is found at index:" +  mid);
		}
		else if(key < arr[mid])
		{
			search(arr, l, mid-1, key);
		}
		else
		{
			search(arr, mid+1, r, key);
		}
	}

	public static void main(String[] args) {
		search_binary sb = new search_binary();
		int arr[] = {1,2,3,4,5};
		int key = 4;
		int n = arr.length;
		sb.search(arr,0,n-1,4);

	}

}
