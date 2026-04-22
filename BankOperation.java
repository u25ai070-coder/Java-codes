package Lab_6;
import java.util.Scanner;
public class BankOperation 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String S1;
		double base,FInal;
		System.out.print("Enter your balance : ");
		base=sc.nextDouble();
		sc.nextLine();
		System.out.print("Deposite or WIthdraw");
		System.out.println("\nWhich operation YOu want to perform : ");
		S1=sc.nextLine();
		if(S1.equalsIgnoreCase("Deposite"))
		{
			System.out.print("Enter how much you want to Deposite : ");
			FInal=Deposite(sc.nextDouble(),base);
			System.out.println("\nFinal BAlance "+FInal);
		}
		else
		{
			System.out.print("Enter How much you want to Withdraw : ");
			FInal=Withdraw(sc.nextDouble(),base);
			if(FInal==0)
			{
				System.out.println("INcufficiant Balance ");				
			}
			else
			{
				System.out.println("Final BAlance "+FInal);
			}
			
		}
		sc.close();
	}
	public static double Withdraw(double IN,double base)
	{
		
		if(base-IN<0)
		{
			return 0;
		}
		else
		{
			return base-IN;
		}
	}
	public static double Deposite(double IN,double base)
	{
		return IN+base;
	}
}
