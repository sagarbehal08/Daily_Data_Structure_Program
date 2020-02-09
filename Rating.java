package Assignment;


import java.util.Scanner;

public class Rating {
	public static void main(String args[]) {
		Scanner o = new Scanner(System.in);
		int t = o.nextInt();
		int arr[] = new int[t];
		for(int i=0;i<t;i++)
		{
			arr[i]=o.nextInt();
		}
		int candy[]=new int[t];
		for(int i=0;i<t;i++)
		{
			candy[i]=1;
		}
		System.out.println(count(arr,candy,t));
	}
	public static int count(int arr[],int candy[],int size)
	{
		for(int i=1;i<size;i++)
		{
			if(arr[i]>arr[i-1])
			{
			candy[i]=candy[i-1]+1;
			}
		}
		int sum=arr[size-1];
		for(int i=size-2;i>=0;i--)
		{
			if(arr[i]>arr[i+1])
			{
				if(candy[i]>(candy[i+1]+1) || candy[i]==(candy[i+1]+1))
				{
					candy[i]=candy[i];
				}
				else {
					candy[i]=(candy[i+1]+1);
				}
				
		}
				
			
			sum+=candy[i];
		}
		return sum;
	}
		

}
