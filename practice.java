package sample;
import java.util.*;

public class practice {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check");
		int num = sc.nextInt();
		int sum = sc.nextInt();
		int k = sc.nextInt();
		
		k = num;
		while(num>0)
		{
			int rem = num%10;
			sum = sum + rem*rem*rem;
			num = num/10;
		}
		if(k==sum)
		{
			System.out.println("this is amsrtong number");
		}
		else
		{
			System.out.println("this is not amsrtong number");
		}

	}

}
