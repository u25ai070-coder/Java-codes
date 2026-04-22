package Lab_9;

public class SinCos {
	
	public static void main(String args[])
	{
		sin s1=new sin();
		cos c1=new cos();
		s1.setName("Sin");
		s1.start();
		c1.setName("Cos");
		c1.start();
	}

}

class sin extends Thread
{
	public void run()
	{
		for(int i=0;i<=180;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+Math.sin(i));
		}
	}		
}
class cos extends Thread
{	
	public void run()
	{
		for(int i=0;i<=180;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+Math.cos(i));
		}
	}
}
