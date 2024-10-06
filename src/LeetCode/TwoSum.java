package LeetCode;

import java.util.Scanner;

public class TwoSum {

    //LeetCode Link : https://leetcode.com/problems/two-sum/description/
        public int[] getTwoSum(int[] nums, int target) {

            int arr[]=new int[2];
            for(int i =0;i<nums.length;i++){
                for(int j = i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        arr[0]=i;
                        arr[1]=j;
                    }
                }
            }
            return arr;
        }

    public static void main(String [] args){
            Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array");
        int num = sc.nextInt();
        System.out.println("<----------------------->");
        int [] arr = new int[num];
        System.out.println("Enter Elements in Array");
        for(int i =0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("<----------------------->");
        System.out.println("Enter Target Sum");
        int target = sc.nextInt();

        TwoSum twoSum = new TwoSum();

        int [] result = twoSum.getTwoSum(arr,target);

        // Print the result
        if (result[0] == 0 && result[1] == 0) {
            System.out.println("No two numbers add up to the target.");
        } else {
            System.out.println("Indices of the two numbers are: " + result[0] + " and " + result[1]);
        }

    }
}
