import java.util.Scanner;

/*Q24. Write a program which inputs a positive natural number N and
prints the possible consecutive number combinations, which when added give N.  
INPUT: N = 9  OUTPUT: 4 + 5     2 + 3+ 4 
*/
public class Question24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive natural number");
		int n = sc.nextInt();
		int[] numArr = new int[n];
		for (int i = 0; i < n; i++) {
			numArr[i] = i;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((numArr[i] + numArr[j]) == n)
					System.out.println("given number is a sum of " + numArr[i] + " and " + numArr[j]);
			}
		}

	}

}
