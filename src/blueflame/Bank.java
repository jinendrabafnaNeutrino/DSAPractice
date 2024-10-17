package blueflame;
import java.util.Scanner;



public class Bank {
	Scanner sc = new Scanner(System.in);
		void currentbalance()
		{
			
			int balance = sc.nextInt();
			
		}
		void withdraw()
		{
			int wd = sc.nextInt();
			
		}
		
	public	int  checkbalane(int balance , int wd)
		{
			return balance - wd;
		}

	public static void main(String[] args) 
	{
		
		Bank obj = new Bank();
		obj.currentbalance();
		obj.withdraw();
		obj.checkbalane(1000, 500);

	}

}
