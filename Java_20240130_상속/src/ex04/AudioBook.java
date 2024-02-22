package ex04;

public class AudioBook extends Book{
	
	private double length;
	private String narrator;
	
	public AudioBook() {}
	
	public AudioBook(String t,String a, int p,
			double length, String narrator) {
		super(t,a,p);
		this.length = length;
		this.narrator = narrator;
	}
	
	void displayInfo() {
		super.displayInfo();
		System.out.println(" 오디오북 길이: ["+ length + "] 시간, 낭독자: ["+ narrator +"]");
	}

}
