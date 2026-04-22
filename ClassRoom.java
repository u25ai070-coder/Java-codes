package Lab_7;
import java.util.Scanner;
import MY_DEFINE_METHOD.NoNegetiveException;
public class ClassRoom 
{
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("HOw many Students DAta you want to add");
		int n=sc.nextInt();
		
		Student[] S=new Student[n];
		sc.nextLine();
		for(i=0;i<n;i++)
		{
			S[i]=new Student();
			
			System.out.print("Enter Name : ");
			S[i].Name=sc.nextLine();
			System.out.print("Enter Age : ");
			S[i].age=sc.nextInt();
			if(S[i].age<0)
			{
				try
				{
					throw new NoNegetiveException("Age Can't Be negetive");
				}
				catch(NoNegetiveException ex)
				{
					ex.printStackTrace();
					System.exit(0);
				}
			}
			System.out.print("Enter Roll NO : ");
			S[i].rollNo=sc.nextInt();
			if(S[i].rollNo<0)
			{
				try
				{
					throw new NoNegetiveException("ROll Can't Be negetive");
				}
				catch(NoNegetiveException ex)
				{
					ex.printStackTrace();
					System.exit(0);
				}
			}
			sc.nextLine();
			System.out.print("Enter School : ");
			S[i].School=sc.nextLine();
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Student"+(i+1)+"'s Detail\n");
			S[i].ShowName();
			S[i].ShowrollNo();
			S[i].ShowAge();
			S[i].ShowSchool();
		}
		sc.close();
	}
}
