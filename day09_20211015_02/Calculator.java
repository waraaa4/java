package day09_20211015_02;

public class Calculator {
	// 덧셈용 메서드 선언
	
	// 1. 리턴이 있는 메서드
	/*
	 * 리턴타입: int
	 * 메서드 이름: add1
	 * 매개변수없음. 
	 */
	int add1() {
		int num1 = 10;
		int num2 = 20;
		int sum = 0;
		sum = num1 + num2;
		return sum;
	}
	
	/*
	 *  리턴타입: int
	 *  메서드 이름: add2
	 *  매개변수: int 타입 2개
	 */
	int add2(int num1, int num2) {
		int sum = 0;
		sum = num1 + num2;
		return sum;
	}
	
	// 2. 리턴이 없는 메서드
	/*
	 * 리턴 없음.
	 * 메서드 이름: add3
	 * 매개변수 없음.
	 */
	void add3() {
		int num1 = 12;
		int num2 = 33;
		int sum = num1 + num2;
		System.out.println(sum);
	}
	
	/*
	 *  리턴 없음.
	 *  메서드 이름: add4
	 *  매개변수: int 타입 2개
	 */
	void add4(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}
	
}
