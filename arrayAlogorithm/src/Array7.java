 import java.util.*;
public class Array7 {
	int a[]=new int[10];
	int b[]=new int[5];
	int c[]=new int[5];
	Scanner sc =new Scanner(System.in);

	public void getData()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("enter array element "+i);
			a[i]=sc.nextInt();
			
		} System.out.println("your array element ");
		
	}	
	
		public void split()
		{
			for(int i=0;i<5;i++)
			{
				b[i]=a[i];
				
				System.out.print(" "+b[i]);
			}
			System.out.println();
			for(int i=5;i<=9;i++) 
			{
				c[i]=a[i];
				System.out.print(" "+c[i]);
			}
		}
	
		public static void main(String[] args)
		{
			Array7 c1=new Array7();
			c1.getData();
			c1.split();
		}
}
