package ex03;

public class Book {
	
	private String title;
	private String author;
	private int publishYear;
	
	Book(String title,String author,int publishYear){
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;
	}
	
	String getDetails() {
		return title +" : " + author + " : " + publishYear;
	}
	
}
