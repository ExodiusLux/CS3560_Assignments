package Assignment2;

public class Magazine implements SaleableItem {
	
	public void sellCopy() { //overriding interface method
		System.out.println("Selling a magazine");
	}
}
