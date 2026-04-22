package LAB_8;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FirstAndLastThe 
{
	public static void main(String args[])
	{
		try
		{
			FileReader fr=new FileReader("E:\\java try\\FIle HAndeling\\console.txt");
			BufferedReader br=new BufferedReader(fr);
			String s1,line;
			StringBuffer Sb=new StringBuffer("");
			int ch,hc;
			s1="";
			while((line=br.readLine())!=null)
			{
				Sb=Sb.append(line);
			}
			ch=Sb.indexOf("The");
			hc=Sb.lastIndexOf("The");
			s1=Sb.substring(ch, hc);
			System.out.println(s1);
			br.close();
			fr.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
