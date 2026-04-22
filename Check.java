package Lab_7;

public class Check 
{
	void ClassPAss(int Speed,String P)
	{
		if(P.equalsIgnoreCase("Scooter"))
		{
			class Scoter extends vehicle
			{
				Scoter(int Speed)
				{
					super(Speed);
				}
				
			}
			Scoter SCO=new Scoter(Speed);
		}
		else if(P.equalsIgnoreCase("Car"))
		{
			class Car extends vehicle 
			{
				Car(int Speed)
				{
					super(Speed);
				}
				
			}
			Car CA=new Car(Speed);
		}
	}
	void CyclePass(int Speed)
	{
		class Bicycle extends vehicle
		{
			Bicycle(int Speed)
			{
				super(Speed);
			}
			
		}
		Bicycle BI=new Bicycle(Speed);
	}
}
