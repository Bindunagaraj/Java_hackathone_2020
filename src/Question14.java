import java.util.Scanner;

public class Question14 {
//Q14. Given a string print the reverse of the words string.(Input: Java Code Output: Code Java)
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		String[] str1=str.split(" ");
		int size=str1.length;
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(str1[i]+" ");
		}
			
	}

}
