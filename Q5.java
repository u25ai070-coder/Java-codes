import java.util.Scanner;

class Q5
{
    public static void main(String args[])
    {
        int i,counter=0,b,c,sum=0,dum;
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number ");
        int Num=sc.nextInt();
        b=Num;
        while(b!=0)
        {
           b=b/10;
           counter++; 
        }
        for(i=0;i<counter;i++)
        {
            c=Num%10;
            Num=Num/10;
            sum=sum*10+c;
            
        }
        for(i=0;i<counter;i++)
        {
            
            dum=sum%10;
            sum=sum/10;
            System.out.print(dum+" ");

        }
        sc.close();

    }
}