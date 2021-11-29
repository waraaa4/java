package day11_20211019;

import java.util.Scanner;

public class CalculatorMain1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int num1 = 0, num2 = 0;
		Calculator1 cal = new Calculator1();
		
		while(run) {
			System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.종료");
			System.out.print("선택: ");
			int selectNo = scan.nextInt();
			switch(selectNo){
				case 1:
					// 덧셈
					num1 = 10;
					num2 = 20;
					cal.sum(num1, num2);
					break;
				case 2:
					// 뺄셈
					System.out.print("첫번째 숫자: ");
					num1 = scan.nextInt();
					System.out.print("두번째 숫자: ");
					num2 = scan.nextInt();
					cal.subtraction(num1, num2);
					break;
				case 3:
					// 곱셈
					System.out.print("첫번째 숫자: ");
					num1 = scan.nextInt();
					System.out.print("두번째 숫자: ");
					num2 = scan.nextInt();
					int result = cal.multiplication(num1, num2);
					System.out.println(result);
					break;
				case 4:
					// 나눗셈
					result = cal.division();
					System.out.println(result);
					break;
				case 5:
					System.out.println("종료");
					run = false;
					break;
			}
		}
		
		
		
	}

}
