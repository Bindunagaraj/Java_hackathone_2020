
import java.util.Scanner;

public class Question19 {
//Q19. WJP to display number of occurrence of all character
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine().toLowerCase();
		int l=str.length();
		int[] n=new int[l];
		int count=0;
		char hi=' ';
		int a=0;
		int[] c=new int[l];
		char[] ch=str.toCharArray();
		int[] save=new int[l];
		for(int i=0;i<l;i++)
		{   count=1;  
			for(int j=i+1;j<l;j++)
			{
				if(ch[i]==ch[j])
					{
					count++;
					a=j;
					ch[a]=' ';
					}
				
			
			}
			if(ch[i]!=' ')
 System.out.println("character "+ch[i]+" occurs "+count+" times");
			}
		
	}
}
