package Dynamic;

public class DynamicQmain {
	
	
//	private static final boolean isEmpty = false;
	private QNode f,r;
	
	public DynamicQmain()
	{
		setF(setR(null));
	}
	 
	public QNode getF() {
		return f;
	}

	public void setF(QNode f) {
		this.f = f;
	}

	public QNode getR() {
		return r;
	}

	public QNode setR(QNode r) {
		this.r = r;
		return r;
	}
	
		
   public void enque(int i) {
	   QNode NN=new QNode(i);
	   if(NN==null)
	       return;
	   
	  
		 if(r==null)
	      	 r=f=NN;
	    
          else  
	  
		   r.setNext(NN);                        
		   r=NN;
	  
   }
   
   
   public QNode peek()
   {
	   if(isEmpty())
	   {
		   System.out.println("Queue is Empty.");
		   return null;
	   }
	   return f;
   }
   
     public void display()
     {
    	 if(isEmpty())
    	 {
    		 System.out.println("Queue is Empty.");
    	     return;
    	 }
    	 
    	 
    	 System.out.println("Element is.");
    	 
    	 for(QNode t=f;t!=null;t=t.getNext())
    		 
//    		QNode x=t.getNext();
    		 System.out.println(t.getData());
    	 
    	 
    	    
       }
     
//	private char[] toString(QNode x) {
//		// TODO Auto-generated method stub
//		return ;
//	}

	public boolean isEmpty()
     {
//    	 if(r==null)
//    		 return true;
//    	 return false;
   	 return r==null;
    	 
     }	   
           
  }
     
	  		
	
	
	

