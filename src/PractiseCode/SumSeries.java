package PractiseCode;
import java.util.Scanner;

public class SumSeries 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		 float result = 0;
		
		for(float i = 0 ; i <=n ; i++)
		{
			result = 1+i;
		}
		System.out.println(result);
	}

}
