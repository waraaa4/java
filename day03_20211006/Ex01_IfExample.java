package day03_20211006;

import java.util.Scanner;

public class Ex01_IfExample {

	public static void main(String[] args) {

		// 학점 계산 예제
		/*
		 * 점수를 하나 입력 받아서 학점을 출력하는 예제 90~100: A 80~89: B 70~79: C 60~ 69: D 59이하: F
		 */
		// A ~ F를 출력하는 출력문을 딱 하나만 쓰는 코드로 변경해 보세요.
		// A ~ F => 문자데이터

		String grade = "";
		Scanner scan = new Scanner(System.in);
		int score = 0;

		System.out.print("점수를 입력하세요: ");
		score = scan.nextInt();

		// 중첩 if문
		// 90~94: A0, 95~100: A+
		if (score >= 0 && score <= 100) {
			if (score >= 90) {
				if(score >= 95) {
					grade = "A+";
				} else {
					grade = "A0";
				}
			} else if (score >= 80) {
				// System.out.println("B학점");
				grade = "B";
			} else if (score >= 70) {
				// System.out.println("C학점");
				grade = "C";
			} else if (score >= 60) {
				// System.out.println("D학점");
				grade = "D";
			} else {
				// System.out.println("F학점");
				grade = "F";
			}
		} else {
			System.out.println("잘못입력하셨습니다.");
		}

		// 변수값 출력하는 println 메서드 위치
		System.out.println("성적은 " + grade + "입니다.");

	}

}
