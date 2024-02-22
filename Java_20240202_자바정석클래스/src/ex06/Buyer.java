package ex06;

public class Buyer {
	
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;
	
	void buy(Product p) {
		if (money<p.price) {
			System.out.println(p+"(" + p.price+ ") 부족하여 물건을 살 수 없습니다");
			return;
		}
		money -= p.price;
		
		add(p);
	}
	void add(Product p){
		if(i>=cart.length) {
			Product[] temp = new Product[cart.length*2];
			
			for(int i=0; i<cart.length; i++)
				temp[i] = cart[i];
			
			cart = temp;
		}
			
		cart[i++] = p;
	}
	
	void summary() {
		String itemList = "";
		int sum = 0;
		
		for(int i=0; i<cart.length; i++) {
			itemList += cart[i] + ", ";
			sum += cart[i].price;
		}
		System.out.println("구입한 물건의 목록 : " + itemList);
		System.out.println("사용한 금액 : " + sum);
		System.out.println("남은 금액 : " + money);
	}

}
