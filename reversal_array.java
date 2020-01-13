package sample;
import java.util.*;

public class reversal_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] array = new int[n];
		for(int j=0; j<array.length; j++)
		{
			array[j] = sc.nextInt();
		}
		int[] a = new int[d];
		int[] b = new int[array.length-d];
		for(int i=0; i<n; i++)
		{
			if(i<a.length)
			{
			a[i] = array[i];
			System.out.println("the a array is" +a[i]);
			}
			else
			{
				b[i-a.length] = array[i];
				System.out.println("the b array is" + b[i-a.length]);
			}
		}
		int l = a.length + b.length;
		int[] result = new int[l];
		for(int i=0; i<l; i++)
		{
			if(i < b.length)
			{
			  result[i] = b[i];
			  System.out.println("the new array is" + result[i]);
			}
			else
			{
			  result[i] = a[(i-a.length)-1];
			  System.out.println("the new array is" + result[i]);
			}
			
		}
	}
}
