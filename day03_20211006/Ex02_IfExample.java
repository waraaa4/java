package day03_20211006;

import java.util.Scanner;

public class Ex02_IfExample {

	public static void main(String[] args) {

		// 정수를 하나 입력받아 입력받은 정수가 3의 배수인지 5의 배수인지 3과5의 공배수인지
		// 아니면 3의 배수도 5의 배수도 아닌지를 출력하는 코드를 작성하세요.
		// 3,6,9,12~~~~~
		// 5,10,15,20~~~~
		// 3의 배수: 3으로 나눠서 나머지가 0
		// 5의 배수: 5로 나눠서 나머지가 0
		// 3과 5의 공배수: 3의 배수이면서 5의 배수

		Scanner scan = new Scanner(System.in);
		int num = 0;
		String str = "";

		System.out.print("정수를 입력해주세요: ");
		num = scan.nextInt();

		if (num > 0) {
			if (num % 3 == 0 && num % 5 == 0) {
				str = "3과 5의 공배수 입니다.";
			} else {
				if (num % 3 == 0) {
					str = "3의 배수 입니다.";
				} else if (num % 5 == 0) {
					str = "5의 배수 입니다.";
				} else {
					str = "3과 5의 배수가 아닙니다";
				}
			}
		} else {
			System.out.println("0보다 큰 수를 입력해주세요.");
		}

		System.out.println(str);

	}

}
