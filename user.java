package Lab_6;
import MY_DEFINE_METHOD.NoNegetiveException;

import java.util.Scanner;
class user{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Delay D=new Delay();
		String S1;
		int no;
		WashingMachine Thor=new WashingMachine();
		System.out.print("Want to Wash cloths Yes or No:");
		S1=sc.nextLine();
		if(S1.equalsIgnoreCase("Yes"))
		{
			
			System.out.print("How many Cloths you want to enter :");
			no=sc.nextInt();
			if(no<0)
			{
				try
				{
					sc.close();
				throw new NoNegetiveException("Number can't be Negetive ");
				}
				catch(NoNegetiveException ex)
				{
					ex.printStackTrace();
					System.exit(0);
				}
			}
			else
			{
		
			}
			D.delay(2500);
			Thor.switchon();
			D.delay(2500);
			Thor.detergent();
			D.delay(3000);
			Thor.switchoff();
			sc.close();
		}
		else
		{
			System.out.println("");
			sc.close();
			System.exit(1);
		}
		
	}
}

