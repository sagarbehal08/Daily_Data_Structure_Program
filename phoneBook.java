package Assignment;

import java.util.HashMap;
import java.util.Scanner;

public class phoneBook {
public static void main(String args[])
{   HashMap<String,Integer> hm=new HashMap<String,Integer>();
	Scanner o=new Scanner(System.in);
	System.out.println("Enter the number of contacts:- ");
	int t=o.nextInt();
	System.out.println("Enter the contact details ==> ");
	for(int i=0;i<t;i++)
	{
		hm.put(o.next(),o.nextInt());
	}
	System.out.println("Enter the no. of queries ==> ");
	int q=o.nextInt();
	for(int j=0;j<q;j++)
	{
		String qu=o.next();
		if(hm.get(qu)!=null)
		{
			System.out.println(qu+" = "+hm.get(qu));
		}
		else
		{
			System.out.println("Not Found");
		}
	}
	
}
}
