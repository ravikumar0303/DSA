package sort;

public class insertion {

	public static void PrintFunn(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {

			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 9, 13, 25, 5, 6, 32, 1, 4, 8,9};

		for (int i = 1; i < arr.length-1; i++) {
			int temp = arr[i]; // 13
			int j = i - 1;//9
//			for(int j=i-1;j>=0 && arr[j]>temp;j--) {
			while ( j>=0 && temp > arr[j]) {
				
//                arr[i]=arr[j];
				arr[j+1] =arr[i];
				j--;
//					arr[j]=temp;

			}
			arr[j + 1] = temp;

		}

		PrintFunn(arr);
	}

}
