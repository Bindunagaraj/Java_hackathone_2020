import java.util.Scanner;
// WJP to find total number of repeated integers, uppercase and lowercase character in the give string 
public class Question20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		int l=str.length();
		char[] num=null;//new char[l];
		char[]low=null;//new char[l];
		char[]up=null;//new char[l];
		
		int l1=0;
		int l2=0;
		int l3=0;
		char[] c = str.toCharArray();
		for (int i = 0; i < str.length(); i++)
		{
		if(c[i] >= 48 && c[i] <= 57) {
		num[i]=str.charAt(i);
		l1++;}
		else if (c[i] >= 65 && c[i] <= 90) {
		up[i]=str.charAt(i);
		l2++;
			} else if (c[i] >= 97 && c[i] <= 122) {
				low[i]=str.charAt(i);
				l3++;
			} else
				continue;
		}
		
		int[] n1=new int[num.length];
		int[] n2=new int[low.length];
		int[] n3=new int[up.length];
		for(int i=0;i<num.length;i++)
		{  
		 int countNum=1;
		  for(int j=i+1;j<num.length;j++)
			{ 
			if(num[i]==num[j])
				countNum++;
			}
			if(countNum>2)
				n1[i]=countNum;
		}
		for(int i=0;i<low.length;i++) {
			int countLower=1;
			for(int j=i+1;j<low.length;j++)
			{
				if(low[i]==low[j])
					countLower++;
			}
			if(countLower>2)
				n3[i]=countLower;
		}
		for(int i=0;i<num.length;i++) {
		int countUpper=1;
		  {
			for(int j=i+1;j<up.length;j++)
			{
				if(low[i]==low[j])
					countUpper++;
			}
			if(countUpper>2)
				n3[i]=countUpper;
		}}
		
	int sum1=0;
	int sum2=0;
	int sum3=0;

	for(int i=0;i<num.length;i++) {
		sum1=sum1+num[i];
	}
	System.out.println("Number of repeted integers are " + sum1);
	for(int i=0;i<low.length;i++) {
		sum2=sum2+num[i];
	}
    System.out.println("Number of repeated lowercase character is " + sum2);
	for(int i=0;i<up.length;i++) {
		sum3=sum3+num[i];
	}
	System.out.println("Number of repeated Uppercase character is " + sum3);

} 
	}
