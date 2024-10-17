package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		arr[0] = 23;
		arr[1] = 45;
		arr[2] = 233;
		arr[3] = 544;
		arr[4] = 3;
		
		System.out.println(arr[3]);
		
		//Input using loop
		for(int i = 0 ; i< arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0 ; i< arr.length;i++)
		{
		   System.out.println(arr[i] + " ");
		}
		
	}

}
