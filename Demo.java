
import java.util.Scanner;

abstract class Figure
{
    public abstract double calcArea();
    public abstract double calcVol();
    public abstract void DispArea();
    public abstract void Dispvol();

}
class Cone extends Figure
{
    private double n,s,l;
    void Setn(double n)
    {
        this.n=n;
    }
    void Sets(double s)
    {
        this.s=s;
    }
    public double calcArea()
    {
        l=Math.sqrt((Math.pow(s,2)+Math.pow(n, 2)));
        return ((Math.PI)*n)*(n+l); 
        
    }
    public double calcVol()
    {

        return ((Math.PI)*n*n*s)/3;
    }
    public void DispArea()
    {
        System.out.println("Area of cone is :"+calcArea());
    }
    public void Dispvol()
    {
        System.out.println("Volume of cone is ="+calcVol());
    }
}
class Sphere extends Figure
{
    double R;
    public double calcArea()
    {
      return 4*(Math.PI)*R*R;  
    }
    public double calcVol()
    {
        return (4*(Math.PI)*R*R*R)/3;
    }
    void SetR(double R)
    {
        this.R=R;
    }
    public void DispArea()
    {
        System.out.println("Are of Sphere is :"+calcArea());
    }
    public void Dispvol()
    {
        System.out.println("Voulme od Sphere is :"+calcVol());
    }

}
class Cylinder extends Figure
{
    
    double h,R;
    void SetR(double R)
    {
        this.R=R;
    }
    void SetH(double H)
    {
        h=H;
    }
    public double calcArea()
    {
      return 2*(Math.PI)*R*(R+h);  
    }
    public double calcVol()
    {
        return (Math.PI)*R*R*h;
    }
    public void DispArea()
    {
        System.out.println("Area of Cylinder is :"+calcArea());
    }
    public void Dispvol()
    {
        System.out.println("Volume of Cylinder is :"+calcVol());
    }

}
class Demo 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("1:Cone");
        System.out.println("2:Sphere");
        System.out.println("3:Cylinder");
        System.out.print("Enter Which you want to choose :");

        switch (sc.nextInt()) {
            case 1:Cone a=new Cone();
                   System.out.print("Enter your Radius :");
                   a.Setn(sc.nextDouble());

                   System.out.print("Enter your Length :");
                   
                   a.Sets(sc.nextDouble());

                   a.calcVol();
                   a.calcArea();
                   a.DispArea();
                   a.Dispvol();
                   
                   break;
            
            case 2:Sphere b=new Sphere();
                   System.out.print("Enter your Radius :");
                   b.SetR(sc.nextDouble());
                   b.calcVol();
                   b.calcArea();
                   b.DispArea();
                   b.Dispvol();
                   
                   break;

            case 3:Cylinder c=new Cylinder();
                   System.out.print("Enter your Radius :");
                   c.SetR(sc.nextDouble());

                   System.out.print("Enter your Heigth :");
                   
                   c.SetH(sc.nextDouble());

                   c.calcVol();
                   c.calcArea();
                   c.DispArea();
                   c.Dispvol();
                   
                   break;

                
        }

    }
}  