package Persistent;
import java.util.*;

public class SumofDigits 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0 ,remainder;
		
		while(n != 0)
		{
			remainder = n % 10;
			sum = sum + remainder;
			n = n/10;
		}
		System.out.println(sum);
	}
	
}
