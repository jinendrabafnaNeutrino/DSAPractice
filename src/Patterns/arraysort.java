package Patterns;

import java.util.Arrays;
public class arraysort
{
	public static int search(int array[], int key)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i]==key)
				return i;
		}
		return -1;
	}

	public static void main (String [] args)
	{
		int a1[] = new int[] {3,2,6,9,8,1};

		for(int i = 0 ; i < a1.length;i++)
		{
			
			System.out.print(a1[i]);
		}
		Arrays.sort(a1);
		System.out.println();
		for(int i = 0 ; i < a1.length;i++)
		{
				
			 System.out.print(a1[i]);
		}

		int index =  search(a1,11);
		if(index == -1)
		{
			System.out.println("Element not FOund");
		}
		else
		{
			System.out.println("Element is found and is at index "+index);
		}




}		
}


