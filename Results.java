import java.util.Scanner;
class Data
{
    float mile,gas,total;
    Data(float Mile,float Gas)
    {
        mile=Mile;
        gas=Gas;
    }
    void list()
    {
        System.out.println("Miles traved :\t"+mile);
        System.out.println("Gas used :\t"+gas);
        System.out.println("MIles per gallon :\t"+mile/gas);
        System.out.println("------------------------------------------");
    }
    float avg()
    {
        total= mile/gas;
        return total;
    }
}
class Results
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float Mile,Gas,t=0;
        int n,i;
        
        System.out.print("How much data do you have :");
        n=sc.nextInt();
        Data[] d=new Data[n];
        for(i=0;i<n;i++){
            System.out.println("Data :"+i+1);
            System.out.print("ENter HOw many miles you driven :");
            Mile=sc.nextFloat();
            

            System.out.print("Enter how much gasoline needed that time to full the tank :");
            Gas=sc.nextFloat();
            
            d[i]=new Data(Mile,Gas);
        }
        for(i=0;i<n;i++)
        {
            d[i].list();
            t=d[i].avg()+t;
        }
        System.out.println("Avg :\t"+t/n);
        
    }
}