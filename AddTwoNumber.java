package Assignment;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:- ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int res=add(num1, num2);
        System.out.println("Output==> " + res);
        sc.close();
    }
    public static int add(int n1, int n2){
        int res=n1-(-n2);
        return res;
    }
}
