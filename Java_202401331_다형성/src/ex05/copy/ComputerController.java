package ex05.copy;

public class ComputerController {

	public static void main(String[] args) {
		
		Speaker speark = new ChildSpeaker();
		
		speark.poewerOn();
		speark.powerOff();
		speark.soundUp();
		speark.soundDown();
	}
}
