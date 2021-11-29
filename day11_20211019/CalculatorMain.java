package day11_20211019;

import java.awt.Choice;
import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		boolean run = true;
		int choice = 0;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		Calculator number = new Calculator();
		
		while(run) {
			System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.종료");
			System.out.print("선택: ");
			choice = scan.nextInt();
			if(choice == 1) {
				System.out.print("숫자1: ");
				number.num1 = scan.nextInt();
				System.out.print("숫자2: ");
				number.num2 = scan.nextInt();
				result = number.sum(number.num1,number.num2);
				System.out.println("결과: " + result);
			} else if(choice == 2) {
				System.out.print("숫자1: ");
				number.num1 = scan.nextInt();
				System.out.print("숫자2: ");
				number.num2 = scan.nextInt();
				result = number.subtraction(number.num1,number.num2);
				System.out.println("결과: " + result);
			} else if(choice == 3) {
				System.out.print("숫자1: ");
				number.num1 = scan.nextInt();
				System.out.print("숫자2: ");
				number.num2 = scan.nextInt();
				result = number.multiplication(number.num1,number.num2);
				System.out.println("결과: " + result);
			} else if(choice == 4) {
				System.out.print("숫자1: ");
				number.num1 = scan.nextInt();
				System.out.print("숫자2: ");
				number.num2 = scan.nextInt();
				result = number.division(number.num1,number.num2);
				System.out.println("결과: " + result);
			} else if(choice == 5) {
				run = false;
				System.out.println("종료합니다.");
			} else {
				System.out.println("다시 입력해주세요");
			}
		}
		
		
		
		
		
		

	}

}
