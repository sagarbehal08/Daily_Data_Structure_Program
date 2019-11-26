package Assignment;

import java.util.Scanner;

public class FindSumPairFrom2Array {
public static void main(String args[])
{
	Scanner o=new Scanner(System.in);
    System.out.println("Enter size of array1 and array2 and value of k ==> ");
    int a=o.nextInt();
    int a1=o.nextInt();
    int k=o.nextInt();
    int arr[]=new int[a];
    int arr1[]=new int[a1];
    System.out.println("Enter value in array1 ==> ");
    for(int i=0;i<a;i++)
    {
    	arr[i]=o.nextInt();
    }
    System.out.println("Enter value in array2 ==> ");
    for(int j=0;j<a1;j++)
    {
    	arr1[j]=o.nextInt();
    }
    System.out.println("Output ==> ");
    findPair(arr,arr1,k,0,0);
}
public static void findPair(int arr[],int arr1[],int k,int vi,int ei)
{
	if(vi==arr.length)
	{
		return;
	}
	if(ei==arr1.length)
	{
		findPair(arr,arr1,k,vi+1,0);
		return;
	}
	if(arr[vi]+arr1[ei]==k)
	{
		System.out.print(arr[vi]+" "+arr1[ei]+",");
	}
	findPair(arr,arr1,k,vi,ei+1);
}
}
