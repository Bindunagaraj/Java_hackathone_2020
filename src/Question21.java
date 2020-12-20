import java.util.Scanner;

//Q21. WJP to convert string to int
public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number in String");
		String str = sc.nextLine();
		int n = Integer.parseInt(str) ;
		System.out.println("int value of string str is "+ n);
	}

}
