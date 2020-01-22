package Assignment;

import java.util.Scanner;

public class LeaderElement {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("Enter Array Size => ");
		int t=o.nextInt();
		int arr[]=new int[t];
		System.out.println("Enter Element In Array => ");
		for(int i=0;i<t;i++)
		{
			arr[i]=o.nextInt();
		}
		
		leader(arr,0,arr.length);
}
	public static void leader(int arr[],int si,int ei)
	{
	     
		if(si==ei-1)
		{
			System.out.print(arr[si]);
			return;
		}
		int fi=arr[si];
		int count=0;
		for(int i=si+1;i<ei;i++)
		{
			if(fi>=arr[i])
			{
				count++;
			}
			else
			{
				count=0;
				break;
			}
		}
		if(count>0)
		{
			System.out.print(fi+" ");
		}
		leader(arr,si+1,ei);
	}
}
