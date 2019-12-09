package Assignment;


	import java.util.Scanner;

	public class MergeTwoArrays {
		public static int[] mergeArrays(int arr1[], int n1, int arr2[], int n2, int arr3[]) {
			int i=0,j=0, k=0;
			while(i<n1 && j<n2) {
				if(arr1[i]<=arr2[j]) {
					arr3[k]=arr1[i];
					i=i+1;
				}
				else {
					arr3[k]=arr2[j];
					j=j+1;
				}
				k=k+1;
			}
			while(i<n1) 
			{
				arr3[k]=arr1[i];
				i=i+1;
				k=k+1;
			}
			while(j<n2)
			{
				arr3[k]=arr2[j];
				j=j+1;
				k=k+1;
			}
			return arr3;
		}
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of the first array:- ");
			int size1=sc.nextInt();
			int arr1[]=new int[size1];
			System.out.println("Enter first array elements:- ");
			for(int i=0;i<size1;i++) {
				arr1[i]=sc.nextInt();
			}
			System.out.println("Enter the size of the second array:- ");
			int size2=sc.nextInt();
			int arr2[]=new int[size1];
			System.out.println("Enter second array elements:- ");
			for(int j=0;j<size2;j++) {
				arr2[j]=sc.nextInt();
			}
			int arr3[]=new int[size1+size2];
			mergeArrays(arr1, size1, arr2, size2, arr3);
			System.out.println("Resultant array is:- ");
			for(int k=0;k<arr3.length;k++) {
				System.out.print(arr3[k]+" ");
			}
			sc.close();
		}
	}

