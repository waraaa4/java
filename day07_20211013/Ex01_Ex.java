package day07_20211013;

import java.util.Scanner;

public class Ex01_Ex {

	public static void main(String[] args) {
		
		int inOut = 0;
		int save= 0;
		int choice = 0;
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		do {		
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.print("선택> ");
			choice = scan.nextInt();
			if (choice == 1) {
				System.out.print("예금액> ");
				inOut = scan.nextInt();
				save += inOut;
				System.out.println("현재잔액은 " + save + "원 입니다.");
			} else if (choice == 2) {
				System.out.print("출금액> ");
				inOut = scan.nextInt();
				if(save >= inOut) {
					save -= inOut;
					System.out.println("현재잔액은 " + save + "원 입니다.");
				} else {
					System.out.println("잔고가 부족합니다.");
					System.out.println("현재잔액은 " + save + "원 입니다.");
				}
			} else if (choice == 3) {
				System.out.println("현재잔액은 " + save + "원 입니다.");
			} else if (choice == 4) {
				run = false;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		} while(run);
		
		
		
		
		
	}

}
