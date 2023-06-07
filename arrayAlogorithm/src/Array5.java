 import java.util.*;
public class Array5
{
	int a[]=new int[10];
	int b[]=new int[10];
	Scanner sc =new Scanner(System.in);
	
	public void getData()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("enter array element "+i);
			a[i]=sc.nextInt();
		}
		
		
		
		
	}
	public void reverse()
	{ 
		System.out.println("reversed array is---");
		for(int i=9;i>=0;i--)
		{
			b[i]=a[i];
			System.out.print(" "+b[i]);
		}
		
	}
	
	
	 public static void main(String[] args)
	 {
		Array5 as=new Array5();
		as.getData();
		as.reverse();
	
	 } 

}