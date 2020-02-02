package Assignment;

import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class JumpingNumber {

	static ArrayList<Integer> al=new ArrayList<>();
	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		int num=o.nextInt();
		print(num);
		Collections.sort(al);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		

	}
	public static void bfs(int x, int num) 
    { 
        
        Queue<Integer> q = new LinkedList<>(); 
        q.add(num); 
  
       
        while (!q.isEmpty()) { 
            num = q.peek(); 
            q.poll(); 
            if (num <= x) { 
//                System.out.print(num + " "); 
                al.add(num);
                int last_digit = num % 10; 
  
                if (last_digit == 0) { 
                    q.add((num * 10) + (last_digit + 1)); 
                } 
  
                
                else if (last_digit == 9) { 
                    q.add((num * 10) + (last_digit - 1)); 
                } 
  
                else { 
                    q.add((num * 10) + (last_digit - 1)); 
                    q.add((num * 10) + (last_digit + 1)); 
                } 
            } 
        } 
    } 
  
    public static void print(int x) 
    { 
//        System.out.print("0 "); 
        al.add(0);
  
        for (int i = 1; i <= 9 && i <= x; i++) { 
            bfs(x, i); 
        } 
    } 

}
