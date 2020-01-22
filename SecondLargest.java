package Assignment;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String args[]) {
		Scanner o = new Scanner(System.in);
		System.out.println("Enter Size Of Array => ");
		int n = o.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Element In Array => ");
		for (int i = 0; i < n; i++) {
			arr[i] = o.nextInt();
		}
		find(arr, n);

	}

	public static void find(int arr[], int n) {
		if (n < 2) {
			System.out.println("No Second Largest");
		}

		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest => " + max);

		int smin = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > smin && arr[i] != max) {
				smin = arr[i];
			}
		}
		System.out.println("Second Largest => " + smin);
	}
}
