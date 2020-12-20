import java.util.Scanner;

public class Question12 {
//Q12. Write a program to check palindrome (MalayalaM) for both numbers and string?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
String str=sc.next().toLowerCase();
StringBuffer br1=new StringBuffer(str);
String rev1=br1.reverse().toString();
if(str.equals(rev1))
		System.out.println("String is palindrome");
else
	System.out.println("String is not a palindrome");

System.out.println("Enter an integer number");
String n=sc.next();
StringBuffer br2=new StringBuffer(n);
if(n.equals(br2.reverse().toString()))
	System.out.println("String is palindrome");
else
System.out.println("String is not a palindrome");

	}

}
