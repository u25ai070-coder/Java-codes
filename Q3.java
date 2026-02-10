import java.util.Scanner;
class Q3
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number :");
        int n1=sc.nextInt();

        System.out.print("Enter your Second Number :");
        int n2=sc.nextInt();

        System.out.print("Enter your Third Number :");
        int n3=sc.nextInt();

       
       System.out.println("Sum is ="+(n1+n2+n3));
       System.out.println("Avg is ="+(n1+n2+n3)/3);
       System.out.println("Product is ="+(n1*n2*n3));
       if(n1>n2)
       {
            if(n1>n3)
            {
                System.out.println(n1+" is bigger");
            }
            else if(n1==n3)
            {
                System.out.println(n1+" is equall ");
            }
            else 
            {
                System.out.print(n3+" is bigger");
            }
       }
       else if(n2>n3)
       {
       
        if(n2>n3)
        {
            System.out.print(n1+" is bigger");
        }
        else if(n2==n3)
        {
            System.out.println(n3+"Is equal ");
        }
        else
        {
            System.out.println(n3+"is greater ");
        }        
       }
       System.out.println("smallest numb = "+(n1>n2?(n2>n3?n3:n2):(n1>n3?n3:n1)));
      
    }


}
   

