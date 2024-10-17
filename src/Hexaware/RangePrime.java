package Hexaware;

import java.util.Scanner;

public class RangePrime 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i = start ; i<=end; i++)
		{
			if(isprime(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	
  static boolean isprime(int num)
  {
	  for(int i = 2 ; i<=num/i;i++)
	  {
		  if(num%i==0)
		  {
			  return false;
		  }
	  }
	return true;
  }
}
