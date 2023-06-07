//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 

public class starArray1 {
  
	 void starArray()
	 {
		 
		 for (int i=6;i>=1;i--)
		 {
			 
			 for(int j=6;j>=i;j--)
			 {
				 System.out.print(" *");
				 
			 } 
			 System.out.println();
			 
			
		 }	
		 for (int i=1;i<=6;i++)
		 {
			 
			 for(int j=5;j>=i;j--)
			 {
				 System.out.print(" *");
				 
			 } 
			 System.out.println();
			 
			
		 }		 
		
	 }
	 
	 public static void main(String[] args)
	 {
		 
		 starArray1 c1= new starArray1();
		 c1.starArray();
	 }
}
