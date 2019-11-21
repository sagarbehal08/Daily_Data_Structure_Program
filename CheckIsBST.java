package Assignment;

public class CheckIsBST {
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
	public static boolean isBST()
	{
		return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	public static boolean check(Node root,int min,int max)
	{
	   if(root==null)
	   {
		   return true;
	   }
	   else if(root.key<=min || root.key>max)
	   {
		   return false;
	   }
	   return (check(root.left,min,root.key)&&check(root.right,root.key,max));
	}
	public static void main(String args[])
	{
		CheckIsBST b=new CheckIsBST();
		b.root=new Node(90);
		b.root.right=new Node(80);
		b.root.left=new Node(70);
		b.root.left.right=new Node(85);
		b.root.left.left=new Node(70);
		inOrder(root);
		System.out.println();
		if(isBST())
		{
			System.out.println("TREE IS BST");
		}
		else
		{
			System.out.println("TREE IS NOT BST");
		}
	}

}
