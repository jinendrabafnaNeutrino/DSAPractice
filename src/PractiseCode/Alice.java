package PractiseCode;

public class Alice 
{
	public static void main(String[] args) 
	{
		int [] arr  = {1,2,3,4,5};
		System.out.println(count1(arr));
	}
	
	static int count1(int [] arr)
	{
		int count = 1;
		for(int i = 0 ; i<arr.length-1;i++)
		{
			
			if(arr[i] < arr[i+1])
			{
			   count++;
			}
			
		}
		return count;
	}
}
