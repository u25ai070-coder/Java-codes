import java.util.Scanner;
class CustomerAccount
{
    String AccNo;
    double BeginBal;
    double Charge;
    double Credit;
    double CreditLim;

    
    double CalNewBalance()
    {
        return BeginBal + Charge - Credit;
    }

    
    void checkCreditLimi()
    {
        double newBalance = CalNewBalance();

        System.out.println("\nAccount Number: " + AccNo);
        System.out.println("New Balance: " + newBalance);

        if(newBalance > CreditLim)
        {
            System.out.println("Credit limit exceeded!");
        }
        else
        {
            System.out.println("Within credit limit.");
        }
    }
}

class Manage
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        CustomerAccount Nig = new CustomerAccount();

        System.out.print("Enter Account Number: ");
        Nig.AccNo = sc.nextLine();

        System.out.print("Enter Beginning Balance: ");
        Nig.BeginBal = sc.nextDouble();

        System.out.print("Enter Total Charges: ");
        Nig.Charge = sc.nextDouble();

        System.out.print("Enter Total Credits: ");
        Nig.Credit = sc.nextDouble();

        System.out.print("Enter Credit Limit: ");
        Nig.CreditLim = sc.nextDouble();

        
        Nig.checkCreditLimi();
    }
}
