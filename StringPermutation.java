package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StringPermutation {
public static void main(String args[])
{
	Scanner o=new Scanner(System.in);
	System.out.println("Enter number of test cases =>");
	int t=o.nextInt();
	for(int i=0;i<t;i++)
	{
		System.out.println("Enter String "+(i+1)+" =>");
		String str=o.next();
		ArrayList<String> str1 =getPermutation(str);
		Collections.sort(str1);
		Iterator itr=str1.iterator();
		System.out.println("Output =>");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
	}
	
}
public static ArrayList<String> getPermutation(String str)
{  
	if(str.length()==0)
	{
		ArrayList<String> base=new ArrayList<String>();
		base.add("");
		return base;
	}
	char ch=str.charAt(0);
	String ros=str.substring(1);
	ArrayList<String> rr=getPermutation(ros);
	ArrayList<String> mr=new ArrayList<String>();
	for(String rrs: rr)
	{
		for(int i=0;i<=rrs.length();i++)
		{
			String value=rrs.substring(0,i)+ch+rrs.substring(i);
			mr.add(value);
		}
	}
	return mr;
}
}
