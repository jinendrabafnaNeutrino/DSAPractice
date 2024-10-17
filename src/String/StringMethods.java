package String;
import java.util.*;

public class StringMethods {

	public static void main(String[] args) 
	{
		String name = "Jay Bafna Hello World";
		System.out.println(Arrays.toString(name.toCharArray()));
		name.length();
		System.out.println(name.indexOf('a'));
		System.out.println("           jay       ".strip());
		System.out.println(Arrays.toString(name.split(" ")));
		
		
	}

}
