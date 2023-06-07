import java.util.*;
public class Factorial {

	
	  public static int fact (int x)
	  {
		  if(x==1)		
			  return 1;
		  
		return x*fact(x-1);
		  	  
	  }
	    
	  public static void main(String args [])
	  {
		  int n=0;
		  System.out.println("Enter your Feactorial No.:");
		  Scanner sc= new Scanner(System.in);
		  n=sc.nextInt();
		  
		  for(int i=1;i<=n;i++)
			  
		     break;
			  System.out.println("Factorial  "+n+" is:"+fact(n));
		        
			
		  
	  }
	 	
	  
	  
}
