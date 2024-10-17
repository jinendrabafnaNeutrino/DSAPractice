package String;

public class PalindromeStringusingloop 
{
 public static void main(String [] args)
 {
	 String str = "abcdcba";
	 boolean ispalin = true;
	 
	 for(int i = 0 ; i<str.length()/2; i++)
	 {
		 if(str.charAt(i) != str.charAt(str.length()-1-i))
		 {
			 ispalin = false;
			 break;
		 }
	 }
	 
	 if(ispalin)
	 {
		 System.out.println(str+ " is Palindrome");
	 }
	 else
	 {
		 System.out.println(str + " is not palindrome");
	 }
 }
}
