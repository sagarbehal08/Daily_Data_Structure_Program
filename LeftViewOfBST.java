package Assignment;

import java.util.Scanner;

import BinaryTree.BinarySearchTree.Node;

public class LeftViewOfBST {
	static Node root=null;
	static int maxLevel=0;
	static class Node
	{
		Node left ,right;
		int key;
		Node(int d)
		{
			key=d;
			left=right=null;
		}
	}
   public static void insert(int key)
   {
	   root=insertNode(root,key);
   }
   public static Node insertNode(Node root,int key)
   {
	   if(root==null)
	   {
		   root=new Node(key);
		   return root;
	   }
	   else if(root.key>key)
	   {
		   root.left=insertNode(root.left,key);
	   }
	   else if(root.key<key)
	   {
		   root.right=insertNode(root.right,key);
	   }
	   return root;
   }
   public static void Inorderdisplay(Node root)
	{
		if(root==null)
		{
			return;
		}
		Inorderdisplay(root.left);
	    System.out.print(root.key+"-->");
	    Inorderdisplay(root.right);
		
	}
   public static void leftView()
   {
	   printLeftView(root,1);
   }
   public static void printLeftView(Node root,int level)
   {
	   if(root==null)
	   {
		   return;
	   }
	   if(level>maxLevel)
	   {
		   System.out.print(root.key+"-->");
		   maxLevel=level;
	   }
	   printLeftView(root.left, level+1);
	   printLeftView(root.right, level+1);
   }
	public static void main(String args[])
	{
		Scanner o=new Scanner(System.in);
		LeftViewOfBST b=new LeftViewOfBST();
	    System.out.println("Enter numbers of value you want to enter ==> ");
	    int t=o.nextInt();
	    System.out.println("Enter value in tree ==> ");
	    for(int i=0;i<t;i++)
	    {
	    	b.insert(o.nextInt());
	    }
	    System.out.println("Inorder of BST ==> ");
	    b.Inorderdisplay(root);
	    System.out.println("\nLeft view of BST ==> ");
	    b.leftView();
		
		
	}

}
