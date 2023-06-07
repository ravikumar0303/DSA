//Q3. Write a Java program to print following pattern: 
//5
//454
//34543
//2345432
//123454321




import java.util.*;
public class examQ3 {

	public static void main(String[] args)
	{
		int num;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a number");
		num=sc.nextInt();
		for (int i=num;i>0;i--)
		{
			for(int j=i;j<=num;j++)
			{
				System.out.print(j);
				
			}for(int j=num-1;j>i-1;j--)
			{
				System.out.print(j);
			}System.out.println();
		}sc.close();
		}}
