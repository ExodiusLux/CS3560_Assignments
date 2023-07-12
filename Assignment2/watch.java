package Assignment2;

public class watch {
	private Person person;
	private Movie movie;
	private int rating;
	
	public watch(Person person, Movie movie, int rating) {
		super();
		this.person = person;
		this.movie = movie;
		this.rating = rating;
	}
	
	public Person getPerson() { //get person
		return person;
	}
	
	public void setPerson(Person person) {//set person
		this.person = person;
	}
	
	public Movie getMovie() {//get movie
		return movie;
	}
	
	public void setMovie(Movie movie) {//set movie
		this.movie = movie;
	}
	
	public int getRating() {//get rating
		return rating;
	}
	
	public void setRating(int rating) {//set rating
		this.rating = rating;
	}
	
	
}
