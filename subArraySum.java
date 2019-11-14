package Assignment;

import java.util.Scanner;

public class subArraySum {
	public static void subArray(int arr[],int h)
	{ int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{int sum=0;
				for(int k=i;k<=j;k++)
				{
					sum+=arr[k];
					
				}
				if(sum==h)
				{
					System.out.println("Starting :"+i+"Ending :"+j);
					count++;
				}
				
			}
		}
		if(count==0)
		{
			System.out.println("There is no strating and ending index");
		}
	}
public static void main(String args[])
{
	Scanner o=new Scanner(System.in);
	System.out.println("Enter size of array =");
	int n=o.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter number in array =");
	for(int i=0;i<n;i++)
	{
		arr[i]=o.nextInt();
	}
	System.out.println("Enter the value of K=");
	int h=o.nextInt();
	subArray(arr,h);
	
}
}

