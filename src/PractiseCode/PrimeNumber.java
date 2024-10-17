package PractiseCode;
import java.util.Scanner;


public class PrimeNumber 
{
   public static void main(String [] args)
   {
	   //Scanner sc = new Scanner(System.in);
	   int num = 12;
	   boolean flag = false;
	   
	   for(int i = 2 ; i <=num ; i++)
	   {	
		   if(num % i==0)
		   {
		   flag = true;
		   break;
		   }
	   }
	   
	   if(!flag)
	   
		   System.out.println(num + "the number is prime");
	   else
	   
		   System.out.println(num + "the number is not prime");
	   
	   
		   
   }
}
