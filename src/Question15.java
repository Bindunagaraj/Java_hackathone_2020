import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Question15 {
//Q15. Given a string print the unique words of the string.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		String[] str1 = str.split(" "); 
		int size = str1.length;

		String s = " ";
		for (int i = 0; i < str1.length; i++) {
			int count = 1;
			for (int j = i + 1; j < str1.length; j++) {
				if (str1[i].equalsIgnoreCase(str1[j])) {
					count++;
				s = str1[i];}
			}
			if (count == 1 && !str1[i].equals(s)) {
				System.out.println();
				System.out.println(str1[i] + " is Unique word ");
			}
		}

	}

}
