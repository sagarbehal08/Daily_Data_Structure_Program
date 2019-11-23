package Assignment;

import java.util.Scanner;

public class ReverseDoublyLinkedList {
	static Node head;
	static class Node{
		int data;
		Node pre;
		Node next;
		Node(int d)
		{
			data=d;
		}
	}
		public static ReverseDoublyLinkedList insert(ReverseDoublyLinkedList li,int d)
		{
			Node newNode =new Node(d);
			newNode.next=null;
      		newNode.pre=null;
			if(li.head==null)
			{
				newNode.pre=null;
				li.head=newNode;
			}
			else
			{
				Node temp=li.head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=newNode;
				newNode.pre=temp;
			}
			return li;
		}
		public static void displayfor(ReverseDoublyLinkedList li)
		{
			Node temp=li.head;
			System.out.println("--------Dispaly Normal Linked List------------");
			while(temp.next!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			
			}
			System.out.print(temp.data);
			
		}
		
		public static void displayrev(ReverseDoublyLinkedList li)
		{
			Node temp=li.head;
			while(temp.next!=null)
			{
			
				temp=temp.next;
				
			}
			System.out.println("\n-------Display Reverse of Linked List-----------");
			
			while(temp.pre!=null)
			{
				
				System.out.print(temp.data+" ");
				temp=temp.pre;
			
			}
			System.out.print(temp.data);
			
		
			
		}
		
	
public static void main(String args[])
{
	ReverseDoublyLinkedList li=new ReverseDoublyLinkedList();
	Scanner o=new Scanner(System.in);
	System.out.println("Enter the size of LinkedList =>> ");
	int t=o.nextInt();
	System.out.println("Enter value in the LinkedList =>> ");
	for(int i=0;i<t;i++)
	{
		li.insert(li,o.nextInt());
	}
	li.displayfor(li);
	li.displayrev(li);
	
	
}
}
