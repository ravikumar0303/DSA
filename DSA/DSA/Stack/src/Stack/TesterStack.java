package Stack;

public class TesterStack {

	public static void main(String[] args) {
		
		
		Stackstk s1=new Stackstk(10);
		
		s1.push(44);
		s1.push(43);
		s1.push(46);
		s1.push(24);
		
		s1.display();
		
		int i=s1.pop();

	
		if(i!=1)
		{
			System.out.println("pop Element is:"+i);
		}
//		s1.pop();
		s1.display();
		
	
		 i=s1.peek();
		if(i!=1)
		{
			System.out.println("top Element is:"+i);
		}
		
		s1.display();
	}
	
}
