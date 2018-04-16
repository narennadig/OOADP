package DesignPatternsIntro;

public class PatternIntro implements CustomerCalculator{
	double total; double discount; int offamount = 0; 
	DecathlonCustomer DC; 
	RegCustomer RC;
	FirstTimeCustomer FC; 
	
	
     public double calculateTotal(DecathlonCustomer DC, double mrptotal) {
		
		Class c = DC.getClass();    
		String custtype = c.getName(); 
		
		if(custtype.equals("Strategy.RegCustomer")) {
			RC = new RegCustomer(); 
		discount = 0.20; 
			if(mrptotal > 6000) offamount = 250; 
			RC.display();  
		}
		
		if(custtype.equals("Strategy.FirstTimeCustomer")) {
			FC = new FirstTimeCustomer(); 
			discount = 0.24; 
			if(mrptotal > 5000) offamount = 400; 
			FC.display();  
		}
		
		total = mrptotal - discount * mrptotal - offamount;
		return total;
	}
     public double calculateTotal(double mrptotal) {return 0; }
}
