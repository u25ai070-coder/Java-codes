package Lab_9;

public class BasicThread
{
	public static void main(String args[])
	{
		
		Thread.currentThread().setName("Manan");
		ThreadDemo TD=new ThreadDemo("Chavda");
		TD.start();
		for(int i=0 ; i<=100;i+=2)
		{
			System.out.println(Thread.currentThread().getName()+"   "+i);
		}
		
	}
}

class ThreadDemo extends Thread
{
	ThreadDemo(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0 ;i<=100;i+=2)
		{
			System.out.println(Thread.currentThread().getName()+"   "+i);
		}
	}
}
