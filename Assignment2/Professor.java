package Assignment2;

public class Professor extends Employee {
	private String field;
	
	Professor(String name, int hours, String field){
		super(name, hours);
		this.field = field;
	}
	
	public String getField() {
		return field;
	}
	
	public void setField(String field) {
		this.field = field;
	}
	
	public int calculateSalary() {
		return getHours() * 30;
	}
}
