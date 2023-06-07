

///////2. 1. Implement Binary search


package search;

public class BinarySearch {

	public static void BinarySearch(int arr[], int first, int last, int key) {

		int mid = (first + last) / 2;

		while (first <= last)

		{
			if (arr[mid] < key) {
				first = mid + 1;
			}

			else if (arr[mid] == key) {
				System.out.println("\t"+key+"  Element is found in.>  " + mid + " Index.");
				break;

			} else {
				last = mid - 1;
			}

			mid = (first + last) / 2;
		}

		if (first > last) {
			System.out.println("Element not Found.");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 12, 23, 31, 35, 37, 47, 49, 51, 54, 57, 59, 64, 67, 69 };
		int key = 47;
		BinarySearch(arr, 0, arr.length - 1, key);

	}

}
