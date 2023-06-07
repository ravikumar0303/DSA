// import java.util.*;
//public class Array6 {
//	
//	 public static void main(String[] args)
//	 {
//		 
//		 
//		   //int arr[]=new int{}
//		 System.out.println("Enter 10 interger Array:");
//		 Scanner sc =new Scanner(System.in);
//		 int arr=sc.nextInt();
//	 } 
//
//}

public class Array6
{
    public static void main(String[] args)
    {
        int rows = 5; 
                
        
        for (int i = 1; i <= rows; i++)
        {
          for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
          for (int j = i; j <= rows; j++)
            {
                System.out.print("* ");
            }  
            System.out.println();
        }
        
        for (int i = rows-1; i >=1; i--)
        {
        	for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
          for (int j = i; j <= rows; j++)
            {
                System.out.print("* ");
            }  
            System.out.println();
        }
        
        }
     
    }