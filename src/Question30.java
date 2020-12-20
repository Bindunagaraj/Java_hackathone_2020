import java.util.Scanner;

//Q30. Write a function to find out longest palindrome in a given string?
public class Question30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine().toLowerCase();
		StringBuffer br1 = null;
		String[] s1 = str.split(" ");
		String[] s2 = new String[s1.length];
		for (int i = 0; i < s1.length; i++) {
			br1 = new StringBuffer(s1[i]);
			s2[i] = br1.reverse().toString();

		}
		int longest = 1;
		int index = 0;
		for (int i = 0; i < s1.length; i++) {
			int l = 0;
			int a = 0;

			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					l = s1[i].length();
					a = i;
				}

			}
			if (l > longest) {
				longest = l;
				index = i;
			}
		}
		System.out.println("longest palindrome in a string is at " + s1[index] + "and its length is " + longest);

	}
}
