package Assignment;

import java.util.Scanner;

public class LowestCommonAncestorBST 
{
	static Node root;
	static class Node{
		Node left,right;
		int key;
		Node(int d)
		{
			key=d;
			left=right=null;
		}
	}
	public static void inOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inOrder(root.left);
		System.out.print(root.key+"-->");
		inOrder(root.right);
	}
	public static Node check(Node root,int n1,int n2)
	{
		if(root == null)
		{
			return null;
		}
		if(root.key>n1 && root.key>n2)
		{
			return check(root.left,n1,n2);
		}
		if(root.key<n1 && root.key<n2)
		{
			return check(root.right,n1,n2);
		}
			return root;
	}
	public static void main(String args[])
	{
		LowestCommonAncestorBST b=new LowestCommonAncestorBST();
		b.root=new Node(20); 
        b.root.left = new Node(8); 
        b.root.right = new Node(22); 
        b.root.left.left = new Node(4); 
        b.root.left.right = new Node(12); 
        b.root.left.right.left = new Node(10); 
        b.root.left.right.right = new Node(14); 
        Scanner o=new Scanner(System.in);
		System.out.println("Enter the number of test cases ==>> ");
		int t=o.nextInt();
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter the value of N1 and N2 ==>> ");
			int n1=o.nextInt();
			int n2=o.nextInt();
			Node lca=b.check(root, n1, n2);
			System.out.println("LCA for "+n1+" and "+n2+" ==> "+lca.key);
		}
		

}
}
