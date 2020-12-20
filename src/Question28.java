import java.util.Scanner;

//Q28. WJP to find factorial of a number using recursion
public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("ENter a number , whose factorial u want to find");
int n=sc.nextInt();
System.out.println(factorial(n));
	}
public static int factorial(int num)
{  if(num<=1)
return 1; 
else
	return(num*factorial(num-1));

	}
}
