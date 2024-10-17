package blueflame;

class Geek
{
	Geek(String name)
	{
		System.out.println("My name is "+name);
	}
	Geek(String name, int age)
	{
		System.out.println("My name is "+name+" and is "+age);
	}
	
	Geek(int id)
	{
		System.out.println("my id "+id);
	}
}


public class constr {

	public static void main(String[] args) 
	{
		Geek geek2 = new Geek("Jay");
		Geek geek3 = new Geek("Jay",22);
		Geek geek4 = new Geek(1234556);

	}

}
