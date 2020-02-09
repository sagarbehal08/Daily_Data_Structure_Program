package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinimumPathInMatrix {
    public static ArrayList<Integer> al=new ArrayList<>();
	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
	   int size=o.nextInt();
	   int arr[][]=new int[size][size];
	   for(int i=0;i<size;i++)
	   {
		   for(int j=0;j<size;j++)
		   {
			   arr[i][j]=o.nextInt();
		   }
	   }
	   find(arr,0,0,size-1,size-1,0);
	   Collections.sort(al);
	   System.out.println("Minimum Path Sum => "+al.get(0));

	}
	public static void find(int arr[][],int cr,int cc,int er,int ec,int ans)
	{
		if(cr==er && cc==ec )
		{   ans+=arr[cr][cc];
			al.add(ans);
			return;
		}
		if(cr>er || cc>ec)
		{
			return;
		}
		find(arr,cr,cc+1,er,ec,ans+arr[cr][cc]);
		find(arr,cr+1,cc,er,ec,ans+arr[cr][cc]);
//		find(arr,cr+1,cc+1,er,ec,ans+arr[cr][cc]+"->");
	}

}
