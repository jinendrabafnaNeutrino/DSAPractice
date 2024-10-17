package Persistent;

import java.util.Scanner;
class AutometaCode
{
    public static  void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	int length = sc.nextInt();
    	int start = sc.nextInt();
    	int end = sc.nextInt();
    	
    	int arr [] = new int[length];
    	
    	for(int i = 0 ; i<length;i++)
    	{
    		arr[i] = sc.nextInt();
    	}
    	
    	for(int i = 0 ; i<length;i++)
    	{
    		if(arr[i]>=start && arr[i]<end)
    		{
    			System.out.println(i+" ");
    		}
    	}
       
       
    }
}