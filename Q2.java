import java.util.Scanner;
class Q2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number :");
        int n1=sc.nextInt();

        System.out.print("Enter your Second Number :");
        int n2=sc.nextInt();

        if(n1>n2)
        {
            System.out.println(n1+"  IS LArge ");
        }
        else if(n1==n2)
        {
            System.out.println("Are equal ");
        }
        else
        {
            System.out.println(n2+"  is large");
        }

    }
}