import java.util.Scanner;

public class Question17 {
//Q17. WJP to find total number of integers, uppercase and lowercase character in the give string
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		int countNum = 0;
		int countUpper = 0;
		int countLower = 0;
		char[] c = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (c[i] >= 48 && c[i] <= 57) {
				countNum++;
			} else if (c[i] >= 65 && c[i] <= 90) {
				countUpper++;
			} else if (c[i] >= 97 && c[i] <= 122) {
				countLower++;
			} else
				continue;
		}
		System.out.println("Number of integers in a string is " + countNum);
		System.out.println("Number of LowerCase in a string is " + countLower);
		System.out.println("Number of Uppercase in a string is " + countUpper);
	}

}
