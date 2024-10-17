package PractiseCode;
import java.util.Arrays;


public class Anagram 
{
	public static void main(String [] args)
	{
		String  str1 = "Race";
		String  str2 = "jay";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		//check if the length is equal
		if(str1.length() == str2.length())
		{
			char[] CharArray1 = str1.toCharArray();
			char[] CharArray2 = str2.toCharArray();
			
			Arrays.sort(CharArray1);
			Arrays.sort(CharArray2);
			
			boolean result = Arrays.equals(CharArray1, CharArray2);
			
			if(result)
			{
				System.out.println(str1 + " and " + str2 + " are anagram string" );
			}
			else
			{
				System.out.println(str1 + " and " + str2 + " are not anagram string" );
			}
		}
		
			else
			{
				System.out.println(str1 + " and " + str2 + " are not anagram string" );
			}
		}
	}

