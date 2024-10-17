package Patterns;

public class ArraySolution
{
	public static void main(String[] args)
	{
		int [] a1 = new int [10];
		int count = 0;

		for(int i = 0 ; i < a1.length;i++)
		{
			a1[i] = count;
			count++;
		}
		for(int j =0;j < a1.length;j++)
		{
			System.out.print(a1[j]+" ");
		}


	}
}