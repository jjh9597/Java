package ex02;

public class AnimalController {

	public static void main(String[] args) {

		/* -> 다형성을 만족하지 많는다 .. makeSound()가 반복됨
		 Bird B = new Bird();
		 b.makeSound():
		 Dog d = new Dog();
		 d.makeSound():
		 Cat c = new Cat();
		 c.makeSound():
*/
		sound(new Dog());
		sound(new Cat());
		sound(new Bird());
	}
	
	static void sound(Animal animal) {
		animal.makeSound();
	}
	
	

}
