package Assignment2;

import java.util.ArrayList;

public class Course {
	private int code;
	private ArrayList<Book> book;
	Course(){
		code = 0;
	}
	
	Course(int code){
		this.code = code;
		book = null;
	}
	
	Course(int code, ArrayList<Book> book){
		this.code = code;
		this.book = book;
	}
	
	public double getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public ArrayList<Book> getBook() {
		return book;
	}
	
	public void setBook(ArrayList<Book> book) {
		this.book = book;
	}
	
	public void addBook(Book book) {
		if(book == null) {
			this.book = new ArrayList<Book>();
			this.book.add(book);
		}
		else {
		this.book.add(book);
		}
	}
}
