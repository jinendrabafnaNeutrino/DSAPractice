package Recursion;

public class Main 
{
  static void fun(int n)
  {
	  if(n==0)
	  {
		  return;
	  }
	  
	  fun(n-1);
	  System.out.print(" "+n);
  }
  static void funrev(int n)
  {
	  if(n==0)
	  {
		  return;
	  }
	  System.out.println(n);
	  funrev(n-1);
	  System.out.println(n); 
  }
  
  public static void main(String [] args)
  {
	  funrev(5);
	  //fun(5);
  }

}
