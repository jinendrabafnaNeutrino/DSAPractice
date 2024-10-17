package Hexaware;

public class PalindromeString 
{
 public static void main(String [] args)
 {
	 String str = "abcdcbakkkbkb";
	 boolean ispalin = true;
	 
	 for(int i = 0 ; i < str.length() ; i++)
	 {
		 if(str.charAt(i) != str.charAt(str.length()-i-1))
		 {
			 ispalin = false;
			 break;
		 }
	 }
	 
	 if(ispalin)
	 {
		 System.out.println(str+ " is palindrome");
	 }
	 else
	 {
		 System.out.println(str+"  	not palindrome");
	 }
 }
}
