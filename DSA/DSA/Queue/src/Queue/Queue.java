package Queue;

public class Queue {
	
	private int data[];
	private int r,f;
	public Queue(int size) {
	
		data=new int [size];
		r=f=-1;		
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}

	public void enque(int v)
	{
	     if(isFull())
	     {
	    	 System.out.println("Queue is Full.");
	    	 return;
	     }
	     if(r==-1)
	    	 f=0;
	     data[++r]=v;
	}
	
	public int deque()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty.");
			return -1;
		}
		int v=data[f++];
		if(f==r+1)
			r=f=-1;
		return v;
	}
	
	private boolean isEmpty() {
		if(r==-1)
		    return true;
		
		return false;
		
	}
	
	
	private boolean isFull() {
		
		if(r==data.length-1)
			return true;
		return false;
	}
	
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty.");
	         return;		
		}
		
		System.out.println("Queue Element is:");
		
		for(int i=f;i<=r;i++)
		{
			 System.out.println(data[i]);
		}
	}
}
