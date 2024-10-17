package Recursion;

public class fibonaccinumberrecursion 
{
 public static void main(String [] args)	
 {
	int max = 10;
	System.out.println("Fib series " +max+" Numbers: ");
	for(int i = 0 ; i<max ; i++)
	{
		System.out.print(fib(i)+ " ");
	}
//	System.out.println();
//	System.out.println(fib(4));
 }
 
 static int fib(int n)
 {
	 if(n < 2)
	 {
		 return n;
	 }	 
	 return fib(n-1) + fib(n-2);
 }
}
