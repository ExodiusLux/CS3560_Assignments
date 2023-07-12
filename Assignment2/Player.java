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
	
	public String getName() { //get player name
		return name;
	}
	
	public void setName(String name) { //set player name
		this.name = name;
	}
	
	public boolean getExpert() { //get expert status
		return expert;
	}
	
	public void setExpert(boolean expert) { //set expert status
		this.expert = expert;
	}
	
	
}
