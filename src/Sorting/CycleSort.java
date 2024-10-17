package Sorting;
import java.util.Arrays;

public class CycleSort  
{
	public static void main(String [] args)
	{
		int [] arr= {3,5,2,1,4};
		cycle(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void cycle(int [] arr)
	{
		int i =0;
		while(i < arr.length)
		{
			int correct = arr[i]-1;
			if(arr[i]!= arr[correct])
			{
				swap(arr,i,correct);
			}
			else
				i++;
			
		}
	}

	 static void swap(int[] arr, int a, int b) 
	 {		
		 int temp = arr[a];
		 arr[a] = arr[b];
		 arr[b] = temp;
	 }
	
}
 