package ex03;

public class continue01 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int a = 1; a<=10; a++) {
			if(a%2==1)
				sum += a;
		}
		System.out.println("홀수 합 :"+ sum);
		
		System.out.println("----------------------");
		
		int sum2 = 0;
		
		for(int a = 1; a<=10; a+=2) {
				sum2 += a;
		}
		System.out.println("홀수 합 :"+ sum2);
		
		System.out.println("----------------------");
		
		int sum3 = 0;
		for(int a = 1; a<=10; a++) {
			if(a % 2 == 0)
				continue;
			
			sum3 += a;
		}
		System.out.println("홀수 합 :"+ sum3);
	}

}
// 1부터 10 사이의 홀수의 합