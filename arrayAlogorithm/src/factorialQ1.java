//Q1. Write a Java function factorial that calculates factorials from 1 to 10 
public class factorialQ1 {


	public static void main(String[] args) {
		
		factorialQ1 a=new factorialQ1();	
		
		a.factorial();

}
	public void factorial() {
		
		for (int i = 0; i <=10; i++) {
			System.out.print("FACTORIAL OF "+i+" is: ");
			int fac=1;
		for(int j=1;j<=i;j++)
		{
			fac=fac*j;
			
		}System.out.println(fac);
		}
		
	}
}

