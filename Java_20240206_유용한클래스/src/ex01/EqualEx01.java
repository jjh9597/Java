package ex01;

public class EqualEx01 {

	public static void main(String[] args) {

		String str1 = new String("Korea");
		String str2 = new String("Korea");
		
		System.out.println(str1 == str2);

		System.out.println(str1.equals(str2));
	}

}
