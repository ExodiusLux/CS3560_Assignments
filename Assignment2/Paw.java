package Assignment2;

public class Paw {
	private int position;
	private Dog dog;
	Paw(){
		position = 0;
	}
	Paw(int position){
		this.position = position;
	}
	Paw(int position, Dog dog){
		this.position = position;
		this.dog = dog;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public Dog getDog() {
		return dog;
	}
	
	public void setDog(Dog dog) {
		this.dog = dog;
	}
}
