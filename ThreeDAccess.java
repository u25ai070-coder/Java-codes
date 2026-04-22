package Lab_6;
import java.util.Scanner;
public class ThreeDAccess 
{
	public static void main(String args[])
	{
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter X cordinate :");
		x=sc.nextInt();
		System.out.print("Enter Y cordinate :");
		y=sc.nextInt();
		System.out.print("Enter Z cordinate :");
		z=sc.nextInt();
		
		THreeD D=new THreeD(x,y,z);
		D.Distance();//to check the distance from origin 
		
		System.out.println("Enter the Second points ----->");
		System.out.print("Enter X cordinate :");
		x=sc.nextInt();
		System.out.print("Enter Y cordinate :");
		y=sc.nextInt();
		System.out.print("Enter Z cordinate :");
		z=sc.nextInt();
		
		D.input(x, y, z);
		D.Distance();
		
		
	}
		
		
}
