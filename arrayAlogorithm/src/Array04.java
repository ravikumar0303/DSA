//Prog 4 Binary Number Pattern 
//10101
//01010
//10101
//01010
//10101	

public class Array04 {
public static void main (String [] args)
{
	Array04 a=new Array04();
    a.Array();
	}
 void Array(){
	 int n=0;
		for (int j=0; j<5;j++)
		{
			for (int i=0; i<5;i++)
			
			{
				System.out.print(n++%2);
			}
			System.out.println(" ");	
		}
	}
	    
} 

