import java.util.*;

public class Fibonaci {

	public static int fibo(int x) {
		if (x == 0)
			return 0;
		if (x == 1)
			return 1;

		return fibo(x - 1) + fibo(x - 2);

	}

	public static void main(String args[])

	{
		int n = 0;

		System.out.println("Enter your NO.:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Fabinaci serese is.");
		for (int i = 0; i < n; i++)

			System.out.println(fibo(i));

	}

}
