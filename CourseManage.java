package Lab_7;
import java.util.Scanner;
import MY_DEFINE_METHOD.NoNegetiveException;
public class CourseManage 
{
	public static void main(String args[])
	{
		String INM,IND;
		int INDU;
		double INF;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter MemberID : ");
		INM=sc.nextLine();
		System.out.print("Enter Course Description : ");
		IND=sc.nextLine();
		System.out.print("Enter How many months : ");
		INDU=sc.nextInt();
		if(INDU<0)
		{
			try
			{
				throw new NoNegetiveException("Can't be negetive");
			}
			catch(NoNegetiveException ex)
			{
				sc.close();
				ex.printStackTrace();
				System.exit(0);
			}
		}
		sc.nextLine();
		System.out.print("Enter Fees : ");
		INF=sc.nextDouble();
		Course C=new Course(INM,IND,INDU,INF);
		C.GetData();
		sc.close();
		
	}
}
