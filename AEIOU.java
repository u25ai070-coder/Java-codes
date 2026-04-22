package LAB_8;
import java.io.FileReader;
import java.io.IOException;
public class AEIOU 
{
	public static void main(String args[])
	{
		try
		{
			FileReader fr=new FileReader("E:\\java try\\FIle HAndeling\\console.txt");
			int ch,count=0;
			while((ch=fr.read())!=-1)
			{
				if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u'|| ch=='A'||ch=='E'|| ch=='I'||ch=='O'|| ch=='U')
				{
					System.out.println("Char : "+(char)ch+" Occurance : "+count);
				}
				count++;
			}
			fr.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
