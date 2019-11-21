package Assignment;

import java.util.Scanner;
import java.util.ArrayList;

	public class SubArrayKMax {
	public static void subArray(int arr[],int k)
	{ 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				ArrayList<Integer> a=new ArrayList<Integer>();
				for(int l=i;l<=j;l++)
				{
					a.add(arr[l]);
			
				}
				if(a.size()==k)
				{
					int p=findMax(a);
					System.out.print(p+" ");
				}
		
			}
		}
	}
	public static int  findMax(ArrayList<Integer> a)
	{
	    int max=a.get(0);
	    for(int i=1;i<a.size();i++)
	    {
	    	if(a.get(i)>max)
	    	{
	    		max=a.get(i);
	    	}
	    }
	    return max;
	}
	public static void main(String args[])
	{
		Scanner o=new Scanner(System.in);
		System.out.println("Enter size of array & value of K=");
		int n=o.nextInt();
		int k=o.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter numbers in array =");
		for(int i=0;i<n;i++)
		{
			arr[i]=o.nextInt();
		}
		System.out.println("OUTPUT => ");
		subArray(arr,k);
	}
	
}
