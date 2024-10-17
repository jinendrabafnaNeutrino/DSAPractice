package blueflame;

import java.util.*;
public class  Uniquehash
{
    static void printdistinct(int [] arr)
    {
         HashSet<Integer> set = new HashSet<>();
 
        
        for(int i = 0 ; i<arr.length;i++)
        {
            if(!set.contains(arr[i]))
            {
                set.add(arr[i]);
                System.out.print(arr[i]+" ");
            }
        }
    }    
    public static void main(String [] args)
    {
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
     
        printdistinct(arr);
    }
}