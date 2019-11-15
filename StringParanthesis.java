package Assignment;

import java.util.*;

class parenthesis{
    static class stack  
    { 
        int top=-1; 
        char items[]=new char[100]; 

       
        void push(char x)  
        { 
            if(top==99)  
            { 
                System.out.println("Stack full"); 
            }  
            else 
            { 
                items[++top]=x; 
            } 
        }

        
        char pop()  
        {
            if(top==-1)  
            { 
                System.out.println("Underflow error"); 
                return '\0'; 
            }
            else 
            { 
                char element=items[top]; 
                top--; 
                return element; 
            }
        }

       
        boolean isEmpty()  
        { 
            if(top==-1){
                return true;
            }
            else
                return false;
        } 
    }

    
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
        stack s=new stack();
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
        System.out.println("Enter the number of queries:-");
        int q=sc.nextInt();
        int i=0;
        while (i<q) {
            String str=sc.next();
            boolean res=checkparen(str);
            if(res){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
            i++;
        }
    }
}
