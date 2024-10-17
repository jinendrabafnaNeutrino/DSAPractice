package Jio;
import java.util.Scanner;
public class MagicNumber 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number you want to check: ");  
		int number = sc.nextInt();
		int remainder = 1 , sum =0  ;
		
		//number = n;
		
		while(number>9)
		{
			while(number>0)
			{
				remainder = number %10;
				sum = sum + remainder;
				number = number/10;
			}
			number = sum;
			sum = 0;
		}
		if(number==1)
		{
			System.out.println("the number is magic");
		}
		else
		{
			System.out.println("the number is not magic");
		}
		
	}
}
