package Assignment;

public class AddTwoNumberAsList {
	import java.util.Scanner;
	public class AddTwoNumbersAsList {
		Node head;
		static class Node
		{
			int data;
			Node next;
			Node(int d)
			{
				data=d;
			}
			
		}
		public static AddTwoNumbersAsList insert(AddTwoNumbersAsList li,int data)
		{
			Node newNode=new Node(data);
			newNode.next=null;
			if(li.head == null)
			li.head=newNode;
			else
			{
				Node last=li.head;
				while(last.next!=null)
				{
					last=last.next;
				}
				last.next=newNode;
			}
			return li;
		}
		public static AddTwoNumbersAsList sum(AddTwoNumbersAsList li1, AddTwoNumbersAsList li2)
		{
			int n1=0, n2=0, i=0;
			Node temp1=li1.head;
			while(temp1!=null)
			{
				n1=n1+(int)(temp1.data*Math.pow(10,i));
				i++;
				temp1=temp1.next;
			}
			i=0;
			Node temp2=li2.head;
			while(temp2!=null)
			{
				n2=n2+(int)(temp2.data*Math.pow(10,i));
				i++;
				temp2=temp2.next;
			}
			AddTwoNumbersAsList li=new AddTwoNumbersAsList();
			int sum=n1+n2;
			while(sum!=0)
			{
				li.insert(li, sum%10);
				sum=sum/10;
			}
			return li;
		}
		public static void display(AddTwoNumbersAsList li)
		{
			Node temp=li.head;
			System.out.println("OUTPUT ==>");
			while(temp.next!=null)
			{
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.print(temp.data);
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			AddTwoNumbersAsList li1=new AddTwoNumbersAsList();
			AddTwoNumbersAsList li2=new AddTwoNumbersAsList();
			AddTwoNumbersAsList li3=new AddTwoNumbersAsList();
			System.out.println("Enter the number of elements in linked list 1:");
			int num1=sc.nextInt();
			System.out.println("Enter the elements in linked list 1:");
			for(int i=0;i<num1;i++)
			{
				li1.insert(li1,sc.nextInt());
			}
			System.out.println("Enter the number of elements in linked list 2:");
			int num2=sc.nextInt();
			System.out.println("Enter the elements of linked list 2:");
			for(int i=0;i<num2;i++)
			{
				li2.insert(li2,sc.nextInt());
			}
			li3=sum(li1,li2);
			display(li3);
			sc.close();
		}
	}
}
