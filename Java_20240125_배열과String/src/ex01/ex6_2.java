package ex01;

import java.util.Scanner;

public class ex6_2 {

	public static void main(String[] args) {
		
		double[] a = {10, 10.5 , 20.5, 21};
		double b = 0.0;
		
		for(int i=0; i<a.length;i++) {
			b+= i;
		}
		System.out.println("합계:"+ b);
		
		double avg = b/a.length;
		System.out.println("평균:" + avg);
		
	}

}
