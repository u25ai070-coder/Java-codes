import java.util.Scanner; 
class Detail
{
    private String Name;
    private String LastName;
    private double MonthlySalary;
    double test;

    Detail(String N,String L,Double MS)
    {
        Name=N;
        LastName=L;
        test=MS;
        if(test>0)
        {
            MonthlySalary=test*12;
        }

    }
    
    void GetName()
    {
        System.out.println("Name :\t"+Name);
    }
    void GetLastName()
    {
        System.out.println("Last Name :\t"+LastName);
    }
    void SetYearlySalary()
    {
        MonthlySalary=  MonthlySalary+(MonthlySalary/10);
    }
    void GetYearlySalary()
    {
        if(MonthlySalary-MonthlySalary/10>0)
        System.out.println("Monthly salary :\t"+MonthlySalary);
    }

}
class Employee
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String N,L;
        double MS;
        System.out.println("Enter for DEatail of First emplyee");
        System.out.print("Enter your name :");
        N=sc.nextLine();
        System.out.print("\nEnter your last name :");
        L=sc.nextLine();
        System.out.print("\nEnter your Monthly Salary :");
        MS=sc.nextDouble();
        sc.nextLine();

        Detail p1=new Detail(N,L,MS);

        System.out.println("Enter for DEatail of Second emplyee");
        System.out.print("Enter your name :");
        N=sc.nextLine();
        System.out.print("\nEnter your last name :");
        L=sc.nextLine();
        System.out.print("\nEnter your Monthly Salary :");
        MS=sc.nextDouble();

        Detail p2=new Detail(N,L,MS);
    
    p1.GetName();
    p2.GetName();
    p1.GetLastName();
    p2.GetLastName();
    p1.GetYearlySalary();
    p2.GetYearlySalary();

    System.out.println("\n\nAfter 10% hike ----->");
    p1.SetYearlySalary();
    p2.SetYearlySalary();
    p1.GetYearlySalary();
    p2.GetYearlySalary();
    }
}