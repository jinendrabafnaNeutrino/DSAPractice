package Recursion;

public class SumofDigitsRecursion 
{
	public static void main(String [] args)
	{ 
		int ans = sumdigits(1234);
		System.out.println(ans);
		
		
	}
	
	static int sumdigits(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return (n%10) + (sumdigits(n/10));
	}

}
