package DesignPatternsIntro;

public class PatternClientMain {

	public static void main(String[] args) {
		
		RegCustomer oreg = new RegCustomer("Sindhu", 24);
		PatternIntro opcalc = new PatternIntro(); 
	
		double mrptotal = 8000.50; 
		double billamount; 
		
		billamount = opcalc.calculateTotal(oreg, mrptotal); 
		System.out.println("\nYour MRP Total is Rs."+ mrptotal + "\nYou need to pay Rs."+billamount); 
		
		
		FirstTimeCustomer oFT = new FirstTimeCustomer("Mary Kom", 32);
		
		billamount = opcalc.calculateTotal(oFT, mrptotal); 
		System.out.println("\nYour MRP Total is Rs."+ mrptotal + "\nYou need to pay Rs."+billamount); 
		
		
	}

}
