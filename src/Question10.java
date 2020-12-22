//Q10. What is String subsequence method?
public class Question10 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hello ll sir";
CharSequence subsequence1=str.subSequence(2,5);
int count=0;
for(int i=0;i<str.length();i++)
{
	if(str.contains(subsequence1))
		count++;
	}
System.out.println("subsequnec of "+subsequence1+ "  occurs "+count+" times");
	}

}
