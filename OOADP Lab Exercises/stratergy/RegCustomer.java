package pkgStrategy;

public class RegCustomer extends DecathlonCustomer {

	public RegCustomer(String s, int a) {
		super(s,a); 
	}
	
	RegCustomer() {
		super();
		iCC = new DiscountType1(); 
		
	} 
	
	public void display() { 
		
		System.out.println("\nHello Regular Customer! Welcome Back..."); 
		super.display(); 
	}

}
