package Lab_9;

import java.util.concurrent.ThreadLocalRandom;

public class Bank  // this class willl resposiible for creating the father and son thread and also responsible for synchronizing them !
{
	public static void main(String args[])
	{
		Account ac=new Account();
		Son s=new Son(ac);
		Thread t1=new Thread(s);
		t1.setName("Son");
		Father f=new Father(ac);
		Thread t2=new Thread(f);
		t2.setName("Father");
		
		t1.start();
		t2.start();
	}
}
class Father implements Runnable 
{
	Account ac=null;
	public Father(Account ac) {
		this.ac=ac;
	}

	@Override
	public void run() {
		ac.Deposite();		
	}
	
}
class Son implements Runnable 
{
	Account ac=null;
	public Son(Account ac) {
		this.ac=ac;
	}

	@Override
	public void run() {
		ac.Withdraw();		
	}
	
}
class Account
{
	int Inbalance=600;
	int k=10;
	synchronized void Deposite()
	{
		while(k!=0) {
	
		while(Inbalance>=2000)
		{
			try {wait();}catch(Exception e) {}
		}
			Inbalance=Inbalance+ThreadLocalRandom.current().nextInt(1,200); 
			notify();
			System.out.println("User : "+Thread.currentThread().getName()+"  Balance "+Inbalance);
			k--;
	}
	}
	synchronized void Withdraw()
	{
		while(k!=0) {
		while(Inbalance<=500)
		{
			try {wait();}catch(Exception e) {}
		}
			Inbalance=Inbalance-ThreadLocalRandom.current().nextInt(1,150); 
			notify();
			System.out.println("User : "+Thread.currentThread().getName()+"  Balance "+Inbalance);
			k--;
	}
	}
}
