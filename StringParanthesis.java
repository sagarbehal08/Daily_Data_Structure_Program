package Assignment;

import java.util.*;

public class StringParanthesis{
	public static boolean isMatch(char ch1, char ch2){
        if(ch1=='(' && ch2==')')
            return true;
        if(ch1=='{' && ch2=='}')
            return true;
        if(ch1=='[' && ch2==']')
            return true; 
        else
            return false;
    }

   
    public static boolean checkparen(String str){
        int n=str.length();
        Stack s=new Stack();
        for(int i=0;i<n;i++){
            char c=str.charAt(i);
            
            if(c=='(' || c=='{' || c=='['){
                s.push(c);
            }

           
            else if(c==')' || c=='}' || c==']'){
                
                if(s.isEmpty()){
                    return false;
                }
                
                if(!isMatch((char)s.pop(), c)){
                    return false;
                }
            }
        }

        
        if(s.isEmpty()){
            return true;
        }
        else
            return false;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter exp:-");
            String str=sc.next();
            boolean res=checkparen(str);
            if(res){
                System.out.println("Balanced");
            }
            else{
                System.out.println("Unbalanced");
            }
       
        }
    }

