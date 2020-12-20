import java.util.Scanner;

public class Question4 {
//*Given an array of integers check the Palindrome of the series.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the values of Integer to an array arr");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		palindrome(arr, n);

	}

	public static void palindrome(int[] array, int size) {
		int[] rev = new int[size];
		boolean result = true;
		for (int i = 0; i < size; i++) {
			rev[i] = array[(size - 1) - i];
		}
		for (int i = 0; i < size; i++) {
			if (array[i] != rev[i]) {
				result = false;
				break;
			}
		}
		if (result == true)
			System.out.println("Yes,Its a palindrome");
		else
			System.out.println("Not , its not a palindrome");
	}

}
