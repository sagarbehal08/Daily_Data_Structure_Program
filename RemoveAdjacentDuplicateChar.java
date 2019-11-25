package Assignment;

import java.util.Scanner;

public class RemoveAdjacentDuplicateChar {
	static String result="";
public static void main(String args[])
{
	Scanner o=new Scanner(System.in);
	System.out.println("Enter number of string you want to enter =>> ");
	int t=o.nextInt();
	
	for(int i=0;i<t;i++)
	{
	    System.out.println("Enter the String =>> ");
		String str=o.next();
		
		System.out.println("Output ("+str+") =>> "+remove(str));
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
