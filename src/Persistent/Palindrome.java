package Persistent;

public class Palindrome 
{
	public static void main(String [] args)
	{
	   int num = 3553;
	   int remainder ;
	   int result = 0;
	   int originalnumber = num;
	   
	   while(num !=0)
	   {
		   remainder = num%10;
		   result = result *10 + remainder;
		   num = num/10;
	   }
	   
	   if(originalnumber == result )
	   {
		   System.out.println("The Number is Palindrome");
	   }
	   else
	   {
		   System.out.println("The number is not palindrome");
	   }
	   
	}

}
