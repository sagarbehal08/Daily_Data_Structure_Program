package Assignment;

import java.util.Scanner;

public class RemoveAdjacent {
	//static String nstr="";
	public static void main(String args[]) {
		Scanner o = new Scanner(System.in);
		int t=o.nextInt();
		for(int i=0;i<t;i++) {
		String str = o.next();
		String str1=remove(str);
		System.out.println(str1);
		}
	}
	public static String remove(String str) {
		if(str.length()<=1) {
			return str;
		}
		if(str.charAt(0)==str.charAt(1)) {
			int j=0;
			while(j<str.length()-1 && str.charAt(0)==str.charAt(j+1)) {
				j++;
			}
			return remove(str.substring(j+1));
		}
		else {
			return str.charAt(0)+remove(str.substring(1));
		}
	}
}
