package PractiseCode;

import java.util.Scanner;

public class sumSeriesPart2 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		float result = 0;
		
		for(float i = 1  ; i <n ; i++)
		{
			if(i%2==0)
			{
				result += 1/i;
			}
			else
			{
				result -= i/i;
			}
		}
		System.out.println(result);
	}
}
