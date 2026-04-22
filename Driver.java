package Lab_7;
import java.util.Scanner;
import MY_DEFINE_METHOD.NoNegetiveException;
public class Driver extends Check
{
	public static void main(String args[])
	{
		String s1;
		Scanner sc=new Scanner(System.in);
	
		System.out.print("Do you HAve Licence");
		s1=sc.nextLine();
		Check Pass=new Check();
		if(s1.equalsIgnoreCase("YES"))
		{
			System .out.println("You ride scooter or car");
			s1=sc.nextLine();
			if(s1.equalsIgnoreCase("Scooter"))
		{
				System.out.println("Speed Limite is 70KM/H");
				System.out.println("Enter your Scooter's Speed ");
				s1=sc.nextLine();
				if(Integer.valueOf(s1)<0)
				{
					try
					{
						sc.close();
						throw new NoNegetiveException("SPeed CAn't be in negetive !!");
					}
					catch(NoNegetiveException ex)
					{
						ex.printStackTrace();
						System.exit(0);
					}
					
				}
				else if(Integer.valueOf(s1)>70)
				{
					try
					{
						sc.close();
						throw new NoNegetiveException("Speed limit reached");
					}
					catch(NoNegetiveException ex)
					{
						ex.printStackTrace();
						System.exit(0);
					}
					
				}
				else
				{
					Pass.ClassPAss(Integer.parseInt(s1),"Scooter");
				}
			}
			else if(s1.equalsIgnoreCase("Car"))
			{
				System.out.println("Speed Limite is 170KM/H");
				System.out.print("Enter your Car's Speed");
				s1=sc.nextLine();
				if(Integer.valueOf(s1)<0)
				{
					try
					{
						sc.close();
						throw new NoNegetiveException("SPeed CAn't be in negetive !!");
					}
					catch(NoNegetiveException ex)
					{
						ex.printStackTrace();
						System.exit(0);
					}
				}
				else if(Integer.valueOf(s1)>170)
				{
					try
					{
						sc.close();
						throw new NoNegetiveException("Speed limit reached");
					}
					catch(NoNegetiveException ex)
					{
						ex.printStackTrace();
						System.exit(0);
					}
				}
				else
				{
					Pass.ClassPAss(Integer.parseInt(s1),"Car");
				}
			}
		}
		else
		{
			
			System.out.println("You Dont Have license So ");
			System.out.print("Enter your Bicycle Speed");
			System.out.println("Speed Limit is 20KM/H");
			s1=sc.nextLine();
			if(Integer.valueOf(s1)<0)
			{
				try
				{
					sc.close();
					throw new NoNegetiveException("SPeed CAn't be in negetive !!");
				}
				catch(NoNegetiveException ex)
				{
					ex.printStackTrace();
					System.exit(0);
				}
			}
			else if(Integer.valueOf(s1)>20)
			{
				try
				{
					sc.close();
					throw new NoNegetiveException("SPeed CAn't be in negetive !!");
				}
				catch(NoNegetiveException ex)
				{
					ex.printStackTrace();
					System.exit(0);
				}
			}
			else
			{
				Pass.CyclePass(Integer.parseInt(s1));
			}
		}
		sc.close();
	}
}
