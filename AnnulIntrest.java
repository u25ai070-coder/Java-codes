package Lab_7;
import java.util.Scanner;
import MY_DEFINE_METHOD.NoNegetiveException;
public class AnnulIntrest 
{
	public static void main (String args[])
	{
		int months;
		double BaseAmount,REsult;
		double IntrestRate=7.38;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Base Amount : ");
		BaseAmount=sc.nextDouble();
		if(BaseAmount<=0)
		{
			try
			{
				sc.close();
				throw new NoNegetiveException("Balance Can't Be negative or zero");
			}
			catch(NoNegetiveException ex)
			{
				ex.printStackTrace();
				System.exit(0);
			}
		}
		System.out.print("Enter Months : ");
		months=sc.nextInt();
		if(BaseAmount<=0)
		{
			try
			{
				sc.close();
				throw new NoNegetiveException("Months Can't Be Negetive ");
			}
			catch(NoNegetiveException ex)
			{
				ex.printStackTrace();
				System.exit(0);
			}
		}
		sc.close();
		REsult=inRate(months,BaseAmount,IntrestRate);
		System.out.println("Your Intrest is : "+REsult);
		
		
	}
	public static double inRate(int Months,double BaseA,double Rate)
	{
		return ((Months*BaseA*Rate)/1200);
	}
}
