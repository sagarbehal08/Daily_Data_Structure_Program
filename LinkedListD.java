package Assignment;

import java.util.Scanner;


public class LinkedListD {
	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;
	
	public void addLast(int item) {
		// create a new Node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach Node
		if (this.size >= 1) {
			this.tail.next = nn;
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
	
	public Node getNodeAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}
		if (idx < 0 || this.size <= idx) {
			throw new Exception("Invalid Index.");
		}
		Node temp = this.head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp;

	}
	public void makeCircular(int ni) throws Exception
	{
		Node node=getNodeAt(ni-1);
		this.tail.next=node;
		System.out.println(detectLoop());
	}
	private String detectLoop()
	{
		Node slow=this.head;
		Node fast=this.head;
		while(slow!=null || fast!=null || fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				return "True";
			}
		}
		return "False";
	}
	public static void main(String[] args) throws Exception {
		Scanner o=new Scanner(System.in);
		System.out.println("Enter the test cases=>");
		int t=o.nextInt();
		for(int i=0;i<t;i++)
		{
			LinkedListD li=new LinkedListD();
			
			System.out.println("Enter size of linkedlist"+(i+1)+" => ");
			int n=o.nextInt();
			System.out.println("Enter the values=> ");
			for(int j=0;j<n;j++)
			{
				li.addLast(o.nextInt());
			}
			System.out.println("Enter the makeCircularLinkedList => ");
			int pos=o.nextInt();
			System.out.print("Output=>");
			if(pos>0) {
			li.makeCircular(pos);
			}
			else
			{
				System.out.println("False");
			}
		
			
			
		}
		

	}

}
