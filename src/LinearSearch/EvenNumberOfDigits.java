package LinearSearch;
//leetcode
//// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenNumberOfDigits {
	public static void main(String [] args)
	{
		int [] nums = {12,345,2,6,7896};
		System.out.println(findnumbers(nums));	
		//System.out.println(digits(-123456));  //running the digits function
		//System.out.println(digits2(-123456));
	}
	
	static int findnumbers(int [] nums)
	{
		int count = 0;
		for(int num :nums)
		{
			if(even(num))
			{
				count++;
			}
		}
		return count;
		
	}
	//check even numbers
	static boolean even(int num)
	{
		int numberofdigits = digits(num);
		return numberofdigits %2==0;
	}
	//cout the numbers
	static int digits(int num)
	{
		//for negative number
		if (num < 0)
		{
			num = num * -1;
		}
		if (num == 0)
		{
			return 1;
		}
		
		int count = 0 ;
		while(num > 0)
		{
		num = num/10;
		count++;
		}
		return count;
	}
	//fast check for the count in number of digits 
	//optimization
	static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }	
	
}
