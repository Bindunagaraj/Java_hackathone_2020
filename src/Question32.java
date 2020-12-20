import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

//Q32. You are given two sorted arrays, A and B, and A has a large enough bu#er at the end to hold B. 
//Write a method to merge B into A in sorted order.
public class Question32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length of an array 1");
		int n1 = sc.nextInt();
		System.out.println("Enter a length of an array 2");
		int n2 = sc.nextInt();
		int s = 0;
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		System.out.println("Enter array 1");
		for (int i = 0; i < (n1 - n2); i++) {
			arr1[i] = sc.nextInt();
			array1.add((Integer) arr1[i]);
		}
		System.out.println("Enter array 2");
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
			array2.add((Integer) arr2[i]);
		}
		merge(array1, array2);
	}

	public static void merge(ArrayList<Integer> one, ArrayList<Integer> two) {
		if (one.size() > two.size()) {
			two.addAll(one);
			Collections.sort(two);
			Iterator<Integer> it = two.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		} else {
			one.addAll(two);
			Collections.sort(one);

			Iterator<Integer> it = one.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}

}
