package Assignment2;

public class Employee {
	private String name;
	private int hours;
	
	Employee(String name, int hours){
		this.name = name;
		this.hours = hours;
	}
	
	public String getName() {//get name
		return name;
	}
	
	public void setName(String name) { //set name
		this.name = name;
	}
	
	public int getHours() { //get hours
		return hours;
	}
	
	public void setHours(int hours) {//set hours
		this.hours = hours;
	}
	
	public int calculateSalary() { //hours * 20 for super class
		return hours * 20;
	}
}
