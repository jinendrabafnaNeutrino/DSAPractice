package Sorting;
import java.util.Arrays;
class Main
{
    public static void main(String [] args)
    {
        int [] arr = {9,8,7,6,5,4,3,2,1};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
    static void quicksort(int [] arr,int low,int high)
    {
        if(low > high)
        {
            return;
        }
        
        int start = low;
        int end =high;
        int pivot = arr[start+(end-start)/2];
        
        while(start <= end)
        {
            while(arr[start] < pivot)
            {
                start++;
            }
            while(arr[end] > pivot)
            {
                end--;
            }
            
            if(start <=end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        quicksort(arr,low,end);
        quicksort(arr,start,high);   
    }
}