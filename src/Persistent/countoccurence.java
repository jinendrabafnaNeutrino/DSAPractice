package Persistent;

import java.util.Arrays;
class countoccurence
{
    public static void main(String [] args)
    {
        int [] arr ={8, 6, 8, 10, 8, 20, 10,  20};
        int target = 20;
        int ans = findcount(arr,target);
        System.out.println(ans+" times the number is occured in the array");
        
        
    }
    static int findcount(int [] arr , int target)
    {
        int count = 0;
        for(int i = 0 ; i<arr.length;i++)
        {
            if(target == arr[i])
            {
                count++;
            }
        }
        return count;
    }
    
}