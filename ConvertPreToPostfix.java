package Assignment;

import java.util.Scanner;
import java.util.Stack;

public class ConvertPreToPostfix 
{
  public static void main(String args[])
  {
	  Scanner o=new Scanner(System.in);
	  String str=o.next();
	  Stack s=new Stack();
	  for(int i=str.length()-1;i>=0;i--)
	  {
		  if(str.charAt(i)=='/' || str.charAt(i)=='*' || str.charAt(i)=='+' || str.charAt(i)=='-')
		  {
			  String str1=(String) s.peek();
			  s.pop();
			  String str2= (String) s.peek();
			  s.pop();
			  String str3=str1+str2+str.charAt(i);
			  s.push(str3);
		  }
		  else
		  {
			  s.push(str.charAt(i)+"");
		  }
	  }
	  for(int i=0;i<s.size();i++)
	  {
		  System.out.println(s.pop());
	  }
  }
}
