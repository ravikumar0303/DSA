import java.util.*;
public class QueueR {
				
		public static void main(String args [])
		{
			Queue <Integer> q=new LinkedList<>();
			
			
			q.add(12);
			q.add(78);
			q.add(89);
			q.add(96);
		  //			
			 System.out.println("Queue Element is.");
			 while(!q.isEmpty())
			 {
				 
				 System.out.println(q.peek());
				 q.remove();		
			 }
	           
		}

	}
