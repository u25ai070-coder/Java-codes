import java.util.Scanner;
class ParkingCharges
{
    
    double calCharges(int hours)
    {
        double charge = 2.0;   // minimum charge for up to 3 hours

        if(hours > 3)
        {
            charge = charge + (hours - 3) * 0.5;
        }

        if(charge > 10.0)   
        {
            charge = 10.0;
        }

        return charge;
    }
}

class Garage
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int hours,Per;
        double charge;
        double total = 0.0;
        System.out.print("Enter How many Peson's data you want to add : ");
        Per=sc.nextInt();       
        for(int i = 1; i <= Per; i++)
        {
            System.out.print("Enter hours parked for customer " + i + ": ");
            hours = sc.nextInt();
            ParkingCharges PC=new ParkingCharges();
            charge = PC.calCharges(hours);

            System.out.println("Charge for customer " + i + ": $" + charge);

            total = total + charge;
        }

        System.out.println("\nTotal receipts for yesterday: $" + total);
    }
}
