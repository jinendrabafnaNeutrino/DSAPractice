package Sorting;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/
//google question
public class FindAllDisappearedNumberArray {
	
	static List<Integer> findmissingindex(int [] nums)
	{
		int i = 0;
			 
		while(i < nums.length)
		{
			int correct =  nums[i] -1;
			if(nums[i] != nums[correct])
			{
				swap(nums,i,correct);
			}
			else
				i++;
		}
		
		List<Integer> ans = new ArrayList<>();
		for(int index = 0 ; index<nums.length ; index++)
		{
			if(nums[index] != index +1)
			{
				 ans.add(index+1);
			}
		}
		return ans;
	}
 static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
		
	}

}
