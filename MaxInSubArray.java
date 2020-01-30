package Assignment;

import java.util.Scanner;

public class MaxInSubArray {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("Enter the size of array=>");
		int t=o.nextInt();
		System.out.println("Enter values=>");
		int arr[]=new int[t];
		for(int i=0;i<t;i++)
		{
			arr[i]=o.nextInt();
			
		}
		System.out.println("Enter the values of k=>");
		int k=o.nextInt();
		if(k<=0 || k>t)
		{
			System.out.println("Invalid Input");
		}
		else {
		find(arr,0,k);
		}
	}
	public static void find(int[] arr,int si,int k)
	{
		if((si+k)>arr.length)
		{
			return;
		}
		int max=arr[si];
		for(int i=si;i<(si+k);i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.print(max+" ");
		find(arr,si+1,k);
	}
}
