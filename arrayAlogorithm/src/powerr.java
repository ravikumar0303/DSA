import java.util.*;
public class powerr {
	
	int n,m;
	Scanner sc=new Scanner (System.in);
	  public void getdata ()
	{
		System.out.println("enter your n number:");
		n=sc.nextInt();
		System.out.println("enter power m number:");
		m=sc.nextInt();
		
		
	}
	
	public void returnPower()
	{
		
		System.out.println(Math.pow(n, m));
		
	}
	
	public static void main(String[] args)
	{
		powerr c1=new powerr ();
		c1.getdata();
		c1.returnPower();
		
	}
	

}
