package Assignment2;

public class Book {
	private String name;
	private String author;
	private Course course;
	
	Book(){
		name = null;
		author = null;
		course = null;
	}
	
	Book(String name){
		this.name = name;
		author = null;
		course = null;
	}
	Book(String name, String author){
		this.name = name;
		this.author = author;
		course = null;
	}
	Book(String name, String author, Course course){
		this.name = name;
		this.author = author;
		this.course = course;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
}
