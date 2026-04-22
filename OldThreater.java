package Lab_6;
import MY_DEFINE_METHOD.NoNegetiveException;
import java.util.Scanner;
public class OldThreater 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("How many people attended Threater :");
		int Attendee=sc.nextInt();
		if(Attendee<0)
		{
			try
			{
				throw new NoNegetiveException("Negetive Number Can't be accepted !!");
			}
			catch(NoNegetiveException ex)
			{
				ex.printStackTrace();
				System.exit(0);
			}
		}
		double profit=Profit(Attendee);
		if(profit<0)
		{
		System.out.print("THreaters is in lose of : "+profit);
		}
		else
		{
			System.out.print("THreaters total profit is : "+profit);
		}
		
	}
	public static double Profit(int Attendee)
	{
		return ((5*Attendee)-(Attendee*0.5))-20;
	}
	
	
}
