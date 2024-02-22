package ex05;

class Book {
	
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	Book(){}
	
	Book(String n1, String n2, String n3, int n4) {
		
		title = n1;
		author = n2;
		publisher = n3;
		price = n4;
	}
	void displayBookInfo() {
		System.out.println("제목: " + title );
		System.out.println("저자: " + author );
		System.out.println("출판사: " + publisher );
		System.out.println("가격: " + price );
		
		
	}
	

}
