import java.util.Scanner;

public class Question18 {
//Q18. WJP to display duplicate character in string
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		char[] c=str.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{int count=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
					count++;	
				else 
					continue;
			}
			if(count>1 && c[i]!=' ')
				System.out.println("character "+c[i]+" is duplicate");
			else
				continue;
		}
	}
}
