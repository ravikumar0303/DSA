import java.util.*;
public class febonacci {
	
	public static void main(String [] args)
	{
		int n,p1 = 0,p2=1,p3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		 n=sc.nextInt();
		 
		 System.out.println(" "+p1);
		 System.out.println(" "+p2);
		 
		 
		 for (int i=0;i<=n;i++)
		 {
			 
			 p3=p1+p2;
			
			 System.out.println(" "+p3); 
			 p1=p2;
			 p2=p3;
		}
		
		 
	}

}
