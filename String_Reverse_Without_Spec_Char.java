package Assignment;
import java.util.Scanner;

public class String_Reverse_Without_Spec_Char {
	public static String reverse(char[] str,int i,int l)
	{
		while(i<l) {
		if(!Character.isAlphabetic(str[i]))
		{
			i++;
			
		}
		if(!Character.isAlphabetic(str[l]))
		{
			l--;
		}
		else
		{
			char temp=str[i];
			str[i]=str[l];
			str[l]=temp;
			i++;
			l--;
		}
		}
		String str2=new String(str);
		return str2;
	}
public static void main(String args[])
{
	Scanner o=new Scanner(System.in);
	String str1=o.next();
	char str[]=str1.toCharArray();
	System.out.println(reverse(str,0,str.length-1));
}
}
