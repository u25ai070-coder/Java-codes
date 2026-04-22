package Lab_6;

public class WashingMachine {
	private int noc;
	void switchon() {
		System.out.println("Macchine  started");
	}
	void detergent() {
		System.out.println("Detergent  added Suceccfully");
	}
	void switchoff() {
		System.out.println("Washing work of cloths done turning off the switch");
	}
	int acceptcloth(int num) {
		
		noc=num;
		System.out.println(noc+"no of Cloths accepted");
		return noc;
	}

}

