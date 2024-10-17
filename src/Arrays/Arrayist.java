package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrayist {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>(10);
		
//		list.add(67);
//		list.add(65);
//		list.add(32);
//		list.add(52);
//		list.add(43);
//		list.add(97);
//		
//		System.out.println(list.contains(67));
//		
//		list.set(0,99);
//		list.remove(2);
//		System.out.println(list);
		System.out.println("Add the Elements in Array List");
		//input
		for(int i = 0; i<10 ;i++)
		{
			list.add(sc.nextInt());
		}
		//get at item at any index
		for(int i = 0; i<10 ;i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println(list);
	}

}
