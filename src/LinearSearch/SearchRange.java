package LinearSearch;

public class SearchRange {

	public static void main(String[] args) 
	{
		int [] arr= {18, 12, -7, 3, 14, 28};
        int target = -7;
        System.out.println(linear(arr, target , 1 , 4));
	}

	private static int linear(int[] arr, int target, int start, int end) 
	{
		if(arr.length==0)
		{
			return -1;
		}
		
		for(int index = start ; index<=end; index++)
		{
			int element = arr[index];
			if(element == target)
			{
				//return element;
				return index;
			}
		}
		return -1;
	}

	
}
