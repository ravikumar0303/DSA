package Dynamic;

public class TesterDQ {
	
	
	public static void main(String args [])
	{
		DynamicQmain d=new DynamicQmain();
		
		
		d.enque(45);
	    d.enque(87);

		d.enque(69);
	    d.enque(52);

		d.enque(78);
	    d.enque(41);
	    d.display();
	    
//	    System.out.println("1st element of Q."+d.peek().getData());
		
		
	}

}
