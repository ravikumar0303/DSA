import java.util.*;
public class palindrome {
	
	public static void main(String[] args)
	{
		int n=0,a,b,s=0;
		
		System.out.println("Enter your number:");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		b=n;
		while(n>0)
		{
			a=n%10;
			s=(s*10)+a;
			n=n/10;
		}
		if(b==s)
		{
			System.out.println("Number is pelindrome");
		}
		else
		{
		System.out.println("Number is not pelindrome");
	     }
	}

}
