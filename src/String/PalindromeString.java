package String;

public class PalindromeString 
{
 public static void main(String [] args)
 {
	String str = "abcdcba";
	String rev = (new StringBuilder(str).reverse().toString());
	
	if(str.equals(rev))
	{
		System.out.println(str +" is Palindrome");
	}
	else
	{
		System.out.println(str + " is Not Palindrome");
	}
 }
}
