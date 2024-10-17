package Recursion;

public class CountNumbers 
{
	public static void main(String [] args)
	{
		System.out.println(countzero(3002100, 0));
	}
	
	static int countzero(int n , int count) 
	{
		if(n ==0)
		{
			return count;
		}
		int rem = n%10;
		if(rem==0)
		{
			return countzero(n/10,count+1);
		}
		return countzero(n/10,count);
		}
		
	}


