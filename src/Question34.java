import java.awt.BufferCapabilities.FlipContents;
import java.util.Scanner;

//Q34. Write a method to implement *, - , / operations. You should use only the + operator
public class Question34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operation u want to do on numbers n1 and n2");
		String str = sc.next();
		operation(str);
	}

	public static void operation(String s) {
		int result = 0;
		int n1 = 4;
		int n2 = 2;
		switch (s) {
		case "*": {
			result = n1 + n2;// add n1 , n2 times or vice versa
			System.out.println("multiplication of n1 and n2 is " + result);
		}
			break;
		case "-": {
			result = subtraction(n1, n2);
			System.out.println("subtraction  of n1 and n2 is " + result);
		}
			break;
		case "/": {
			result = division(n1, n2);
			System.out.println("division of n1 and n2 is " + result);
		}
			break;
		default:
			break;
		}
	}

	public static int subtraction(int a, int b) {
		return a + flipSign(b);
	}

	static int flipSign(int c) {
		int neg = 0;

		int tmp = c < 0 ? 1 : -1;
		while (c != 0) {
			neg = neg + tmp;
			c = c + tmp;
		}
		return neg;
	}

	// Check if a and b are of different signs
	static boolean areDifferentSign(int a, int b) {
		return ((a < 0 && b > 0) || (a > 0 && b < 0));
	}

	static int division(int a, int b) {
		if (b == 0)
			throw new ArithmeticException();

		int quotient = 0, dividend;

		// Negating b to subtract from a
		int divisor = flipSign(Math.abs(b));

		// Subtracting divisor from dividend
		for (dividend = Math.abs(a); dividend >= Math.abs(divisor); dividend += divisor)
			quotient++;

		// Check if a and b are of similar symbols or not
		if (areDifferentSign(a, b))
			quotient = flipSign(quotient);
		return quotient;
	}

}
