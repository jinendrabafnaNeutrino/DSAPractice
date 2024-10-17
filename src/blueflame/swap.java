package blueflame;


public class swap 
{
	public static void main(String [] args)
	{
		int x = 23;
		int y = 48;
		
		System.out.println("before swap"+x+y);
		
		x = x + y;
		y = x -y;
		x = x - y;
		System.out.println("after swap" +x+y);
		
		//three vairiable swap
		
		int temp = x;
				x = y;
				y = temp;
				
				
				
	}
	
	
}
