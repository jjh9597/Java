package ex01;

public class phone {

	private String model;
	private String color;
	
	public phone() {
		System.out.println("phone()");
	}
	
	public phone(String model, String color) {
		System.out.println("phone(String model, String color)");
		this.model = model;
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "phone [model=" + model + ", color=" + color + "]";
	}

	public void bell() {
		System.out.println("전화 벨이 울린다.");
	}
	
	public void sendVoice(String message){
		System.out.println("자신"+ message);
	}
	
	public void reciveVoice(String message){
		System.out.println("자신"+ message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
}
