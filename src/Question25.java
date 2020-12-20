import java.util.Scanner;

public class Question25 {
private static int mid;

//Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements.
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int n = 5;
	int[] array = new int[n];
	System.out.println("Enter array elements in sorted order");
	for (int i = 0; i < n; i++) {
		array[i] = sc.nextInt();
	}
	System.out.println("enter an element u want to search");
	int x = sc.nextInt();

	int result = binarySearch(array, 0, n-1, x);
	System.out.println("given element is found at index " + result);
}

public static int binarySearch(int[] array, int begining, int last, int search) {
	
	if(last>=begining) {
	int  mid=(last+begining)/2;
	
	if (search==array[mid])
		return mid; 
	
	else if (search < array[mid])
		return binarySearch(array, 0, (mid-1), search);
	else if (search > array[mid])
		return binarySearch(array, mid, last-1, search);
	}
	return -1;
	
}
}
