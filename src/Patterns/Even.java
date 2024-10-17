package Patterns;
import java.util.*;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("The Number is Even "+ n);
		}
		else
		{
			System.out.println("The Number is Odd "+ n);
		}

	}

}
