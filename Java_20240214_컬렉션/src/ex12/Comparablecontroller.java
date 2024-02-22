package ex12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comparablecontroller {

	public static void main(String[] args) {

		List<Integer> list1 =
				new ArrayList(Arrays.asList(10,70,9,1,20,3));
		
		System.out.println("정렬전: " + list1);
		
		Collections.sort(list1);
		System.out.println("정렬후: " + list1);
		
		List<Review> review = new ArrayList<Review>();
		review.add(new Review(10, LocalDate.of(2024, 02,15)));
		review.add(new Review(1, LocalDate.of(2024, 03,15)));
		review.add(new Review(8, LocalDate.of(2024, 05,15)));
		review.add(new Review(2, LocalDate.of(2024, 7,15)));
		review.add(new Review(20, LocalDate.of(2024, 12,15)));
		
		for(Review re : review)
			System.out.println(re);
		System.out.println("----------------------");
		
		Collections.sort(review);
		
		for(Review re : review)
			System.out.println(re);
	}

}
