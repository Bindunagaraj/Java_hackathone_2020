import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question31 {
//	Q31. Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)

	public static void main(String[] args) throws IOException {
		 
		try {
	String str1=System.getProperty("user.dir")+"\\Original.txt";
	System.out.println(str1);
	
	FileReader fr=new FileReader(str1);
	BufferedReader bor=new BufferedReader(fr);
    String str2=System.getProperty("user.dir")+"\\Written.txt";
    FileWriter fwr=new FileWriter(str2);
    System.out.println(str2);
    BufferedWriter bwr=new BufferedWriter(fwr);
    String str3=null;
    String[] str=new String[10];
    int i=9;  
    while((str3=bor.readLine())!=null)
    {      
    	str[i]=str3;
    	i--;
    }
    for(int j=0;j<10;j++)
    {
    	bwr.write(str[j]);
    	bwr.newLine();
    }
    System.out.println("Writing is done");
   bwr.close();
   bor.close();
    
	}catch(Exception e)
		{
		System.out.println("there is an exception correct it "+e);
		}
		}

}
