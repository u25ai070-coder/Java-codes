import java.util.Scanner;

class Q4
{
    public static void main(String args[])
    {
        float pi=3.14159f;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your radius :");
        int r=sc.nextInt();

        System.out.println("Circle's diameter :"+2*r);
        System.out.println("Circlr's circumfrance(parigh) :"+2*pi*r);
        System.out.println("Circle's area :"+2*r*r*pi);


    }
}