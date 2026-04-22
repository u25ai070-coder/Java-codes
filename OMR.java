package Lab_7;
import java.util.Scanner;
public class OMR 
{
	public static void main(String args[])
	{
		String CoR,Ans;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ANswer kEY");
		CoR=sc.nextLine();
		CoR=CoR.toUpperCase();
		System.out.print("Enter your ANswer");
		Ans=sc.nextLine();
		Ans=Ans.toUpperCase();
		
		for(int i=0;i<CoR.length();i++)
		{
			if(CoR.charAt(i)==Ans.charAt(i))
			{
				count++;
			}
		}
		if(count>=2)
		{
			System.out.print("You Passed!!!!!!");
		}
		else
		{
			System.out.print("You Failed iiii");
		}
		sc.close();
	}
}
