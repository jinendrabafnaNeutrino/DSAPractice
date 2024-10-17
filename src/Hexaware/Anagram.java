package Hexaware;
import java.util.Arrays;

public class Anagram 
{
	public static void main(String [] args)
	{
		String str1 = "Race";
		String str2 = "Care";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() == str2.length())
		{
			char [] char1 = str1.toCharArray();
			char[]  char2 =  str2.toCharArray();
			
			Arrays.sort(char1);
			Arrays.sort(char2);
			
			boolean result = Arrays.equals(char1, char2);
			
			if(result)
			{
				System.out.println("The String is Anagram");
			}
			
			
			
		}
		else
		{
			System.out.println("The String is not Anagram");
		}
	}

}
