package LAB_8;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class HisToHer 
{
	public static void main(String args[])
	{
		String S1 ="";
		int ch;
		try 
		{
			FileReader fr=new FileReader("E:\\java try\\FIle HAndeling\\sdj.txt");
			
			while((ch=fr.read())!=-1)
			{
				S1=S1+(char)ch;
			}
			System.out.println(S1);			
			String arr[]=S1.split(" ");
			S1="";
			for(String Str : arr)
			{
				if(Str.equalsIgnoreCase("his"))
				{
					Str="Her";
					S1=S1+Str+" ";
				}
				else
				{
					S1=S1+Str+" ";
				}
			}
				
			FileWriter fw=new FileWriter("E:\\java try\\FIle HAndeling\\sdj.txt");
			
			fw.write(S1);
			fw.close();
			fr.close();
			
			
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
