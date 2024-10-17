package LinearSearch;

public class Searchigtheelement {

	public static void main(String[] args) 
	{
		int [] arr = {23,45,1,2,8,19,-3,16,-11,28};
		int target = 28;
		int ans = linearsearch2(arr , target);
		System.out.println(ans);
		
	
	}
	
	static int linearsearch2(int [] arr , int target)
	{
		if (arr.length == 0)
		{
			return -1;
		}
		
		for( int element : arr)
		{
			if(element == target)
			{
				return element;
			}
			
		}
		return Integer.MAX_VALUE;
		
		
	}

}
