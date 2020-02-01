package Assignment;

import java.util.Scanner;

public class LinkedListKM {
	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public Node head;
	private Node tail;
	private int size;

	public void insert(int data) {
		Node nn = new Node(data);
		nn.next = null;

		if (this.size > 0) {
			this.tail.next = nn;
		}
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
		}
	}

	public static Node sort(Node one, Node two) {
		Node last = null;
		if (one == null) {
			return two;
		} else if (two == null) {
			return one;
		} else if (one.data <= two.data) {
			last = one;
			last.next = sort(one.next, two);
		} else {
			last = two;
			last.next = sort(one, two.next);
		}
		return last;
	}

	public static Node mergeList(Node arr[], int end) {
		while (end != 0) {
			int i = 0, j = end;
			while (i < j) {
				arr[i] = sort(arr[i], arr[j]);
				i++;
				j--;
				if (i >= j) {
					end = j;
				}
			}
		}
		return arr[0];
	}

	public static void display(Node temp) {
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println("Enter the number of LinkedList=>");
		int k = o.nextInt();
		System.out.println("Enter the number of value in LinkedList=>");
		int t = o.nextInt();
		Node arr[] = new Node[k];
		for (int i = 0; i < k; i++) {
			System.out.println("Enter the value of LinkedList" + (i + 1));
			LinkedListKM li = new LinkedListKM();
			for (int j = 0; j < t; j++) {
				li.insert(o.nextInt());
			}
			arr[i] = li.head;
		}
		Node node = mergeList(arr, k - 1);
		System.out.println("OUTPUT=>");
		display(node);

	}

}
