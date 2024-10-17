package LinkedList;

public class Main {

	public static void main(String[] args) 
	{
		LinkedLis list = new LinkedLis();
		list.insert(3);
		list.insert(2);
		list.insert(8);
		list.insert(17);
		list.insertlast(99);
		list.insertindex(100, 3);
		list.display();
		
		System.out.println(list.deletefirst());
		System.out.println(list.deleteLast());
		System.out.println(list.delete(2));
		//System.out.println(list.find(3));
		
		
		
		list.display();
		
	}

}
