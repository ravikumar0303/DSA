package list;

public class SinglyLinkedList {
	private Node head;

	public SinglyLinkedList() {
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public boolean insertAtBeg(int v) {
		
		Node nn=new Node(v);//here new node will be created with data and null value
		if(nn==null)
			return false;
//		if(head==null)
//			head=nn;
//		else {
//			nn.setNext(head);
//			head=nn;
//		}
		
		if(head!=null)
			nn.setNext(head);
		head=nn;
		return true;
		
	}
	public boolean insertAtLast(int v) {
		return false;
		
	}
	public boolean deleteAtBeg() {
		
		
		return false;
		
	}
	public boolean deleteAtLast() {
		if(head==null)
			return false;
		
		Node temp=head;
		
		while(temp.getNext().getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(null);
		return true;
		
	}
	public void display() {
		Node temp=head;
		System.out.println("\nList Elements  -");
		while(temp!=null) {
			System.out.print("\t"+temp.getData());
			temp=temp.getNext();
		}
		
	}
	public void search(int v) {
		//temp points to first node
		Node temp=head;
		int c=0;
		while(temp!=null) {
			//c is position every time it will increase if data not found
			c++;
			//if will run when ata found
			if(v==temp.getData()) {
				//print msg found with position
				System.out.println("\n"+v+"found at position "+c);
				break;
			}
			//temp go ahead till it becomes null
				temp=temp.getNext();
		}
	}
///3. How do you find the length of a singly linked list?
	public void find() {
		Node temp=head;
		int c=0;
		while (temp!=null) {
			c++;
			temp=temp.getNext();
		}System.out.println("\n The Length Of Singly Linked List Is "+c);
	}

	public boolean Reverse() {
		if (head==null) {
			System.out.println("no element");
			return true;
		}
		Node a,b,c;
		a=head;
		b=a.getNext();
		while(b!=null)
		{
			c=b.getNext();
			b.setNext(a);
			a=b;
			b=c;
			
		}
		
		  head.setNext(null);
		  head=a;
		
		return false;
	}
	
	public boolean reverse()
	{
		if (head==null) {
			System.out.println("no element");
			return false;}
		Node temp=head;
		while (temp.getNext()!=null)
		{
			temp=temp.getNext();
		}
		Node tail=temp;
		Node tail1=tail;
		temp=head;
		while (tail!=head) {
		while(temp.getNext()!=tail) {
			temp=temp.getNext();
		}
		tail.setNext(temp);
		tail=temp;
		temp=head;
		
		}
		head.setNext(null);
		head=tail1;
		
	
		
	return false;}
	
	
	
}
