package StacQueue;

import java.util.*;

public class QueueMain 
{
	public static void main(String [] args)
	{
		Queue<Integer> queue = new LinkedList<>();
		queue.add(3);
		queue.add(6);
		queue.add(9);
		queue.add(19);
		queue.add(1);
		queue.add(21);
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());

		
	}
}
