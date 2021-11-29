package day03_20211006;

import java.util.Scanner;

public class Ex03_IfExample {

	public static void main(String[] args) {

		// 합격, 불합격 판단
		/*
		 * 학년, 점수를 각각 입력받고 합격/불합격을 판단한다. 
		 * 조건 1~3학년: 점수가 60점 이상일 때 합격 4학년: 점수가 70점 이상일 때
		 * 합격 위의 두 조건을 만족하지 않을 때는 불합격
		 */

		Scanner scan = new Scanner(System.in); 
		int year, score = 0;
		System.out.print("학년을 입력해 주세요: ");
		year = scan.nextInt();
		System.out.print("점수를 입력해 주세요: ");
		score = scan.nextInt();
		
		
		if (year >= 1 && year <= 4 && score >= 0 && score <= 100) {
			if (year != 4 && score >= 60) {
				System.out.println("1~3합격");
			} else if (score >= 70) {
				System.out.println("4합격");
			} else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("다시 입력해 주세요");
		}

	}

}
