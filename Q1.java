import java.util.Scanner;
class Q1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your FIrst number : ");
        int n1=sc.nextInt();
        System.out.println("Enter your second number :");
        int n2=sc.nextInt();

        System.out.println("Sum of num "+ (n1+n2));
        System.out.println("Prod of num "+(n1*n2));
        if(n2==0)
        {
            System.out.println("Infinity ");
        }
        else
        {
           System.out.println("DIV of num "+(n1/n2)); 
        }
        System.out.println("diffrence of num "+(n1-n2));
    }
}