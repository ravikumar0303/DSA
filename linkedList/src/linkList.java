
public class linkList {
	
   Node head;
   

	public linkList() {
		}
	
	
	public void insertData(int value)
	{
		Node newNode = new Node(value);
		if (head == null)
		{
			head= newNode;
		}
		else
		{
			Node temp=head;
			while(temp.next !=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
		}  

	}
	
	
	public void insertData(int value,int pos)
	{
		int count=0;
		Node newNode = new Node(value);
		Node previous = new Node(value);
		Node currentNode = new Node(value);
		if (head == null)
		{
			head= newNode;
			newNode.next=previous.next;
			previous.next=newNode;
			currentNode.next=previous.next;
		}
		else
		{
			
			Node temp=head;
			while((temp.next !=null) && count!=pos)
			{
			
				
				temp=temp.next;
				count++;
			}
			temp.next=newNode;
		}  

	}
	/////
	
	
	public void displayData()
	{
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		System.out.print(temp.data+" ");
	}
}

