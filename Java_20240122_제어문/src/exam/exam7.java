package exam;

import java.util.Scanner;

public class exam7 {

	public static void main(String[] args) {
		int answer = 0;
		int input = 0;
		int count = 0;
		answer = (int)(Math.random()*100) + 1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1과 100사이의 값을 입력하세요.");
			input = sc.nextInt();
			count ++;
			
			if(input>answer)
				System.out.println("더 작은 수를 입력하세요");
			else
				System.out.println("더 큰 수를 입력하세요");
			
		}while(input!=answer);
		
		System.out.println("맞췄습니다 \n시도횟수는 6번입니다.");
	}

}