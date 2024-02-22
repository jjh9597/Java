package ex03;

public class student {
	private String name;
	private String studentId;
	private String major;
		
	student(){
		
	}
	
	student(String n1, String n2, String n3){
		studentId = n1;
		name = n2;
		major = n3;
	}
	
	void displayInformation() {
		System.out.println("학번: " + studentId);
		System.out.println("이름: " + name);
		System.out.println("전공: " + major);
		
	}
	
	

}
