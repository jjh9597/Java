package ex01;

public class IntArray01 {

	public static void main(String[] args) {
		String[] myArr = new String[3];			 //배열 선언, 메모리 할당
		
		myArr[0] = "kor";
		myArr[1] = "Eng";
		for (int i = 0; i< 3; i++)
			System.out.println(myArr[i]+" ");

	}

}
