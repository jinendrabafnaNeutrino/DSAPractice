package LinkedList;

public class LinkedLis 
{
	private Node Head;
	private Node Tail;
	
	private int size;

	public LinkedLis()
	{
		this.size = size;
	}
	public class Node
	{
	
		 private int val;
		 private Node next;
		 
		 public Node(int val)
		 {
			 this.val = val;
		 }
		 public Node(int val , Node next)
		 {
			  this.val = val;
			  this.next = next;
		 }
	}
	public void insert(int val)
	{
		Node node = new Node(val);
		node.next = Head; 
		Head = node; 	
		if(Tail == null)
		{
			Tail = Head;
		}
		size +=1;
	}
	public void insertlast(int val)
	{
		if(Tail == null)
		{
			insert(val);
			return;
		}
		Node node = new Node(val);
		Tail.next = node;
		Tail = node;
		size++;
	}
	public void insertindex(int val, int index)
	{
		if(index == 0)
		{
			insert(val);
			return;
		}
		if(index ==size)
		{
			insertlast(val);
			return;
		}
		Node temp = Head;
		for(int i = 1 ; i<index;i++)
		{
			temp = temp.next;
		}
		
		
		
		Node node = new Node(val, temp.next);
		temp.next = node;
		size++;
		
		
	}
	
	public int deletefirst()
	{
		int val = Head.val;
		Head= Head.next;
		if(Head== null)
		{
			Tail = null;
		}
		size--;
		return val;
	}
	public int deleteLast() {
        if (size <= 1) {
            return deletefirst();
        }

        Node secondLast = get(size - 2);
        int val = Tail.val;
        Tail = secondLast;
        Tail.next = null;
        size--;
        return val;
    }
	public Node get(int index)
	{
		Node node = Head;
		for(int i = 0 ; i< index ; i++)
		{
			node = node.next;
		}
		return node;
			
	}
	 public int delete(int index) {
	        if (index == 0) {
	            return deletefirst();
	        }
	        if (index == size - 1) {
	            return deleteLast();
	        }

	        Node prev = get(index - 1);
	        int val = prev.next.val;

	        prev.next = prev.next.next;
	        size--;
	        return val;
	    }
	 public Node find(int value) {
	        Node node = Head;
	        while (node != null) {
	            if (node.val == value) {
	                return node;
	            }
	            node = node.next;
	        }
	        return null;
	    }
	
	
	
	public void display()
	{
		Node temp = Head;
		while(temp != null)
		{
			System.out.print(temp.val+"-> ");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
}
