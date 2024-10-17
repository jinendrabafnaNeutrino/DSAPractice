package Persistent;

public class Porductofnumbers 
{
	static int getproduct(int n)
	{
		int product = 1;
		while(n !=0)
		{
			product = product * (n % 10);
			  n = n / 10;	
		}
		return product;
	}
	public static void main(String [] args)
	{
		int n = 1234;
		System.out.println(getproduct(n));
	}
}
