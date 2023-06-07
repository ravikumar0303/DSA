package Queue;

public class TesterQue {
	
	
	public static void main(String args [])
	{
		Queue q1=new Queue(12);
		
		q1.enque(23);
		q1.enque(88);
		q1.enque(78);
		q1.enque(89);
		q1.enque(45);
		q1.enque(65);
		q1.enque(21);
		q1.enque(32);
		q1.enque(87);
		q1.display();
		
		q1.deque();	
		
//		System.out.println("");
		int v=q1.deque();
		if(v!=-1)
		System.out.println("Remove Element Is:"+v);
//		
		q1.display();
	
	}

}
