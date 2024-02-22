package ex07;

class Car {
	
	private String make;
	private String model;
	private int year;
	private String colar;
	
	void setMake(String m){
		make = m;
	
	}
	void setCar(String n1, String n2, int n3, String n4){
			
			make = n1;
			model = n2;
			year = n3;
			colar = n4;
			
	}
	void displayCarDetails(){
		System.out.println("제조사: "+make);
		System.out.println("모델: "+model);
		System.out.println("제조년도: "+year);
		System.out.println("색상: "+ colar);
	}
	
	void startEngine(){
		System.out.println("ON");
	}
	
	void stopEngine(){
		System.out.println("off");
	}
	Car(String n1, String n2, int n3, String n4){
		
		make = n1;
		model = n2;
		year = n3;
		colar = n4;
		
	}
}

