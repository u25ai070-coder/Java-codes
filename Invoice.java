import java.util.Scanner;
class info
{
    private String Number;
    private String Des;
    private int quan;
    private double prize;
    private double Total;

    void SetNumber(String Num)
    {
        Number=Num;
    }
    void GetNumber()
    {
        System.out.print("Prouduct number \t:\t"+Number+"\n");
       
    }

    void SetDes(String D)
    {
        Des=D;
    }
    void GetDes()
    {
        System.out.print("Prouduct Description \t:\t"+Des+"\n");
    }

    void SetQuan(int q)
    {
        quan=q;
    }
    void GetQuan()
    {
        if(quan>0)
            System.out.print("Prouduct Quantity \t:\t"+quan+"\n");
        else{
            quan=0;
            System.out.println("NEgetive input not possible "+"\n"+"REset \t:\t"+ quan);
        }
    }

    void SetPrice(Double p)
    {
        prize=p;
    }
    void Getprice()
    {
        if(prize>0)
            System.out.print("Prouduct Price \t:\t"+prize+"\n");
        else{
            prize=0;
            System.out.println("NEgetive input not possible "+"\n"+"REset \t:\t"+ prize);
        }
        
    }
    double getInvoinceAmount()
    {
        Total=quan*prize;
        if(Total<0)
        {
            Total=0;
        }
        return(Total);
    }
    
}

class Invoice
{
    public static void main(String args[])
    {
        String Num;
        String D;
        int q;
        double p;
        Scanner sc =new Scanner(System.in);
        info in = new info();

        System.out.print("Enter your PRod Number :");
        Num=sc.nextLine();
        in.SetNumber(Num);

        System.out.print("Enter Description :");
        D=sc.nextLine();
        in.SetDes(D);

        System.out.print("Enter quentity :");
        q=sc.nextInt();
        in.SetQuan(q);

        System.out.print("Enter Prixe per item :");
        p=sc.nextDouble();
        in.SetPrice(p);
        System.out.print("\n\n");

        System.out.println("------------------------- PRoduct INvoice ----------------------------");
        in.GetNumber();
        in.GetDes();
        in.GetQuan();
        in.Getprice();

        System.out.print("\u001B[31mTotal prize =\u001B[0m"+in.getInvoinceAmount());
        
    }
    


    
}