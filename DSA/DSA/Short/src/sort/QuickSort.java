package sort;

public class QuickSort {

	public static void PrintFunn(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {

			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 9, 13, 25, 5, 6, 32, 1, 4, 8, 7 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}

		PrintFunn(arr);
	}

}
