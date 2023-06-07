//Prog 3 
//
//5 
//5 4 
//5 4 3 
//5 4 3 2 
//5 4 3 2 1

public class Array01 {
	
	
	public static void main(String[] args)
	{
		
		Array01 a=new Array01();
		a.Array1();
	}

	void Array1()
	{
		for (int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" "+j);
		    }System.out.println();
		}
	}
}
