import java.util.Scanner;

public class Question13 {
//Q13. Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
String str=sc.nextLine();
String[] str1=str.split(" ");
int size=str1.length;
String[] finalRev=new String[size];

for(int i=0;i<size;i++)
{
StringBuffer br=new StringBuffer(str1[i]);
String rev=br.reverse().toString();	
finalRev[i]=rev;

}
for(int i=size-1;i>=0;i--)
{
	System.out.println(finalRev[i]);
	}
}
}
