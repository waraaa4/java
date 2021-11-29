package day01_20211001;

public class Ex05_AssignmentOperator {

	public static void main(String[] args) {

		// 정수형 변수 2개를 선언해서 대입 연산자 수행 결과를 출력해 보세요.

		int num1 = 5, num2 = 3;
		System.out.println("num1: " + num1 + " num2 " + num2); // 5, 3
		System.out.println(num1 += num2); // 8
		
		System.out.println("num1: " + num1 + " num2 " + num2); // 8, 3
		System.out.println(num1 -= num2); // 5
		
		System.out.println("num1: " + num1 + " num2 " + num2); // 5, 3
		System.out.println(num1 *= num2); // 15
		
		System.out.println("num1: " + num1 + " num2 " + num2); // 15, 3
		System.out.println(num1 /= num2); // 5

		System.out.println("num1: " + num1 + " num2 " + num2); // 5, 3
		System.out.println(num1 %= num2); // 2

		num1 = 5;
		System.out.println(num1 += num2);
		num1 = 5;
		System.out.println(num1 -= num2);
		

	}

}
