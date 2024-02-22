package exam;

public class exam3 {

	public static void main(String[] args) {
		char ch = 'B';
		char lowerCase = (ch<'Z') ? ((char)(ch+32)) : ch;
		System.out.println("ch:" + ch);
		System.out.println("ch to lowerCase::" + lowerCase);

	}

}
