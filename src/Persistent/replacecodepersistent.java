package Persistent;
import java.util.Scanner;
public class replacecodepersistent 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x ,y;
		int length = sc.nextInt();
		int arr [] = new int[length];
		int flag =0;
		
		for(x =0; x<arr.length;x++)
		{
			for(y = x+1;y<arr.length;y++)
			{
				if(arr[x]==arr[y] && flag==0)
				{
					System.out.println(arr[y]);
					flag = 1;
					break;
				}
				
			}
			
		}
		System.out.println(arr);
		
		
	}
}
