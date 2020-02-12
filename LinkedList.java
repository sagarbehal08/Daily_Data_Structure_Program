package Assignment;

public class LinkedList {
	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;
	
	public void addLast(int item) {
		// create a new Node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach Node
		if (this.size >= 1) {
			this.tail.next = nn;
		}

		// summary object
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}
	}
	
	public Node getNodeAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}
		if (idx < 0 || this.size <= idx) {
			throw new Exception("Invalid Index.");
		}
		Node temp = this.head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp;

	}
	
	public void reverseData() throws Exception {
		int left = 0;
		int right = this.size - 1;
		while (left < right) {
			Node ln = getNodeAt(left);
			Node rn = getNodeAt(right);

			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;

			left++;
			right--;
		}
	}
	
	public void display() {
		Node temp = this.head;
		System.out.println("---------------------");
		while (temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}
		System.out.println(".");
		System.out.println("---------------------");
	}
	
	public void RemoveDuplicate()
	{
		removeDuplicate(this.head);
	}
	
	private void removeDuplicate(Node temp)
	{
		if(temp==null || temp.next==null)
		{
			return;
		}
		if(temp.data == temp.next.data)
		{ 
			
			temp.next=temp.next.next;
			removeDuplicate(temp);
		}
		removeDuplicate(temp.next);
	}
	
	public void isPalindrom() throws Exception
	{
		isPalindrom(this.head);
	}
	private void isPalindrom(Node root) throws Exception
	{
		int left=0;
		int right=this.size-1;
		int count=0;
		while(left<right)
		{
			Node ln=getNodeAt(left);
			Node rn=getNodeAt(right);
			if(ln.data!=rn.data)
			{
				count=0;
				break;
			}
			left++;
			right--;
			count++;
		}
		if(count==0)
		{
			System.out.println("Not a Palindrom");
		}
		else
		{
			System.out.println("Palindrom");
		}
	}
	public void reverseByIndex(int index)
	{
		
		this.head=reverseByIndex(this.head,index);
	}
	private Node reverseByIndex(Node head,int k)
	{
		 Node current = head; 
	       Node next = null; 
	       Node prev = null; 
	         
	       int count = 0; 
	       while (count < k && current != null)  
	       { 
	           next = current.next; 
	           current.next = prev; 
	           prev = current; 
	           current = next; 
	           count++; 
	       } 
	  
	       if (next != null)  
	          head.next = reverseByIndex(next, k); 
	       
	       return prev; 
	}
	private void reverseIndex(int index) throws Exception
	{
		int left=0;
		int right=index-1;
		while(left<right)
		{
			Node ln=getNodeAt(left);
			Node rn=getNodeAt(right);
			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;
			left++;
			right--;
		}
	}
	public void rotate(int k)
	{   k=k%this.size;
	     if(k==0)
	     {
	    	 return;
	     }
	     
	     Node temp=this.head;
	     int count=1;
	     while(count<k && temp!=null)
	     {
	    	 temp=temp.next;
	    	 count++;
	     }
	     if(temp==null)
	     {
	    	 return;
	     }
	     Node KthNode=temp;
	     this.tail.next=this.head;
	     this.head=KthNode.next;
	     KthNode.next=null;
	     this.tail=KthNode;
	     System.out.println("HEAD =>"+this.head.data);
	     System.out.println("tail =>"+this.tail.data);
	     
	}
	public void exchange()
	{
		int j=0;
		Node temp=this.head;
//		int k=0;
//		if(this.size%2==0)
//		{
//			k=this.size/2;
//		}
//		else
//		{
//			k=(this.size-1)/2;
//		}
		while( temp!=null && temp.next!=null)
		{
			int t=temp.data;
			temp.data=temp.next.data;
			temp.next.data=t;
			
			temp=temp.next.next;
//			j++;
		}
	}
	
	

	public static void main(String[] args) throws Exception {
	   LinkedList li=new LinkedList();
	  // Scanner o=new Scanner(System.in);
	   li.addLast(10);
//	   li.addLast(20);
//	   li.addLast(30);
//	   li.addLast(40);
//	   li.addLast(50);
//	   li.addLast(60);
//	   li.addLast(70);
//	   li.addLast(80);
//	   li.addLast(9);
//	   li.addLast(10);
//	   li.display();
//	   System.out.println("Reverse => ");
//     li.reverseData();
//	   li.display();
//	   System.out.println("Remove Dupliacte => ");
//	   li.RemoveDuplicate();
//	   li.display();
//	   li.isPalindrom();
//	   li.reverseByIndex(4);
//	   li.display();
	   li.display();
//	   li.rotate(4);
	   li.exchange();
	   li.display();
	}

}
