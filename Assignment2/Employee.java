package Assignment2;

public class Employee {
	private String name;
	private int hours;
	
	Employee(String name, int hours){
		this.name = name;
		this.hours = hours;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public int calculateSalary() {
		return hours * 20;
	}
}
