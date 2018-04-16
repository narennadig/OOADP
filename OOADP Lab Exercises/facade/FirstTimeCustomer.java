package DesignPatternsIntro;

public class FirstTimeCustomer extends DecathlonCustomer {

	public FirstTimeCustomer(String s, int a) {
		super(s, a);
		
	}
	
	FirstTimeCustomer() {super(); } 
	
	void display() { 
		System.out.println("\nFirst Time Customer details are"); 
		System.out.println("Name is "+ name + " \nAge is " + age); 
	}

}
