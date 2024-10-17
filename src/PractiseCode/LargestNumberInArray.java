package PractiseCode;
import java.util.Arrays;
public class LargestNumberInArray 
{
	public static void main(String [] args)
	{
		int [] a = {1,2,3,4,5,6};
		
		System.out.println("Largest Number " + getlargest(a,6));
	}
	static int getlargest(int []a , int total)
	{
		Arrays.sort(a);
		return a [total -3];
	}
}
