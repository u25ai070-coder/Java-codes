package Lab_6;

public class Delay
{
	public static void delay(int ms)
	{
		try 
		{
			Thread.sleep(ms);
		}
		catch(Exception ex)
		{
			System.out.println(". . .");
		}
	}
}
