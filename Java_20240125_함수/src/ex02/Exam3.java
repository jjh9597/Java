package ex02;


/*
 * 메소드: calculateEvenSum
 * 매개변수: int
 * 반환타입: int
 * 기능 : 주어진 정수 N까지의 모든 짝수의 합을 계산하는 함수를 작성하세요.
 */
public class Exam3 {

	public static void main(String[] args) {
		
		int a = calculateEvensum(100);
		System.out.println("짝수의 합 : "+ a);
	}
	static int calculateEvensum(final int k){
		int sum = 0;
		for(int b=0; b<=k;b++) 
			if(b%2==0) 
			sum+=b;
			
			return sum;
			
		
	}
}
