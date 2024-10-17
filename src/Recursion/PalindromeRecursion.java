package Recursion;

public class PalindromeRecursion 
{
	static int reverse(int n , int temp)
	{
		if(n==0)
		{
			return temp;
		}
		temp = (temp*10) + (n%10);
		
		return reverse(n/10,temp);
	}
	
	public static void main(String [] args)
	{
		int  n = 121;
		int temp = reverse(n,0);
		
		if(temp==n)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
		
		
	}
}
