import java.util.*;
public class Star {
	  
	 public static void main(String [] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 
	    System.out.println("Enter your n print star choice:");
 		 int n= sc.nextInt();
		 
		 for(int i=1;i<n;i++)
		 {
		    
			for(int j=1;j<=i;j++)
			{
				 
	     	 System.out.print("*");
			}
			System.out.println(" ");
			
		 }
		 for(int i=1;i<=n;i++)
		 {
		    
			for(int j=n;j>=i;j--)
			{
				 
	     	 System.out.print("*");
			}
			System.out.println(" ");
			
		 }
		 
	 }

}
