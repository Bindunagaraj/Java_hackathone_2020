import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WJP to perform ascending order Selection sort

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the values of Integer to an array arr");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		selectionSorting(arr, n);
	}

	public static void selectionSorting(int[] array, int size) {
		int temp = 0;
		System.out.println("Selction sorting in ascending order is ");
		for (int i = 0; i < size; i++) {
			int minimum = i;
			for (int j = i + 1; j < size; j++) {
				if (array[j] < array[minimum])
					minimum = j;
			}
			temp = array[i];
			array[i] = array[minimum];
			array[minimum] = temp;

		}
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}

	}

}
