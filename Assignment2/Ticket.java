package Assignment2;

public class Ticket implements SaleableItem{
	public void sellCopy() { //overriding interface method
		System.out.println("Selling a Ticket");
	}
}
