package PractiseCode;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int result = 0;
			int remainder;
			
			int orginalnumber = num;
			
			while(num!=0)
			{
				remainder =  num%10;
				result = result *10 + remainder;
				num = num/10;
			}
			
			if(orginalnumber == result)
			{
				System.out.println(orginalnumber + " is Palindrome Number");
			}
			else
			{
				System.out.println(orginalnumber + "is not Palindrome Number");
			}
				

	}

}
