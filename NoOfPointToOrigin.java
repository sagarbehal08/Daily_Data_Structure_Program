package Assignment;

import java.util.Scanner;

public class NoOfPointToOrigin {
    static int count=0;
	public static void main(String[] args) {
	Scanner o=new Scanner(System.in);
	int t=o.nextInt();
	for(int i=0;i<t;i++)
	{
		int n=o.nextInt();
		int m=o.nextInt();
		getPath(0,0,n,m);
		System.out.println(count);
		count=0;
	}
	}
	public static void getPath(int sc,int sr,int ec,int er)
	{
		if(ec==0 && er==0)
		{
			count++;
			return;
		}
		if(ec<sc || er<sr)
		{
			return;
		}
		
		getPath(sc,sr,ec-1,er);
		getPath(sc,sr,ec,er-1);
	}
	

}
