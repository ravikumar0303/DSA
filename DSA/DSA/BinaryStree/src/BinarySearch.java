import java.util.Scanner;
public class BinarySearch {


		public static void main(String[] args) {
            System.out.println("// { 2, 5, 8, 11, 23, 39, 47, 58, 69,21,63,45,85,25,12,45,69,88,25,45,62,48,58 }");
//			int data[] = { 2, 5, 8, 11, 23, 39, 47, 58, 69,21,63,45,85,25,12,45,69,88,25,45,62,48,58 };
			int data[]= {52,87,465,58,45,85,74,22};
            int v=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Search Number:");
			v=sc.nextInt();
			
			
			binarySearch(data, 1, data.length - 1, v);

		}

		public static void binarySearch(int[] arr, int l, int h, int v) {
			if (l <= h) {
				int mid = (l + h) / 2;
				if (arr[mid] == v) {
					System.out.println("Data Found at position--> " + (mid + 1));
					return;
				} else if (arr[mid] > v)
					binarySearch(arr, l, mid - 1, v);
				else
					binarySearch(arr, mid + 1, h, v);

			} else
				System.out.println("Data Not Found !");
		}
	}



