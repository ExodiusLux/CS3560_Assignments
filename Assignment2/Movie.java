package Assignment2;

public class Movie {
	private String name;
	private String genre;
	
	Movie(String name, String genre){
		this.name = name;
		this.genre = genre;
	}

	public String getName() {//get movie name
		return name;
	}

	public void setName(String name) {//set movie name
		this.name = name;
	}

	public String getGenre() {//get movie genre
		return genre;
	}

	public void setGenre(String genre) {//set movie genre
		this.genre = genre;
	}
	
	
}
