package Lab_6;

public abstract class Car 
{
	String Name;
	Car(String Name)
	{
		this.Name =Name;
		System.out.println("Brand  :"+Name);
	}
	abstract void Avg(double value);
	abstract void Mode(String S);
}
