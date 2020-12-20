import java.util.Scanner;

public class Question16 {
//Q16. Write a method that will remove given character from the String?
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		System.out.println("Enter a character you want to remove from String");
		char c = sc.next().charAt(0);
		String s = "";
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != c)
				s = s + str.charAt(i);

		}

		System.out.println("New String is " + s);

//for(int i=0;i<str.length();i++)
//{
//System.out.print(s[i]);
		// }

	}

}
