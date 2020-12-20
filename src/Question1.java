import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Assign true or false to  a");
boolean a=sc.nextBoolean();
System.out.println("Assign true or false to b");
boolean b=sc.nextBoolean();
System.out.println("Assign true or false to c");
boolean c=sc.nextBoolean();
if((a=b==true) || (b=c==true) || (c=a==true))
	System.out.println("Atleast two values are true");
	else
	System.out.println("No , Atleast Two values are not true");}
	

}
