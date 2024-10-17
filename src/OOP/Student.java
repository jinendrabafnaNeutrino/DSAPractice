package OOP;

public class Student 
{
	int rollno;
	String name;
	float marks = 90;
	
	
	Student()
	{
		this.rollno	= 20;
		this.name = "Jay";
		this.marks = 100;
	}
	
	void greeting()
	{	
		System.out.println("Hello my name is "+this.name);
		
	}
	
	

	
	public static void main(String [] args)
	{
		Student kunal = new Student();
		kunal.greeting();
		
		
	}
}
