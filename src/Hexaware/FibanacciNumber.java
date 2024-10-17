package Hexaware;

public class FibanacciNumber 
{
	public static void main(String [] args)
	{
		int max = 10 ;
		
		int a = 0 ;
		int b = 1;
		
		System.out.println("Fibanacci Series of "+max+" Numbers");
		
		for(int i= 0 ; i <= max; i++)
		{
			System.out.print(" "+a);
			//System.out.println();
			int temp = a + b;
			a = b;
			b = temp;
			
		}
		
		
		
	}
}
