package ex03;

public class Novel extends Book{

	public Novel(String title,String author,int publishYear) {
		super(title, author, publishYear);
	}

	@Override
	String getDetails() {
		return super.getDetails() + " : 장르";
	}
	
	
}
