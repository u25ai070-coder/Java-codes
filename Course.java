package Lab_7;

public class Course 
{
	private String memberID;
	private String Description;
	private int Duration;
	private double Fees;
	
	Course(String memberID,String Description,int Duration,double Fees)
	{
		this.memberID=memberID;
		this.Description=Description;
		this.Duration=Duration;
		this.Fees=Fees;
	}
	void GetData()
	{
		System.out.println("---------------DATA--------------\n");
		System.out.println("Member Id\t:\t"+memberID);
		System.out.println("Description\t:\t"+Description);
		System.out.println("Duration\t\t:\t"+Duration);
		System.out.println("FEES\t\t:\t"+Fees);
	}
}
