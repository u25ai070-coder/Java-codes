package Lab_6;
import java.util.Scanner;
public class Car1 
{
	public static void main(String args[])
	{
		String S1,S2;
		double AvgM,AvgS;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Detial of Maruti ------------>\n");
		System.out.print("Enter Maruti's Avg : ");
		AvgM=sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter Maruti's Model : ");
		S1=sc.nextLine();
		System.out.println("\n\nEnter Detial of Santro ------------>\n");
		System.out.print("Enter Santro's Avg : ");
		AvgS=sc.nextDouble();
		sc.nextLine();
		System.out.println();
		
		
		System.out.print("Enter Santro's Model : ");
		S2=sc.nextLine();
		
		Maruti MS=new Maruti("--------------Maruti------------------");
		MS.Avg(AvgM);
		MS.Mode(S1);
		
		santro S=new santro("----------------Hyundai---------------");
		S.Avg(AvgS);
		S.Mode(S2);
		
		sc.close();
	}
}
