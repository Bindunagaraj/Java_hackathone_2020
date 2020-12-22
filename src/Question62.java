import java.util.Scanner;

public class Question62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter length of an array");
int len=sc.nextInt();
System.out.println("Enter elements for an array");
int[] array=new int[len];
for(int i=0;i<len;i++)
{
	array[i]=sc.nextInt();
}
reverse(array,len);

	}
	public static void reverse(int[] array1,int l)
	{int k=3;
	
		for(int i=0;i<l;i=i+3)
		{ int left=i;
		int right=Math.min(i+k-1, l-1);
			int temp=0;
			temp=array1[left];
			array1[left]=array1[right];
			array1[right]=temp;
		}
		for(int i=0;i<l;i++)
		{
			System.out.println(array1[i]);
		}
	}

}
