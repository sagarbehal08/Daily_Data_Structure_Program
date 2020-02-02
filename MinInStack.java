package Assignment;

import java.util.Stack;

class MinInStack {
	Stack<Integer> s;
	int minlen;

	MinInStack() {
		s = new Stack<>();
	}

	void getMin() {
		if (s.isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println("Min Element in Stack is " + minlen);
		}
	}

	void peek() {
		if (s.isEmpty()) {
			System.out.println("Stack is Empty");
		}
		int t = s.peek();
		if (t < minlen) {
			System.out.println(minlen);
		} else {
			System.out.println(t);
		}

	}

	void pop() {
		if (s.isEmpty()) {
			System.out.println("Stack is Empty");
		}
		int t = s.pop();
		if (t < minlen) {
			System.out.println(minlen);
			minlen = 2 * minlen - t;
		} else {
			System.out.println(t);
		}
	}

	void push(int x) {
		if (s.isEmpty()) {
			minlen = x;
			s.push(x);
			System.out.println("Number inserted=");
			return;
		}
		if (x < minlen) {
			s.push(2 * x - minlen);
			minlen = x;
		} else {
			s.push(x);
		}
	}
}

class Main {

	public static void main(String[] args) {

		MinInStack s = new MinInStack();
		s.push(3);
		s.push(5);
		s.getMin();
	}

}
