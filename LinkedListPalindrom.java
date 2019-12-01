package Assignment;

import java.util.Scanner;

public class LinkedListPalindrom {
 static Node head;
 static String str="";
 static String str1="";
	static public class Node{
	 int data;
	 Node next;
	 Node(int d)
	 {
		 data=d;
	 }
 }
	public static LinkedListPalindrom insert(LinkedListPalindrom li,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(li.head==null)
		{
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
		}
		return li;
	}
	public static void display(LinkedListPalindrom li)
	{
		Node temp=li.head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
	}
	public static void convertToString(Node temp)
	{
		if(temp==null)
		{
			return;
		}
		str=str+temp.data;
		convertToString(temp.next);
//		System.out.print(temp.data+"-->");
		str1=str1+temp.data;
	}
	public static void main(String args[])
	{  Scanner o=new Scanner(System.in);
		LinkedListPalindrom li=new LinkedListPalindrom();
	    System.out.println("Enter the number of values you want to enter ==> ");
	    int t=o.nextInt();
	    System.out.println("Enter numbers ==> ");
	    for(int i=0;i<t;i++)
	    {
	    	li.insert(li, o.nextInt());
	    }
	   
	    li.convertToString(li.head);
	    //System.out.println("String 1");
		if(str.equals(str1))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not a Palindrom");
		}
		
		
	}
}
