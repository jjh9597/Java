package ex01;

import java.util.Scanner;

public class ex6_3 {

	public static void main(String[] args) {
		
		double[][] marks = new double[2][3];
		Scanner s = new Scanner(System.in);

		for(int i = 0; i<2; i++) {
			System.out.println("학생번호" + (i+1));
			System.out.println("국어점수 :");
			marks[i][0] = s.nextDouble();
			double a = marks[i][0];
			
			System.out.println("수학점수 :");
			marks[i][1] = s.nextDouble();
			double b = marks[i][1];
			
			marks[i][2] = (a+b)/2;
		}

	}

}
