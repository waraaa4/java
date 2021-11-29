package day05_20211008;

import java.util.Scanner;

public class Ex06_WhileEx {

	public static void main(String[] args) {

		// 2개의 주사위를 던져서 합이 5일 때 종료하는 프로그램.

		boolean run = true;
		while (run) {
			int i = (int) (Math.random() * 6) + 1;
			int j = (int) (Math.random() * 6) + 1;
			System.out.print("(" + i + ", ");
			System.out.println(j + ")");
			if(i+j == 5) {
				run = false;
				System.out.println("종료되었습니다.");
			}
		}
		

		
		
	}

}
