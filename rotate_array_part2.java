package sample;
import java.util.*;


public class rotate_array_part2 {
	void robyone(int array[], int n, int d)
	{
		for(int i=0; i<d; i++)
		{
			int temp = array[0];
			for(int j=0; j<array.length-1; j++)
			{
				array[j] = array[j+1];
			}
			array[array.length-1] = temp;
		}
		
	 
	}

	public static void main(String[] args) {
		rotate_array_part2 rotate = new rotate_array_part2();
		int array[] = {1,2,3,4,5};
		rotate.robyone(array, 5, 2);
		rotate.printarray(array, 5);

	}

	private void printarray(int[] array, int n) {
		// TODO Auto-generated method stub
		for(int k =0; k< n; k++)
		{
			System.out.println(array[k]);
		}
	}

	

	

}
