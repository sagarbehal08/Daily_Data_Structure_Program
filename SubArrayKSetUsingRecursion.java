package Assignment;

import java.util.Scanner;

public class SubArrayKSetUsingRecursion {static int count=0;
public static void main(String args[])
{
	Scanner o=new Scanner(System.in);
	System.out.println("Enter the size of array =>> ");
	int n=o.nextInt();
	System.out.println("Enter number in array =>> ");
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=o.nextInt();
	}
	System.out.println("Enter the value of K ==> ");
    int k=o.nextInt();
	subArray(arr,0,0,k);
	
}
public static void subArray(int arr[],int vi,int ei,int k)
{   
	if(vi==arr.length)
	{ System.out.println("Output =>> "+count);
		System.exit(0);
	}
	if(ei==arr.length)
	{ //  System.out.println(arr[ei]);
		subArray(arr,vi+1,vi+1,k);
	}
	int a=0;
	for(int i=vi;i<=ei;i++)
	{
//		System.out.print(arr[i]+" ");
		if(arr[i]>k) {
		a++;}
		
	}
	if(a>0)
	{
		count++;
	}
  subArray(arr,vi,ei+1,k);
}
}
