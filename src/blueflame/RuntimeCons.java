package blueflame;

class parent 
{
	void print()
	{
		System.out.println("Parent class");
	}

}

class subclass extends parent
{
	void print()
	{
		System.out.println("Subclass1");
	}

}

class subclass2 extends parent
{
	void print()
	{
		System.out.println("Subclass3");
	}
}



public class RuntimeCons {

	public static void main(String[] args) 
	{
		parent  s;
		s = new parent();
		s.print();

		s = new subclass();
		s.print();
		
		s = new subclass2();
		s.print();	
				
		

	}

}
