import java.util.Scanner;

//Q5. Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.
public class Question5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int a = n + 1;
		System.out.println("Enter the values to an array array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
					a = j;
				}

			}
			if (i != a) {
				if (count > 1 && i != a)
					System.out.println(arr[i] + " is not unique and occurence is " + count);

				else
					System.out.println(arr[i] + " is unique");

			} else
				continue;
		}

	}
}
