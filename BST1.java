package Assignment;

public class BST1 {

	private class Node{
		Node left,right;
		int key;
	    Node(int data)
	    {
	    	this.key=data;
	    	left=right=null;
	    }
	}
	 private Node root;
	public void insert(int key)
	{
		this.root=insert(root,key);
	}
	private Node insert(Node root,int key)
	{
		if(root==null)
		{
			root=new Node(key);
			return root;
		}
		else if(root.key>key)
		{
			root.left=insert(root.left,key);
		}
		else
		{
			root.right=insert(root.right, key);
		}
		return root;
	}
	
	public int height()
	{
		return height(this.root);
	}
	private int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
	     int lh=height(root.left);
	     int rh=height(root.right);
	     if(lh>rh)
	     {
	    	 return lh+1;
	     }
	     else
	     {
	    	 return rh+1;
	     }
	}
	public static void main(String[] args) {
		BST1 bst=new BST1();
		bst.insert(1);
		bst.insert(3);
		bst.insert(5);
		bst.insert(2);
		bst.insert(4);
		System.out.println(bst.height());

	}

}
