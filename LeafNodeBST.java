package Assignment;

public class LeafNodeBST {
	static Node root;
	static class Node 
	{
		int key;
		Node left;
		Node right;
	
		Node(int d) {
		key = d;
		left = right = null;
		}
	}
	public static void printLeafNodes(Node root) {
		if(root==null) {
		return;
		}
		if(root.left==null && root.right==null) {
		System.out.print(root.key+"-->");
		}
		printLeafNodes(root.left);
		printLeafNodes(root.right);
	}
	public static void main(String args[]) {
		LeafNodeBST tree=new  LeafNodeBST();
		tree.root = new Node(1); 
                tree.root.left = new Node(2); 
                tree.root.right = new Node(3); 
                tree.root.left.left = new Node(4); 
                tree.root.left.right = new Node(5); 
                tree.root.right.left = new Node(6); 
                tree.root.right.right = new Node(7); 
                System.out.println("Leaf Nodes are:- ");
		printLeafNodes(root);
	}
}
