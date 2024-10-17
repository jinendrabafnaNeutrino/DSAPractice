package Arrays;

import java.util.Arrays;

public class Arrayswap {

	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		//swap(arr, 1 , 3);
		arrayreverse(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void arrayreverse(int [] arr)
	{
		int start = 0 ;
		int end = arr.length - 1;
		
		while(start < end)
		{
			//Swap
			swap(arr,start,end);
			start++;
			end--;
		}
	}
	
	static void swap(int[] arr , int index1 , int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
