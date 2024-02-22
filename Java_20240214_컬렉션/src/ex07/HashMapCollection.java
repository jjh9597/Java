package ex07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class HashMapCollection {

	public static void main(String[] args) {

		HashMap<Integer, String> map =new HashMap<Integer, String>();
		
		map.put(33, "Toy");
		map.put(47, "Box1");
		map.put(67, "Robot");

		//반고해서 출력 할 때
		
		System.out.println(map.get(33));
		System.out.println("-------------------------------");
		
		Set<Integer> set = map.keySet();	//키만 모아서 set저장한다.
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
			System.out.println(map.get(it.next()));
	}

}
