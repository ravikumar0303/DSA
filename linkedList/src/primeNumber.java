import java.util.*;
public class primeNumber {
	int n,f=0;
	Scanner sc=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter your number:");
		n=sc.nextInt();
		
	}
	
	public void checkPrime()
	{
	    if(n==0 || n==1)
	    {
	  System.out.println("number is not prime");
	    }
	    else
	    {
	 for(int i=2;i<=n/2;i++)
	 {
		if(n%i==0 )
		
		{
			
			System.out.println("number is not prime");
			f=1;
			break;
			}
		}
	 if(f==0)
	 {
		
			System.out.println("number is  prime");
			
		}
	 }
	 
	   
	    }
	    
	
	public static void main(String[] args)
	{
		primeNumber pn=new primeNumber();
		pn.getData();
		pn.checkPrime();
	}

}
