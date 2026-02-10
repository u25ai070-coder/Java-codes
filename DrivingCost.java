import java.util.Scanner;
class Costs 
{
    float tmdpd; //total mile  per day 
    float cpg;// cosrt per gallon gass 
    int avg_fpd;//fees per day 
    int tolls;
    float gpm; // gallon per mile

    
}

class DrivingCost 
{
    public static void main(String args[])
    {
        double total,saving;
        int people;
        Costs drive =new Costs();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total mies you travel :");
        drive.tmdpd = sc.nextFloat();

        System.out.print("Cost 1 gallon gasoline :");
        drive.cpg = sc.nextFloat();

        System.out.print("Other fees :");
        drive.avg_fpd = sc.nextInt();

        System.out.print("Enter total tolls you pay :");
        drive.tolls = sc.nextInt();

        System.out.print("Gallon per mile :");
        drive.gpm = sc.nextFloat();
        
        System.out.print("How many people you travel :");
        people  = sc.nextInt();

        total=(drive.tmdpd*drive.cpg)/drive.gpm+drive.tolls+drive.avg_fpd;
        saving=total-(total/people);

        System.out.println("Savings = "+saving);
    }
    
    
}


