package PractiseCode;

import java.util.Scanner;
class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;
        
        
        for(int i = 2 ; i<= num ; i++)
        {
            if(num %i==0)
            {
                flag = false;
                break;
            }
        }
        
        if(!flag)
        {
            System.out.println(num+" is  a prime number");
        }
        else
        {
            System.out.println(num+" is not a prime number");
        }
    }
}