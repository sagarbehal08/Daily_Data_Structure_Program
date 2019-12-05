package Assignment;

import java.util.LinkedList;
import java.util.Stack;

public class QueueUsingStack {
	static Stack <Integer>s1=new Stack<>();
	static Stack <Integer>s2=new Stack<>();
	public static void enQueue(int data)
	{
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		s1.push(data);
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
	}
	public static int dequeue()
	{
		if(s1.isEmpty()) {
		  System.out.println("Queue is empty");
		  
		}
		int x=s1.peek();
		s1.pop();
		return x;
		
	}
	public static void main(String[] args) {
		QueueUsingStack q=new QueueUsingStack();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}
