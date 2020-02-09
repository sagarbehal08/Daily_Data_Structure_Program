package Assignment;

import java.util.Scanner;

public class RobotPaths {
	public static  int c;
	public static void main(String args[]) {
		Scanner o = new Scanner(System.in);
		int m = o.nextInt();
		int n = o.nextInt();
		count(0, 0, m-1,n-1, "");
	}

	public static void count(int cr, int cc, int er, int ec, String ans) {
		if(cr==er && cc==ec)
		{
			System.out.println(ans);
			return;
			
		}
			
		if(cr>er || cc>ec)
		{
			return;
		}
		count(cr+1,cc,er,ec,ans+"Right->");
		count(cr,cc+1,er,ec,ans+"Down->");
		
	}
}
