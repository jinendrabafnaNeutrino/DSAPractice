package Functions;

import java.util.Scanner;

public class Sumofnumber {
	
	//public static int CalculateSum(int a , int b)
	//{
		//int sum = a + b;
		//return sum;
	//}
	
	public static int Multiply(int a , int b )
	{
		return a*b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a =  sc.nextInt();
		int b =  sc.nextInt();
		//int sum = CalculateSum(a,b);
		System.out.println("The Product  of two numbers is "+ Multiply(a,b));

	}

}
