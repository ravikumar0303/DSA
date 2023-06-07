package DLL;

public class TesterDCLL {
	public static void main(String[] args) {
		DublyLL d1=new DublyLL();
		d1.insertAtBeg("Pune");
		d1.insertAtBeg("Satara");
		d1.insertAtBeg("Kolhapur");
		d1.insertAtBeg("Mumbai");
		d1.insertAtBeg("Nagpur");
	
		d1.forwordDisplay();
		d1.backwordDisplay();
		
		
		d1.checkCircularity(4);
		d1.deleteAtPos(3);
		d1.forwordDisplay();
	}

}
