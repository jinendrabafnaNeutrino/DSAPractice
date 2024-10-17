package BinarySearch;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstandLastPosition {

	public static void main(String[] args) 
	{
	
	}
	
	 public int[] searchRange(int[] nums, int target) 
	    {
	        int [] ans = {-1,-1};
	        int start = search(nums,target,true);
	        int end = search(nums,target,false);
	        ans[0] = start;
	        ans[1] =end;
	        return ans;
	    }
	    
	    public int search(int [] nums , int target , boolean startofindex)
	    {
	       int ans = -1;
	        int start = 0;
	        int end = nums.length - 1;
	        while(start <= end) {
	            // find the middle element
//	            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
	            int mid = start + (end - start) / 2;

	            if (target < nums[mid]) {
	                end = mid - 1;
	            } else if (target > nums[mid]) {
	                start = mid + 1;
	            } else {
	                // potential ans found
	                ans = mid;
	                if (startofindex) {
	                    end = mid - 1;
	                } else {
	                    start = mid + 1;
	                }
	            }
	        }
	        return ans;
	    }
	}