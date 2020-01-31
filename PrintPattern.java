package Assignment;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println("INPUT => ");
		int t = o.nextInt();
		System.out.println("OUTPUT => ");
		print(t, 0);

	}

	public static void print(int ov, int ev) {
		if (ev == ov) {
			return;
		}
		if (ev == 0) {
			for (int i = ov; i > ev + 1; i--) {
				System.out.print(i);
			}
		} else {
			for (int i = ov; i > ev; i--) {
				System.out.print(i);
			}
		}
		for (int i = 0; i < 2 * ev - 1; i++) {
			System.out.print(" ");
		}

		for (int i = ev + 1; i <= ov; i++) {
			System.out.print(i);
		}
		System.out.println();

		print(ov, ev + 1);
	}

}
