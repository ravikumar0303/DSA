//command line agrs addition
public class VariableArray {
	
	public static void main (String args[])
	{
		int s=0 ;
		//accept cmdline argument and add them
				for (int i=0 ;i<args.length ;i++)
				{    
					System.out.println(args[i]);
					s=s+Integer.parseInt(args[i]);
				}
		System.out.println("\nAddition is :"+s);
		System.out.printf("Addition %d",s);
		System.out.print("Addition"+s);
	}

}
