package ex04;

public class EBook extends Book{
	
	private double fileSize;
	private String format;
	
	public void Ebook() {}

	public EBook(String t,String a, int p,double filesize, String format){
		super(t, a, p);
		this.fileSize = filesize;
		this.format = format;
	}

	void displayInfo() {
		super.displayInfo();
		System.out.print("파일크기: [" + fileSize +"] MB, 파일형식: [" + format + "]");
	}

}