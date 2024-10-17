package OOP;
import java.util.Scanner;

public class Evenoddwithoutifelse {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String [] evenodd = {"Even", "Odd"};
		
		System.out.println("The number "+n+" is "+evenodd[n%2]+" number");
	}

}
