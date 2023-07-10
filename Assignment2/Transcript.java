package Assignment2;

public class Transcript {
	private String course;
	private double grade;
	
	Transcript(){
		course = null;
		grade = 0.0;
	}
	
	Transcript(String course){
		this.course = course;
		grade = 0.0;
	}
	
	Transcript(double grade){
		course = null;
		this.grade = grade;
	}
	
	Transcript(String course, double grade){
		this.course = course;
		this.grade = grade;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return course + " " + grade;
	}
}
