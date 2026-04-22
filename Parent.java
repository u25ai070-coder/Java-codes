package Lab_6;
import java.util.Scanner;
class Main {
    int x;

    
    Main(int x) {
        this.x = x;   
        System.out.println("Main Constructor Called");
    }
}

class Derived extends Main {
    int x;

    
    Derived(int MainValue, int DerivedValue) {
        super(MainValue);   
        this.x = DerivedValue;  
        System.out.println("Derived Constructor Called");
    }

    void display() {
        System.out.println("Derived x: " + this.x);     
        System.out.println("Main x: " + super.x);   
    }
}

public class Parent {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter Number Of Main ANd Derived ");
    	Derived obj = new Derived(sc.nextInt(), sc.nextInt());
        obj.display();
    }
}
