package Assignment2;

public class Dog {
	private String breed;
	private String name;
	private Paw[] paw = new Paw[3];
	Dog(){
		breed = null;
		name = null;
		paw = null;
	}
	
	Dog(String breed, String name){
		this.breed = breed;
		this.name = name;
	}
	
	Dog(String breed, String name, Paw[] paw){
		this.breed = breed;
		this.name = name;
		if(paw.length <= 4) {
			this.paw = paw;
		}
		else {
			System.out.print("Too many paws unable to update list");
		}
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Paw[] getPaw() {
		return paw;
	}
	
	public void setPaw(Paw[] paw) {
		if(paw.length <= 4) {
			this.paw = paw;
		}
		else {
			System.out.println("Too many paws unable to update list");
		}
	}
}
