package blueflame;

class helper 
{
	static int mul(int a , int b)
	{
		return a*b;
	}
	
	static int mul(int a , int b , int c)
	{
		return a*b*c;
	}
}

public class GFG {

	public static void main(String[] args) 
	{
		System.out.println(helper.mul(2,4));
		
		System.out.println(helper.mul(2,4,6));
		
	}

}
