package LAB_8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;

public class RearrangeAndDel 
{
	public static void main(String args[])
	{
		FileReader fr=null;
		FileWriter fw=null;
		File f1=null;
		try
		{
			f1= new File("E:\\java try\\FIle HAndeling\\name.txt");
			fr= new FileReader(f1);
			ArrayList<String> names = new ArrayList<>();
			String s1="";
			int ch;
			while(((ch=fr.read())!=-1))
			{
				if((char)ch!='\n')
					s1=s1+(char)ch;
				else {
					if(s1.length()>3)
						names.add(s1.substring(3));
					else
						names.add("");
					s1="";
				}
			}
			fr.close();
			
			int n = names.size();
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					if(names.get(i).compareTo(names.get(j))>0)
						Collections.swap(names,i,j);
				}
					
			}
			
			fw = new FileWriter(f1);
			for(String name : names) 
				fw.write(name);
			fw.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}

}
