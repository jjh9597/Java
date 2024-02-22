package exam;

public class exam4 {

	public static void main(String[] args) {
		
		int a = 0, b = 0;
		
		while(true) {
			
			a++;
			if(a%2==1) {
				b+= a;
			}
			else {
				b-= a;
			}
			if(b>=100)
				break;
		}
		System.out.println("몇까지 더해야 하는가? + "+ a );
	}
}
