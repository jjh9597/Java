package ex04;

import ex04.Box;

/*
 * Box 제네릭 클래스 생성 하시오
 */
public class BoxEx01 {

	public static void main(String[] args) {

		Box<Integer> ibox = new Box<Integer>();	
		ibox.set(123);
		int num = ibox.get();
		System.out.println(num);
		
		System.out.println("--------------------");
		
		Box<Double> dbox = new Box<Double>();
		dbox.set(12.5);
		double dNum = dbox.get();
		System.out.println(dNum);
	}

}

class Box<T> {
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
	
	
}


