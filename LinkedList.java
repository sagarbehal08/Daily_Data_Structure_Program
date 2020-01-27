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
	

	public static void main(String[] args) throws Exception {
	   LinkedList li=new LinkedList();
	  // Scanner o=new Scanner(System.in);
	   li.addLast(1);
	   li.addLast(2);
	   li.addLast(1);
//	   li.addLast(21);
//	   li.addLast(43);
//	   li.addLast(43);
//	   li.addLast(60);
//	   li.display();
	   System.out.println("Reverse => ");
     li.reverseData();
	   li.display();
//	   System.out.println("Remove Dupliacte => ");
//	   li.RemoveDuplicate();
//	   li.display();
	   li.isPalindrom();
	}

}
