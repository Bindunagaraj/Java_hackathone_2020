
import java.util.Scanner;

public class Question19 {
//Q19. WJP to display number of occurrence of all character
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int count = 1;
			int a = c.length + 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
					a = j;
					c[a] = ' ';
				} else
					continue;
			}
			if (count >= 1 && c[i] != ' ')
				System.out.println("number of occurance of character " + c[i] + " is " + count);
			else
				continue;
		}
	}
}
