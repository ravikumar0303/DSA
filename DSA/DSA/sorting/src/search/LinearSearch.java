
//////1. Implement Linear search

package search;
//import java.util.*;

public class LinearSearch {
	
	
	public static void main(String [] args)
	{
		 boolean flag=true;
//		 int n;
//		Scanner sc=new Scanner(System.in);
//		System.out.println(" chose Enter the NO. in Array store in  List:");
//		n=sc.nextInt();
//		
	   
				
		int arr[]= {45,25,15,36,52,89,85,75,65,35,56};
		int n=65;
		int i=0;
		
//		int[] arr = new int[10];  
//		System.out.println("Enter your Arr list:");
//		 
	for( i=0;i<arr.length;i++)
	{
	
		 if(arr[i]==n)
		 {
			flag=true;
		      break;
		 }    
		     
		
	}
	System.out.println("\t");
	 if(flag)
    		
	       System.out.println("\t"+"\tData is: "+n+"  Found position:> "+i);
	          
	
	   else
		 System.out.println("Data is Not Found.");
		 
	}
	
}




