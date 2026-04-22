package Lab_9;

public class ThreadRun 
{
	public static void main(String args[])
	{
		MultiUser MU=new MultiUser();
		Thread1 T1=new Thread1(MU);
		Thread t1=new Thread(T1);
		
		Thread2 T2=new Thread2(MU);
		Thread t2=new Thread(T2);
		t1.start();
		t2.start();
	}
}
class Thread1 implements Runnable
{
	MultiUser s1=null;
	Thread1(MultiUser S1)
	{
		s1=S1;
	}	
	@Override
	public void run() {
			s1.show();
	}
	
}
class Thread2 implements Runnable
{
	MultiUser s1=null;
	Thread2(MultiUser S1)
	{
		s1=S1;
	}
	@Override
	public void run() {
		s1.show();
	}
	
}
class MultiUser
{
	synchronized void show()
	{
		boolean State =true;
		for(int i=0;i<=100;i++)
		{
			System.out.println(Thread.currentThread().getName()+"   "+i);
		}
		
	}
}

