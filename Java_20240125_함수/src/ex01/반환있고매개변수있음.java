package ex01;

/*
 * 메소드 : max
 * 매개변수 : 없음
 * 반환값 : int
 * 두 정수 중 최대값 변화
 */
public class 반환있고매개변수있음 {

	public static void main(String[] args) {
	
		System.out.println("최대값 출력: ");
		
		int max = max();
		
		System.out.println("최대값 : " + max);
		System.out.println("프로그램 종료!");

	}
	
	static int max() {
		
		int num1 = 5;
		int num2 = 20;
		
		if(num1>num2) 
			return num1;
		else
			return num2;
		}
}
