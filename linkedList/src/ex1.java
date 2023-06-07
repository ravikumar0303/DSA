import java.util.*;
public class ex1 {
	
	public static void main(String [] args)
	{
		int n,t=0,r,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you N number:");
		n=sc.nextInt();
		
		s=n;
		
		while(n>0)
		{
			r=n%10;
			t=(t*10)+r;
			n=n/10;
					
		}
		if(s==t)
		{
			System.out.println("your number is pelindrome ");
		}
		else
		{
			System.out.println("number is not pelindrome");
		}
	}

}
