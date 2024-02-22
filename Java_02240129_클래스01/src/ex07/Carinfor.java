package ex07;

public class Carinfor {

	public static void main(String[] args) {

		Car car1= new Car("d","c",3,"d");
		
		car1.displayCarDetails();
		
		car1.setCar("현대", "그렌저", 1959, "녹색");
		car1.displayCarDetails();
		System.out.println("------------------------");
		
		
	}

}
