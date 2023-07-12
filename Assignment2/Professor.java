package Assignment2;

public class Professor extends Employee {
	private String field;
	
	Professor(String name, int hours, String field){
		super(name, hours);
		this.field = field;
	}
	
	public String getField() { //get field
		return field;
	}
	
	public void setField(String field) { //set field
		this.field = field;
	}
	
	@Override
	public int calculateSalary() { //override calculate Salary in super class for salary for Professor class
		return getHours() * 30;
	}
}
