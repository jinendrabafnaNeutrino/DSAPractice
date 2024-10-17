package String;

public class PalindromeusingMethod 
{
 public static void main(String [] args)
 {
	 String str = "tattarrattat";
	 System.out.println(ispain(str));
 }
 static boolean ispain(String str)
 {
	 if(str == null || str.length() ==0  )
	 {
		 return true;
	 }
	 str = str.toLowerCase();
	 
	 for(int i = 0 ; i<str.length()/2; i++)
	 {
		 int start = str.charAt(i);
		 int end = str.charAt(str.length()-1-i);
		 
		 if(start != end)
		 {
			 return false;
		 }
		 
		 
	 }
	 return true;
 }
}
