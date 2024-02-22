package ex01;

public class smartPhone{

		private boolean wifi;

		public smartPhone() {
			System.out.println("smartPhone()");
		}
		public smartPhone(boolean wifi) {
			System.out.println("smartPhone(boolean wifi)");
			this.wifi = wifi;
		}
		
		@Override
		public String toString() {
			System.out.println(super.toString());
			return "smartPhone [wifi=" + wifi + "]";
		}


		
		public void internet() {
			System.out.println("인터넷 연결!!");
		}
}
