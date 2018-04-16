package DesignPatternsIntro;

public class DiscountType1 implements CustomerCalculator {

	@Override
	public double calculateTotal(double mrptotal) {
		double total; double discount; int offamount = 0; 
		RegCustomer RC;
			RC = new RegCustomer(); 
		discount = 0.20; 
			if(mrptotal > 6000) offamount = 250; 
			RC.display();  
	
			total = mrptotal - discount * mrptotal - offamount;
			return total;
	}
	
	public double calculateTotal(DecathlonCustomer DC, double mrptotal) {return 0;}

}
