import java.util.Scanner;

//Q27. WJP to perform ascending order Quick sort
public class Question27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int l = sc.nextInt();
		System.out.println("Enter elements of an array");
		int[] arr = new int[l];
		for (int i = 0; i < l; i++) {
			arr[i] = sc.nextInt();

		}

		sort(arr, 0, l - 1);

		System.out.println("sorted array");
		printArray(arr);
	}

	public static void sort(int arr[], int low, int high) {
		if (low < high) {
			
			int pi = partition(arr, low, high);

			
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	public static int partition(int arr[], int small, int large) {
		int pivot = arr[large];
		int i = (small - 1); 
		for (int j = small; j < large; j++) {
			
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		
		int temp = arr[i + 1];
		arr[i + 1] = arr[large];
		arr[large] = temp;

		return i + 1;
	}

	
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
