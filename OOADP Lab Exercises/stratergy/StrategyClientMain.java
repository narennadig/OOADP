package pkgStrategy;

public class StrategyClientMain {

	public static void main(String[] args) {
		
		double mrptotal = 8000.50; 
		
		DecathlonCustomer oRC = new RegCustomer("Sindhu", 24); 
		DiscountType1 odtype1 = new DiscountType1(); 
		/*oRC.setDiscountType(odtype1); 
		oRC.display(); 
		oRC.calculateDiscount(mrptotal);	*/
		
		///DiscountType2 odtype2 = new DiscountType2(); 
		oRC.setDiscountType(new DiscountType2()); 
		oRC.display(); 
		oRC.calculateDiscount(mrptotal);	
		
		
	}

}
