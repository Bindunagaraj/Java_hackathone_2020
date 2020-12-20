import java.util.Scanner;

public class Question3 {
	// Q3. Given an array of integers, sort the integer values.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the values of Integer to an array arr");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr, n);

	}

	public static void sort(int[] array, int size) {
		System.out.println("Sorted array is");
		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.println(array[i]);
		}
	}

}
