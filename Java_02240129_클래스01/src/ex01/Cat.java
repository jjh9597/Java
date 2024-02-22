package ex01;

public class Cat {
	
	//멤버 변수 --재료(레시피)
	String breed;
	String color;

	
	//생성자(클래스 이름하고 같다) --반환타입x
	Cat(){
		System.out.println("디폴트 생성자");
	}
	
	
	//void(반환타입) eat(함수명) ()(매개변수)
	//멤버 메소드 --액션(미역을 3분 불린다)
	void eat() {
		System.out.println("쮸르를 먹는다");
		System.out.println("칼라는 " + color + "이다.");
	}
	
	void scratch() {
		
	}
	
	void meow() {
		
	}

}
