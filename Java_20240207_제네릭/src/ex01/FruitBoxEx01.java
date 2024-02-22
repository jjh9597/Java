package ex01;

class Apple{ //사과
	public String toString() {
		return "I am an apple";
	}
}

class Orange{ // 오렌지
	public String toString() {
		return "I am an Orange";
	}
}

class Box<T>{ //사과, 오렌지 담는 박스
	private T obj;
	
	void setObj(T obj) {
		this.obj = obj;
	}
	
	T getObj() {
		return obj;
	}
}


public class FruitBoxEx01 {

	public static void main(String[] args) {
		
		Box<Apple> abox = new Box<Apple>(); 	//사과 박스
		Box<Orange> bbox = new Box<Orange>();	//오렌지 박스
		Box<Integer> ibox = new Box<Integer>();	
		
		abox.setObj(new Apple()); 				//사과 담음
		bbox.setObj(new Orange());				//오렌지 담음
		
		Apple ap = (Apple)abox.getObj();
		Orange op = (Orange)bbox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
		
		ibox.setObj(100);
		int num = ibox.getObj();
		
//		abox.setObj(10);
//		abox.setObj(1.2);
//		abox.setObj("String");
		
		
		
	}
}
