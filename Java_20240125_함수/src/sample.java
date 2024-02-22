
public class sample {

	public static void main(String[] args) {
		System.out.println("hello");
		
		int num = max(100,20);
		System.out.println("최대값:"+num);
	}
	
	static int max(int n1, int n2)
	{
		System.out.println("함수");
		return n1>n2? n1:n2;
	}
	static int min(int n1, int n2)
	{
		System.out.println("함수");
		return n1<n2? n1:n2;
	}
}
