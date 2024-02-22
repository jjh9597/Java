package ex01;

/*
 * 메소드 : max
 * 매개변수 : int,int
 * 반환값 : int
 * 두 정수 중 최대값 변화
 */
public class 반환있고매개변수있음2 {

	public static void main(String[] args) {
	
		System.out.println("최대값 출력: ");
		
		int max = max(5,10);
		
		System.out.println("최대값 : " + max);

	}
	
	static int max(int num1,int num2) {
		
		if(num1>num2) 
			return num1;
		else
			return num2;
		}

}
