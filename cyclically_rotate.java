package sample;
import java.util.*;

public class cyclically_rotate {
	void right_rotation(int array[], int n)
	{
		int x = array[n-1];
		for(int i=n-1; i>0; i--)
		{
			array[i] = array [i-1];
		}
		array[0] = x;
		for(int j=0; j<n; j++)
		{
			System.out.println("the cyclically rotated array is" + array[j]);
		}
	}

	public static void main(String[] args) {
		cyclically_rotate cr = new cyclically_rotate();
		int array[] = {1,2,3,4,5};
		cr.right_rotation(array, 5);

	}

}
