import java.util.Scanner;
//write a program to find factorial (Non Recursive)
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of an integer, whoes factorial you want to find");
int n=sc.nextInt();
int product=1;
for(int i=1;i<=n;i++)
{
	product=(product*i);
	}
System.out.println("Factorial of a number n is "+ product);

	}

}
