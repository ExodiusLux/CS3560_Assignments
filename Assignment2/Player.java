package Assignment2;

public class Player {
	private String name;
	private boolean expert;
	
	Player(){
		name = null;
		expert = false;
	}
	
	Player(String name){
		this.name = name;
		expert = false;
	}
	
	Player(String name, boolean expert){
		this.name = name;
		this.expert = expert;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean getExpert() {
		return expert;
	}
	
	public void setExpert(boolean expert) {
		this.expert = expert;
	}
	
	
}
