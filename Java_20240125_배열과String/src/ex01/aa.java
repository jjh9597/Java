/*		int sum = 0;
		
		for(int a = 1;a<=100;a++) {
			if(a%3==0) {
				sum += a;
				
			}
		}
		System.out.println("3의 배수의 총 합: = " + sum);
		
		
		int[] arr = {10,20,30};
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		
		int[] numArr = arr;
		for(int i=0;i<arr.length;i++)
			numArr[i] += 100;
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		
		for(int n : arr)
			System.out.print(n + " ");
		
		System.out.println("");
		
		String[] str = {"kor","eng","math","com","sci"};
//		for(String s : str)
	//		System.out.print(s + " ");
		
		for(int i=0; i<str.length; i++)
			System.out.print(str[i] + " ");

	
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 참조가 같음");
		} else {
			System.out.println("str1과 str2는 참조가 다름");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 문자열이 같음");
		}
		
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		
		if(str3 == str4) {
			System.out.println("str3과 str4는 참조가 같음");
		} else {
			System.out.println("str3과 str4는 참조가 다름");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3과 str4는 문자열이 같음");
		}
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		if(location != 1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		
		boolean result = subject.contains("자바");
		if (result) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		
		int[] scores;
		scores = new int[] {83,90,87};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		printItem( new int[] {83,90,87});
	}
		
	
		public static void printItem(int[] scores) {
			for(int i =0; i<3; i++) {
				System.out.println("score["+i+"]: " + scores[i]);
		
			}
 */
package ex01;


public class aa {

	public static void main(String[] args) {
		powerOn();
		powerOff();
		
		int num = plus(5,2);
		System.out.println(num);
		
		double avg = divide(5,2);
		System.out.println(avg);
	}
	
	static void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	static void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	static int plus(int x, int y) {
		int result = x+y;
		reutrn result;
	}

}
