package OOP;

class Area
{
	int length;
	int breadth;
	
	Area(int length, int breadth)
	{
		this.length	= length;
		this.breadth = breadth;
	}
	
	public void getArea()
	{
		int area = length*breadth;
		System.out.println(area);
	}
}

public class Encap {

	public static void main(String[] args) 
	{
		Area Rectangle = new Area(5,10);
		Rectangle.getArea();
		
	}

}
