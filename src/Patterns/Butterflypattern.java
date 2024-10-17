package Patterns;

public class Butterflypattern {

	public static void main(String[] args) {
		
		int n = 4 ;
		//first part
		for(int i = 1 ; i<=n; i++)
		{
			//print first part stars
			for(int j = 1 ; j<=i; j++)
			{
				System.out.print("*");
			}
			//print spaces
			int spaces = 2 * (n-i);                          
			for(int j = 1 ; j<=spaces; j++)
			{
				System.out.print(" ");
			}
			//print 2 part stars 
			for(int j = 1 ;j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//second part
		
		for(int i=n; i>=1; i--) {
			//print first stars
	           for(int j=1; j<=i; j++) {
	               System.out.print("*");
	           }
	           //print spaces
	           int spaces = 2 * (n-i);
	           for(int j=1; j<=spaces; j++) {
	               System.out.print(" ");
	           }
	           //second part stars
	           for(int j=1; j<=i; j++) {
	               System.out.print("*");
	           }
	           System.out.println();
	       }

		

	}

}
