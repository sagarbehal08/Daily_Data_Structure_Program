package Assignment;
import java.util.*;
public class maxNum{
	static long maxNum(String s){
		String[] str=s.split(" ");
		int n=str.length;
		Arrays.sort(str,Collections.reverseOrder());
		String num="";
		for(int i=0;i<n;i++){
			num=num+str[i];
		}
		long max=Long.parseLong(num);
		return max;	
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Enter Array of Numbers :-");
		String s=sc.nextLine();
		System.out.println("Largest Number formed is :-\n"+maxNum(s));
	}
}
