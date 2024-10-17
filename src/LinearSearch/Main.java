package LinearSearch;

public class Main {

	public static void main(String[] args) 
	{
		int [] nums = {23,45,1,2,8,19,-3,16,-11,28};
		int target = 19;
		int ans = linearsearch(nums,target);
		System.out.println(ans);
	}
	
	//search the array : we return the index if item found
	//other wise item not found  return -1
	static int linearsearch(int [] arr , int target)
	{
		if(arr.length == 0)
		{
			return -1;
		}
		
		for(int index = 0 ; index< arr.length; index++)
		{
			//check for every element at every index if its equal to target we wanna search
			int element  = arr[index];
			if(element == target)
			{
				return index;
			}
			
			
		}
		return -1;
		
	}

}
