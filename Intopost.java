package Lab_9;
import java.util.Scanner;
import java.util.Stack;

public class Intopost {
	public static void main(String[] args) throws Exception
    {
        InputThread t1 = new InputThread();
        t1.start();
        t1.join();   // wait for input

        SolveThread t2 = new SolveThread(t1.exp);
        t2.start();
    }


}
class InputThread extends Thread
{
    String exp;

    public void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix: ");
        exp = sc.nextLine();
    }
}

class SolveThread extends Thread
{
    String exp;

    SolveThread(String exp)
    {
        this.exp = exp;
    }

    public void run()
    {
        Stack<String> st = new Stack<>();

        for(char ch : exp.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
                st.push(ch + "");
            else
            {
                String b = st.pop();
                String a = st.pop();
                st.push("(" + a + ch + b + ")");
            }
        }

        System.out.println("Infix: " + st.pop());
    }
}

class MainPage
{
    }
