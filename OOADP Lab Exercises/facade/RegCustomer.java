package DesignPatternsIntro;

public class RegCustomer extends DecathlonCustomer {

	public RegCustomer(String s, int a) {
		super(s,a); 
	}
	
	RegCustomer() {super(); } 
	
	void display() { 
		System.out.println("\nRegular Customer details are"); 
		System.out.println("Name is "+ name + " \nAge is " + age); 
	}

}
