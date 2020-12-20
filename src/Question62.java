import java.util.Scanner;

//Q62. write an algorithm to reverse first 3 numbers, then next 3 numbers, then next 3 numbers, the number will be based on var k.
//Array = [3,2,4,7,0,3,1,5,8, 4]    k=3    OutPut = [4,2,3,3,0,7,8,5,1,4]
public class Question62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter length of an array");
int len=sc.nextInt();
System.out.println("Enter elements to array");
String str=sc.nextLine();
String sub=null;
int cut=3;
StringBuffer br=null;
String rev=null;
String[] array=new String[len];
//for(int i=0;i<array.length;i++)
for(int i=0;i<len;i=i+3)
{
  sub=str.substring(i);
  if(sub.length()<=3)
	  array[i]=sub;
  }

for(int i=0;i<array.length;i=i+3)
{
	
	
	br=new StringBuffer(array[i]);
	rev=br.reverse().toString();
	
	}
System.out.println("Output is");    
for(int i=0;i<array.length;i++)
{
	System.out.print(array[i]);
	}
	}

}
