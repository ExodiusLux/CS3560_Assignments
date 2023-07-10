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
	
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
