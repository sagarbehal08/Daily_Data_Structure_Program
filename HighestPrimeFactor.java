package Assignment;

import java.util.Scanner;

public class HighestPrimeFactor {

	public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i;
        int max=Integer.MIN_VALUE;
        for(i=2;i<=n;i++)
        {
            while(n%i==0)
            {
                if(i>max)
                {
                    max=i;
                }
                n=n/i;
            }
        }
        System.out.println(max);
    }
}
