package Assignment;

import java.awt.image.renderable.RenderableImage;
import java.util.Scanner;

public class Rem_Dup_LL {
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
 public static Rem_Dup_LL insert(Rem_Dup_LL li,int data)
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
 
 public static void removeDup(Rem_Dup_LL li)
 { int count=0;
	 Node temp=li.head;
	 while(temp!=null)
	 {
		 Node temp1=temp.next;
		 Node temp2=temp;
		 while(temp1!=null)
		 {
			 if(temp.data==temp1.data)
			 {
				 count++;
				 temp2.next=temp1.next;
			 }
			 else
			 {
				 temp2=temp2.next;
			 }
				 
				 temp1=temp1.next;
		 }
		 temp=temp.next;
	 }
 }
 public static void display(Rem_Dup_LL li)
 {
	 Node temp=li.head;
	 while(temp!=null)
	 {   System.out.print(temp.data+"-->");
		 temp=temp.next;
	 }
	 
 }
 public static void main(String args[])
 {
	 Scanner o=new Scanner(System.in);
	 Rem_Dup_LL li=new Rem_Dup_LL();
	 System.out.println("Enter inputs => ");
			 int t=o.nextInt();
			 System.out.println("Enter numbers => ");
			 for(int i=0;i<t;i++)
			 {
				 li.insert(li, o.nextInt());
			 }
			 removeDup(li);
			 System.out.println("Display => ");
			 display(li);
 }
}
