package ex03;

import java.util.Scanner;

public class fow삼각 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("길이 : ");
		int len = s.nextInt();
		
		for (int i = 0; i < len; i++) {
			for (int b = 0; b < i; b++)
				System.out.print(" ");
			
			for (int b = 0; b < (2*len)-1-(i*2); b++)
				System.out.print("*");
			
			System.out.println("");
		}

	}

}
