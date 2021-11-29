package day02_20211005;

import java.util.Scanner;

public class Ex04_Calcuator {

	public static void main(String[] args) {
		
		// 간단한 덧셈 계산기
		// 스캐너를 이용하여 정수 2개를 각각 입력받고 입력받은 숫자의 합을 출력해 보세요.
		
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, sum = 0;
		
		System.out.print("첫번째 숫자: ");
		num1 = scan.nextInt();
		System.out.println(num1);
		
		System.out.print("두번째 숫자: ");
		num2 = scan.nextInt();
		System.out.println(num2);
		
		sum = num1 + num2;
		System.out.println("합계: "+sum);
		
		
	}

}
