import java.util.Scanner;

//Q35. Write test cases for how to test just the withdrawing functionality from ATM ( Minimum 10 test cases required )
public class Question35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int attempts =1;
		System.out.println("enter ur ATM card");
		boolean cardRead = sc.hasNext();
		if (cardRead == false)
			System.out.println("Sorry ,Insert ur card again");
		else {
			System.out.println("Enter password");
			boolean password =sc.hasNext();
			
			if (password = false) {
				System.out.println("Enter correct password");
				attempts--;
				System.out.println("Sorry transaction failed , we want authentication");
				System.out.println("Do u prefer text or email");
				String preference = sc.next();
				System.out.println("Enter 10 digit regestered phone number");
				String phone = sc.next();
			} else {
				System.out.println("ur transaction is successful");

			}

		}
	}

}
