package Assignment2;

public class Dog {
	private String breed;
	private String name;
	private Paw[] paw;
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
		if(paw.length == 4) {
			this.paw = paw;
		}
		else {
			System.out.print("Too many/few paws unable to update list");
		}
	}
	
	public String getBreed() { //get dog breed
		return breed;
	}
	
	public void setBreed(String breed) { //set dog breed
		this.breed = breed;
	}
	
	public String getName() { //get dog name
		return name;
	}
	
	public void setName(String name) { //set dog name
		this.name = name;
	}
	
	public Paw[] getPaw() { //get paw list
		return paw;
	}
	public void setPaw(Paw[] paw) { //set Paw list
		if(paw.length == 4) {
			this.paw = paw;
		}
		else {
			System.out.println("Too many/few paws unable to update list");
		}
	}
}
