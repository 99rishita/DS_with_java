 package sample;
import java.util.*;
import java.util.Arrays;

public class rotate_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int d = sc.nextInt();
		int[] array = new int[num];
		for(int i=0; i<num; i++)
		{
		array[i] = sc.nextInt();
		}
		for(int i=0; i<num; i++)
		{
		System.out.println("the array is" + array[i]);
		}
		for(int k=0; k<d; k++)
		{
			int temp = array[0];
			for(int j=0; j<array.length-1; j++)
			{
				array[j] = array[j+1];
			}
			array[array.length-1] = temp;
		}
		for(int k=0; k<num; k++)
		{
		System.out.println("the rotated array is" + array[k]);
		}

	}

}
