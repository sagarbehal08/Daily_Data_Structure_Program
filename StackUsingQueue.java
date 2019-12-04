package Assignment;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	static Queue <Integer>q1=new LinkedList<>();
	static Queue <Integer>q2=new LinkedList<>();
	public static void push(int data) {
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		q1.add(data);
		while(!q2.isEmpty()) {
			q1.add(q2.poll());
		}
	}
	public static void pop() {
		q1.remove();
	}
	public static void peek() {
		System.out.println(q1.element());
		System.out.println(q1);
	}
	public static void main(String[] args) {
		StackUsingQueue s1=new StackUsingQueue();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.pop();
		s1.peek();
	}
}