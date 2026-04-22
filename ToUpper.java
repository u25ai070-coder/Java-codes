package LAB_8;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class ToUpper 
{
	public static void main(String args[])
	{
		try 
		{
			FileReader fr=new FileReader("E:\\java try\\FIle HAndeling\\console.txt");
			String S1="";
			int ch;
			while((ch=fr.read())!=-1)
			{
				S1=S1+(char)ch;
			}
			System.out.println(S1);
			String arr[]=S1.split(" ");
			S1="";
			for(String str : arr)
			{
				S1=S1+str.substring(0,1).toUpperCase()+str.substring(1)+" ";
			}
			FileWriter fw=new FileWriter("E:\\java try\\FIle HAndeling\\console.txt");
			fw.write(S1);
			System.out.println(S1);
			fr.close();
			fw.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
	}
}
