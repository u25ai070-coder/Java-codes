package Lab_9;

public class FiboPrime 
{
	public static void main(String args[])
	{
		FiboPrimePrint FP=new FiboPrimePrint();
		Thread t1=new Thread(()->FP.Fibo(),"Fibo");
		Thread t2=new Thread(()->FP.Prime(),"Prime");
		t1.start();
		t2.start();
	}
}

class FiboPrimePrint
{
	
	boolean status =true;
	boolean done;

	synchronized void Fibo()
    {
        long a = 0, b = 1;
        int totalFibo = 0;

        while(totalFibo < 50)
        {
            while(status == false)
            {
                try { wait(); } catch(Exception e) {}
            }

            int count = 0;

            while(count < 8 && totalFibo < 50)
            {
                System.out.println(Thread.currentThread().getName() +" : " +a);

                long sum = a + b;
                b = a;
                a = sum;

                count++;
                totalFibo++;
            }

            status = false;
            notify();
        }
        notifyAll();
    }
	synchronized void Prime()
	{
	    int num = 2, totalPrime = 0;

	    while(totalPrime < 25)
	    {
	        while(status == true && !done)
	        {
	            try { wait(); } catch(Exception e) {}
	        }

	        if(done) break;

	        int count = 0;

	        while(count < 5 && totalPrime < 25)
	        {
	            if(isPrime(num))
	            {
	                System.out.println(Thread.currentThread().getName() + " : " + num);
	                count++;
	                totalPrime++;
	            }
	            num++;
	        }

	        status = true;
	        notifyAll();
	    }

	    done = true;       
	    notifyAll();       
	    }
	 boolean isPrime(int n)
	    {
	        if(n < 2) return false;

	        for(int i = 2; i <= n/2; i++)
	        {
	            if(n % i == 0) return false;
	        }
	        return true;
	    }
	
}

