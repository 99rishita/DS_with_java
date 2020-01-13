package sample;
import java.util.*;

public class part {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0; i<n; i++)
		{
			array[i] = sc.nextInt();
		}
		int x = array[array.length-1];
		for(int i=array.length-1; i>0; i--)
		{
			
			array[i] = array [i-1];
			
		}
		array[0] = x;
		for(int j= 0; j<n; j++)
		{
			System.out.println("the cyclically rotated array is" + array[j]);
		}

	}

}
