package ex04;

public class Book {
	
	private String title;
	private String author;
	private int publicationYear;
	
	public Book() {}
	
	public Book(String t,String a, int p){
		title = t;
		author = a;
		publicationYear = p;
	}
	

	void displayInfo() {
		System.out.print("책 제목:" + title + " 저자:" + author + " 출판연도:" + publicationYear);
	}

}
