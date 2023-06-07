package Stack;

public class Stackstk {
	
	int data[];
	int top;
	public Stackstk(int size) {
		
		data =new int[size];
		top=-1;
		
	}
	
	
	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}


	public void push(int i) {
		// TODO Auto-generated method stub
		if(isFull())
		{
			System.out.println("Stack is overflow:");
			return;
		}
		data[++top]=i;
	}


	private boolean isFull() {
		// TODO Auto-generated method stub
	
		if(top==data.length-1)
		{
			return true;
		}
		return false;
	}


	public void display() {
		// TODO Auto-generated method stub
	       if(isEmpty())
	       {
	    	   System.out.println("Stack is Underflow.");
	    	  return; 
	       }
	       
	       System.out.println("Element:");
	        
	       for(int x=top;x>=0;x--)
	       {
	    	   System.out.println(data[x]); 
	       }
	}


	private boolean isEmpty() {
		
		if(top==-1)
		{
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
	
	
        public int pop()
        {
        	 if(isEmpty())
        	 {
        		 System.out.println("Stack is Underflow");
        		 return -1;
        	 }
        		 
        	 return data[top--];
             
        }


		public int peek() {
			// TODO Auto-generated method stub
			
			if(isEmpty())
       	 {
       		 System.out.println("Stack is Underflow");
       		 return -1;
       	 }
			return data[top];
		}
       
}          
