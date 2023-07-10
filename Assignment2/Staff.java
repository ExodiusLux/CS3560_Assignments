package Assignment2;

public class Staff extends Employee{
	private int role;
	
	Staff(String name, int hours,int role ) {
		super(name, hours);
		this.role = role;
	}

	public int getRole() {
		return role;
	}
	
	public void setRole(int role) {
		this.role = role;
	}
	
}
