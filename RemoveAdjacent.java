package Assignment;

import java.util.Scanner;

public class RemoveAdjacent {
	static String nstr="";
	public static void main(String args[]) {
		Scanner o = new Scanner(System.in);
		String str = o.next();
		remove(str, 0, str.length() - 1);
		System.out.println(nstr);
	}

public static void remove(String str,int si,int ei)
{
        if(si>=ei)
        {
             nstr+=str.charAt(si);
        	return;
        }
		char ch=str.charAt(si);
		char nch=str.charAt(si+1);
		if(ch==nch)
		{
		 remove(str,si+2,ei);
			
		}
		else
		{
			nstr+=ch;
		   remove(str,si+1,ei);
		}

}
}
