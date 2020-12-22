import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter an Integer , string or boolean value");
String str=sc.next().toUpperCase();
if(str.equals("true") || str.equals("false"))
	System.out.println("Given input is string");
	
	else if(str.length()==1 && (str.charAt(0)>49 && str.charAt(0)<54))
		System.out.println("Its an integert value");
	else if(str.length()>2 )
			System.out.println("its a boolean");

}
}