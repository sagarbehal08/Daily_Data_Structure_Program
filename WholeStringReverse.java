package Assignment;

import java.util.Scanner;

public class WholeStringReverse {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println("Enter the number of test => ");
		int t = o.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println("Enter String Words are separated by dots => ");
			String str = o.next();
			String str1 = reverse(str);
			System.out.println(str1);
		}
	}

	public static String reverse(String str) {
		String strArr[] = str.split("\\.");
		String newstr = "";

		for (int i = strArr.length - 1; i > 0; i--) {
			newstr += strArr[i] + ".";
		}
		newstr += strArr[0];

		return newstr;
	}

}
