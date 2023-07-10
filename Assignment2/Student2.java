package Assignment2;

public class Student2 {
	private String name;
	private Transcript transcript;
	Student2(){
		name = null;
	}
	
	Student2(String name){
		this.name = name;
		transcript = null;
	}
	
	Student2(Transcript transcript){
		name = null;
		this.transcript = transcript;
	}
	
	Student2(String name, Transcript transcript){
		this.name = name;
		this.transcript = transcript;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void getTranscript() {
		System.out.println(transcript);
	}
	
	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}
	
}
