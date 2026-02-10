import java.util.Scanner;

class Figure
{
    private double a;
    private double v;
    private double r;
    
    void DisplayArea()
    {
        System.out.println("Area is :"+a);
    }
    void DisplayVolume()
    {
        System.out.println("Volume is :"+v);
    }
    void SetR(double r)
    {
        this.r =r;
    }
    double GetR()
    {
        return r;
    }
    void SetA(double r)
    {
        a=r;
    }
    void SetV(double h)
    {
        v=h;
    }
}
class Cone extends Figure
{
    private double h;
    void SetH(double h)
    {
        this.h=h;
    }
    double Geth()
    {
        return h;
    }
    public double calArea()
    {
        return ((Math.PI)*GetR()*h);
    }
    public double calVolume()
    {
        return ((Math.PI)*GetR()*GetR()*h);
    }
}
class InheritanceDemo
{
    public static void main(String args[])
    {
        double r,h;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("ENter Your radius :");
        r=sc.nextDouble();


        System.out.print("ENter Your Heigth :");
        h=sc.nextDouble();

        Cone nig=new Cone();
        nig.SetR(r);
        nig.SetH(h);
        sc.close();
        r=nig.calArea();
        nig.SetA(r);
        h=nig.calVolume();
        nig.SetV(h);
        nig.DisplayArea();
        nig.DisplayVolume();
    }
}