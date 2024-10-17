package PractiseCode;
import java.util.Arrays;

public class SecondlargestNumber 
{
	public static void main(String args[])
	{
			int arr [] = {2, 8, 1, 3, 6, 7, 5, 4};
			
			System.out.println("Second Largest: "+getSecondLargest(arr));
	}

	 static int getSecondLargest(int[] arr) 
	 {
//		int temp ;
		int total = arr.length;
		Arrays.sort(arr);
		
		

		//		for(int i = 0 ; i< total; i++)
//		{
//			for(int j = i+1; j<total ; j++)
//			{
//				if(arr[i] > arr[j])
//				{
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		return arr[total - 1];	
	}
	 

}
