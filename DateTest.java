import java.util.Scanner;
class Date
{
    private int Day;
    private int Month;
    private int Year;
    Date(int D,int M,int Y)
    {
        Day=D;
        Month=M;
        Year=Y;
    }
    void SetDay(int D)
    {
        Day=D;
    }
    void GetDay()
    {
        System.out.println("DAY :"+Day);
    }
    void SetMonth(int M)
    {
        Month=M;
    }
    void GetMonth()
    {
        System.out.println("Month :"+Month);
    }
    void SetYear(int Y)
    {
        Year=Y;
    }
    void GetYear()
    {
        System.out.println("Year :"+Year);
    }
    void DisplayDate()
    {
        System.out.println(Day+"/"+Month+"/"+Year);
    }
}
class DateTest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int D,M,Y;
        String c;
        System.out.print("Enter your Day :");
        D=sc.nextInt();
        while(1!=0)
        {
            if(D>0 &&D<=31)
            {
                break;
            }
            else{
                System.out.print("Wrong input \n"+"TRy again :");
                D=sc.nextInt();
                sc.nextLine();
            }
        }
        System.out.print("Enter your Month :");
        M=sc.nextInt();
        while(1!=0)
        {
            if(M>0 &&M<13)
            {
                break;
            }
            else{
                System.out.print("Wrong input \n"+"TRy again :");
                M=sc.nextInt();
                sc.nextLine();
            }
        }

        System.out.print("Enter your Year :");
        Y=sc.nextInt();
        sc.nextLine();

        Date da=new Date(D,M,Y);
        da.DisplayDate();
        while(1!=0)
        {
            System.out.print("Enter Date to change date and like other 0 to exit code :");
            c=sc.nextLine();

            if(c.equalsIgnoreCase("Date"))
            {
                System.out.print("Enter your DAte :");
                D=sc.nextInt();
                sc.nextLine();
                da.SetDay(D);
            }
            else if(c.equalsIgnoreCase("Month"))
            {
                System.out.print("Enter your Month :");
                M=sc.nextInt();
                sc.nextLine();
                da.SetMonth(M);
            }
            else if(c.equalsIgnoreCase("Year"))
            {
                System.out.print("Enter your Year :");
                Y=sc.nextInt();
                sc.nextLine();
                da.SetYear(Y);
            }
            if(c.equalsIgnoreCase("0"))
            {
                break;
            }
            da.DisplayDate();

        }
    }
    
    
}