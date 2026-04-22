package Lab_7;
import java.util.Scanner;
import MY_DEFINE_METHOD.OnlyNameException;
public class Book 

{
	public static void main(String args[])
	{
		String Check;
		int count=0;
		Period C=new Period();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Book ID :");
		Check=sc.nextLine();
		C.setId(Check);
		System.out.print("Enter Author :");
		Check=sc.nextLine();
		C.setAuthor(Check);
		System.out.print("Enter Prize:");
		Check=sc.nextLine();
		try {
		C.setPrize(Integer.parseInt(Check));
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Incorrect input !!!!!!! Code terminated ");
			System.exit(0);
		}
		System.out.print("Enter Period ");
		Check=sc.nextLine();
		C.setPeriod(Check);
		System.out.println("");
		C.getPeriod();
		C.getId();
		C.getAuthor();
		C.getPrize();
		System.out.println("You want to change Period : ") ;
		Check=sc.nextLine();
		if(Check.equalsIgnoreCase("YEs")) {
			System.out.println("Enter PEriod") ;
			C.setPeriod(sc.nextLine());
			
			System.out.println("ENter THe Prize you want to change : ") ;
		
			C.setPrize(Integer.parseInt(sc.nextLine()));
		}
		else
		{
			System.exit(0);
		}
		C.getPeriod();
		C.getId();
		C.getAuthor();
		C.getPrize();
		
	}
}
