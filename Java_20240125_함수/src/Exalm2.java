
/*매서드명 : change
반환타입 : int
매개변수 : int[]
기능 : change 함수 정수값을 전달하면, 
	  그 정수 수 만큼 배열크기를 생성해서 전달
	  배열안에는 1~10까지 난수 입력*/
public class Exalm2 {

	public static void main(String[] args) {
		System.out.println(" 정수 ");
		int[] ss = change(5);
		for(int i=0; i<ss.length; i++)
			System.out.print(ss[i] + " ");
	}
		
	static int[] change(int num){
		
		int[] ss = new int[num];
		
		for(int i=0; i<ss.length; i++)
			ss[i] = (int)(Math.random()*10)+1;
		
		return ss;
	}
}

