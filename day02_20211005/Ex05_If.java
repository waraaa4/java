package day02_20211005;

import java.util.Scanner;

public class Ex05_If {

	public static void main(String[] args) {

		// if 연습
		boolean con = false;
		System.out.println("if문 실행 전");

		// 단일 if문
//		if(con) {
//			// 조건이 true일때만 중괄호 내부가 실행됨.
//			System.out.println("if문 내부");
//		}

		// if else문
		if (con) {
			System.out.println("조건이 true");
		} else {
			System.out.println("조건이 false");
		}
		System.out.println("if문 실행 후");

		// 스캐너로 정수를 입력받아 입력받은 정수가 양수인지 음수인지 출력해보세요.
		// 0은 0 입니다 라고 출력(조건이 하나 추가되어야 함.) => else if필요

		Scanner scan = new Scanner(System.in);
		int num = 0;

		System.out.print("숫자 입력: ");
		num = scan.nextInt();

//		if(num > 0) {
//			System.out.println("양수 입니다.");
//		} else if(num == 0) {
//			System.out.println("0 입니다.");
//		} else if(num < 0) {
//			System.out.println("음수 입니다.");
//		}

		// 정수를 입력 받아서 홀수, 짝수를 판단해보세요.
		// 음수일떄?
		// 0보다 큰 숫자에 대해서만 홀/짝 판단을 하고 0이하의 숫자는 다시 입력하라는 내용을 출력.
//		if(num % 2 == 0) {
//			System.out.println("짝수 입니다.");
//		} else {
//			System.out.println("홀수 입니다.");
//		}

//		if(num <= 0) {
//			System.out.println("다시 입력하세요.");
//		} else if(num % 2 == 0){
//			System.out.println("짝수 입니다.");
//		} else {
//			System.out.println("홀수 입니다.");
//		}

		/*
		 * if(양수/음수 판단) { if(홀/짝 판단) {
		 * 
		 * } else {
		 * 
		 * } } else { 다시 입력하세요 출력 }
		 */
//		if (num > 0) {
//			if (num % 2 == 0) {
//				// num이 0보다 크고 num이 짝수
//				System.out.println("짝수 입니다.");
//			} else {
//				// num이 0보다 크고 num이 홀수
//				System.out.println("홀수 입니다.");
//			}
//		} else {
//			// num이 0보다 작거나 같다
//			System.out.println("다시 입력하세요.");
//		}

		// 위에 작성한 중첩 if문을 && 연산을 이용하여 if else if로 표현
		if (num > 0 && num % 2 == 0) {
			// num이 0보다 크고 num이 짝수
			System.out.println("짝수");
		} else if (num > 0 && num % 2 != 0) {
			// num이 0보다 크고 num이 홀수
			System.out.println("홀수");
		} else {
			// num이 0보다 작거나 같다
			System.out.println("0보다 큰 숫자를 입력하세요");
		}

	}

}
