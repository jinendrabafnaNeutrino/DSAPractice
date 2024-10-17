package Sorting;

import java.util.Scanner;

class KnapSack {
	static int max(int a , int b )
	{
		//it returns the maximum value that 
		//can be put in a knapsack of capacity W=(weight)
		return(a>b) ? a:b;
	}
	static int knapsack(int w , int wt[] , int val [], int n)
	{
		if(n==0 || w==0)
		{
			return - 1;
		}
		
		if(wt[n-1] > w)
		{
			return knapsack(w,wt,val,n-1);
		}
		else
		{
			return max(val[n - 1]+ knapsack(w - wt[n - 1], wt,val, n - 1),knapsack(w, wt, val, n - 1));
		}
	}
	
    public static void main(String [] args)
    {
    	Scanner sc = new Scanner(System.in);
    	int val[] = new int[10];
    	for(int i =0; i<val.length;i++)
    	{
    		val[i] = sc.nextInt();
    	}
        int wt[] = new int[10];
        for(int i =0; i<wt.length;i++)
    	{
    		wt[i] = sc.nextInt();
    	}
        int W = sc.nextInt();
        int n = val.length;
        System.out.println(knapsack(W, wt, val, n));
    }
}
