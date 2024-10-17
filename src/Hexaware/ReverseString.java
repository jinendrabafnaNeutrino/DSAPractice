package Hexaware;

public class ReverseString 
{
	public static void main(String [] args)
	{
		String name = "JayBafna";
		String str = "Welcome to my world";
		String rev = "";
		StringBuilder sb = new StringBuilder(name);
		sb.reverse();
		System.out.println(sb.toString());
		
		char ch [] = str.toCharArray();
		
		for(int i = ch.length-1 ; i>=0; i--)
		{
			rev += ch[i];
		}
		System.out.println(rev);
	}

}
