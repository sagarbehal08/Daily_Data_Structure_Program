package Assignment;

import java.util.*;

public class Pythagorean_Triplet {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println("Enter the number of test cases => ");
		int t = o.nextInt();
		for (int j = 0; j < t; j++) {
			System.out.println("Enter the size of array => ");
			int arrs = o.nextInt();
			int arr[] = new int[arrs];
			System.out.println("Enter values => ");
			for (int i = 0; i < arrs; i++) {
				arr[i] = o.nextInt();
			}
			check(arr, arrs);
		}
	}

	public static void check(int[] arr, int arrs) {
		Arrays.sort(arr);
		int flag = 0;
		for (int i = 0; i < arrs; i++) {
			int v = arr[i] * arr[i];
			for (int j = 0; j < arrs - 1; j++) {
				if ((arr[j] * arr[j]) + (arr[j + 1] * arr[j + 1]) == v) {
					flag++;
				}
			}
		}
		if (flag > 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
