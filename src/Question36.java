import java.util.Scanner;

public class Question36 {
	//Q36. Write to test scenarios to test Pencil
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("whats the colour of pencil");
		String color=sc.next();
		if(color=="black")
			System.out.println("u can use for writing");
		else 
			System.out.println("u can do colouring with it");
		
		System.out.println("is the size of pencil is enough to hold it , yes or no");
		String enough=sc.next();
		if(enough=="yes") 
			{
			System.out.println("then, u r good to write");
		System.out.println("is it writing nicely");
		String nice=sc.next();
		if(nice=="yes")
			System.out.println("thank you");
		else
			System.out.println("do change ur pencil");}
		else 
			System.out.println("change ur pencil, yes or no");
		}
		
		
			
	}


