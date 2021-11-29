package day03_20211006;

import java.util.Scanner;

public class Ex04_IfExample {

	public static void main(String[] args) {
		
		/*
		 * 서로 다른 숫자 3개를 각각 입력받아 가장 큰 숫자 출력하기
		 * (같은 숫자는 입력하지 않는다고 가정.)
		 * 첫번째 숫자: 10
		 * 두번째 숫자: 5
		 * 세번째 숫자: 7
		 */
		
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3 = 0;
		
		System.out.print("첫번째 숫자를 입력해 주세요: ");
		num1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력해 주세요: ");
		num2 = scan.nextInt();
		System.out.print("세번째 숫자를 입력해 주세요: ");
		num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("가장 큰 수는: " + num1);
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("가장 큰 수는: " + num2);
		} else if(num3 > num1 && num3 > num2) {
			System.out.println("가장 큰 수는: " + num3);
		}
		
		// 최댓값을 담는 변수를 하나 추가하여 중첩 if문 활용하는 방법
		int max = 0;
		if(num1 > num2) {
			if(num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
		}
		System.out.println("가장 큰 수는 " + max + " 입니다.");
		
		
		
		
	}

}
