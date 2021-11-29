package day11_20211019;

import java.util.Scanner;

public class Calculator1 {
	/*
	 *  리턴타입: 
	 *  메서드이름:
	 *  매개변수:
	 */
	void sum(int num1, int num2) {
		int sum = 0;
		sum = num1 + num2;
		System.out.println(sum);
	}
	
	void subtraction(int num1, int num2) {
		int sub = 0;
		sub = num1 - num2;
		System.out.println(sub);
	}
	
	int multiplication(int num1, int num2) {
		int mul = 0;
		mul = num1 * num2;
		return mul;
	}
	
	int division() {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = scan.nextInt();
		int div = num1 / num2;
		return div;
	}
}
