package Assignment;

import java.util.Scanner;

import Assignment.Rem_Dup_LL.Node;

public class RotateLinkedList {
	static Node head;
	 public static class Node
	 {
		 int data;
		 Node next;
		 Node(int d)
		 {
			 data=d;
		 }
	 }
	 public static RotateLinkedList insert(RotateLinkedList li,int data)
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
	 public static void rotate(RotateLinkedList li,int k)
	 {
		 while(k>0) {
		 Node temp=li.head;
		 while(temp.next.next!=null)
		 {
			 temp=temp.next;
		 }
		 int v=temp.next.data;
		 temp.next=null;
		 Node newNode=new Node(v);
		 newNode.next=li.head;
		 li.head=newNode;
		 k--;
		 }
		 
	 }
	 public static void display(RotateLinkedList li)
	 {
		 Node temp=li.head;
		 while(temp.next!=null)
		 {   System.out.print(temp.data+" ");
			 temp=temp.next;
		 }
		 System.out.println(temp.data);
		 
	 }
	 public static void main(String args[])
	 {
		 Scanner o=new Scanner(System.in);
		 RotateLinkedList li=new RotateLinkedList();
		 System.out.println("Enter inputs => ");
				 int t=o.nextInt();
				 System.out.println("Enter numbers => ");
				 for(int i=0;i<t;i++)
				 {
					 li.insert(li, o.nextInt());
				 }
				 System.out.println("Enter value of k =>");
				 int k=o.nextInt();
				 rotate(li,k);
				 System.out.println("Display => ");
				 display(li);
	 }
}
