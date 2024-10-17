package PractiseCode;
import java.util.Scanner;

public class MinMAxInArray 
{
 public static void main(String[] args)
 {
	// Scanner sc = new Scanner(System.in);
	 int [] arr = {1,2,3,4,5,6,7,8,9,10};
	 int min = Integer.MAX_VALUE;
	 int max = Integer.MIN_VALUE;
	 
	 for(int i = 0 ; i<=9 ; i++)
	 {
		// arr[i] = sc.nextInt();
		 if(arr[i] < min)
		 {
			 min = arr[i];
		 }
		 if(arr[i] > max)
		 {
			 max = arr[i];
		 }
		 
	 }
	 
	 System.out.println("Max element in " + max);
	 System.out.println("Min element in" + min);
	 
	 
	 
	 	
 }
}
