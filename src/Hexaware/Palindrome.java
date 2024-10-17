package Hexaware;

public class Palindrome 
{
	public static void main (String [] args)
	{
		int num = 3553;
		
		int remainder ;
		int result = 0 ;
		int orignalnumber = num;
		
		while(num !=0)
		{
		   remainder = num %10;
		   result = result *10 + remainder;
		   num = num/10;
		}
		
		
		if(orignalnumber == result)
		{
			System.out.println(orignalnumber+" Number is Palindrome");
		}
		else
		{
			System.out.println(orignalnumber+" Number is not Palindrome");
		}
	}

}
