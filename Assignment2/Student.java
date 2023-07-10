package Assignment2;

public class Student {
	private String name;
	private String major;
	private double GPA;
	
	Student(){
	name = null;
	major = null;
	GPA = 0.0;
	}
	
	Student(String name, String major){
		this.name = name;
		this.major = major;
		GPA = 0.0;
	}
	
	Student(String name, String major, double GPA){
		this.name = name;
		this.major = major;
		this.GPA = GPA;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public double getGPA() {
		return GPA;
	}
	
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	
	@Override
	public String toString() {
		return name + " " + major + " " + GPA;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(!(o instanceof Student)) {
			return false;
		}
		
		Student s = (Student) o;
		
		return (s.getName() == this.getName() && s.getMajor() == this.getMajor());
	}
}
