package ex04;

public class practice {

	public static void main(String[] args) {
		int[] lotto = new int[45];
				
		for(int i=0; i<lotto.length;i++)
			lotto[i] = i+1;
		
		for(int i=0; i<1000; i++) {
			int num = (int)(Math.random()*44)+1;
			int tmp = lotto[0];
			lotto[0] = lotto[num];
			lotto[num] = tmp;
			System.out.println(lotto[i]);
		}
		
	}

}
