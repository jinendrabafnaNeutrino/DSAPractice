package Hexaware;
import java.util.Scanner;

public class factorial 
{
  public static void main(String [] args)
  {
	  Scanner sc = new Scanner(System.in);
	  int i;
	  int fact =  1;
	  int n = sc.nextInt();
	  
	  for( i = 1 ; i<=n;i++)
	  {
		   fact = fact *i ;
	  }
	  System.out.println("Factorial of "+n+" is: "+fact);  
  }
}
