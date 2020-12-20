import java.awt.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Question26 {
	/*
	 * Q26. WJP to merge two sorted array.(Do not use third array) array1[10] =
	 * 1,2,4,6,9,10 array2[4] = 3, 5,7,8 After merge : array1[10] =
	 * 1,2,3,4,5,6,7,8,9,10
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		array2.addAll(array1);
		Collections.sort(array2);
		Iterator<Integer> it = array2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}