package Assignment;

import java.util.Scanner;

import java.util.Iterator;

import java.util.HashMap;
public class FrequencyCounterInArray {
public static void main(String args[])
{
	Scanner o=new Scanner(System.in);
	System.out.println("Enter length of array =>");
	int t=o.nextInt();
	int arr[]=new int[t];
	System.out.println("Enter number => ");
	for(int i=0;i<t;i++)
	{
		arr[i]=o.nextInt();
	}
	count(arr);
}
public static void count(int arr[])
{
	HashMap<Integer,Integer> hMap=new HashMap<Integer, Integer>();
	for(int i=0;i<arr.length;i++)
	{
		if(hMap.containsKey(arr[i]))
		{
			hMap.put(arr[i],hMap.get(arr[i])+1);
		}
		else
		{
		hMap.put(arr[i],1);
		}
	}
	System.out.println("Output=>"+ hMap);
	
}
}
