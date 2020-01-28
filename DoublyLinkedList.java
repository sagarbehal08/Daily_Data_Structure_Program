package Assignment;

public class DoublyLinkedList {
	private class Node {
		int data;
		Node next;
		Node prev;
	}

	private Node head;
	private Node tail;
	private int size;
	
	public void addLast(int item) {
		// create a new Node
		Node nn = new Node();
		nn.data = item;
		nn.prev=null;
		nn.next = null;

		// attach Node
		if (this.size >= 1) {
			this.tail.next = nn;
			nn.prev=this.tail;
		}

		// summary object
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}
	}
	
	public void pairs( int k) {
		pairs(this.tail,k);
	}
	private void pairs(Node temp,int k)
	{ if(temp==null)
	{
		return;
	}
	     int x=find(temp,temp.prev, k);
	     if(x!=0)
	     {
	    	 System.out.print("( "+temp.data+", "+x+" ), ");
	     }
	     
	     pairs(temp.prev,k);
	}
	private int find(Node temp,Node back,int k)
	{
		if(back==null)
		{
			return 0;
		}
		if(temp.data+back.data==k)
		{
			return back.data;
		}
		return find(temp,back.prev,k);
	}
	
	public static void main(String args[])
	{
		DoublyLinkedList li=new DoublyLinkedList();
		li.addLast(1);
		li.addLast(2);
//		li.addLast(3);
		li.addLast(4);
		li.addLast(5);
		li.addLast(6);
		li.addLast(8);
		li.addLast(9);
		li.pairs(7);
		
	}
}
