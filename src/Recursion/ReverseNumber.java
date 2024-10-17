package Recursion;

public class ReverseNumber {
	static int sum =0;
	static void revnumber(int n)
	{
		if(n==0)
		{
			return ;
		}
		int rem = n %10;
		sum = sum *10 +rem;
		revnumber(n/10);
	}
	public static void main(String[] args) 
	{
		 revnumber(1234);
		 System.out.println(sum);
		
	}

}
