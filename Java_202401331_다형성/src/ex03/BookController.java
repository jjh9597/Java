package ex03;

public class BookController {

	public static void main(String[] args) {
		
		details(new Novel("리액트", "관우", 2021));
		details(new Textbook("Java", "조운", 2022));
		details(new Magazine("js", "신용권",2011));
	}
		static void details(Book book) {
			String msg = book.getDetails();
			System.out.println(msg);

		}

}
