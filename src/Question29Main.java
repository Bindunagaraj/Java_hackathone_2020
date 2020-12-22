import java.util.Scanner;

public class Question29Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length of an array");
		int n = sc.nextInt();
		System.out.println("Enter the values of an array");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Sorted array is ");
	Question29Class m = new Question29Class();
		System.out.println("before calling sort");
		m.sort(array, 0, array.length - 1);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}


	}

}
