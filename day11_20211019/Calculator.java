package day11_20211019;

public class Calculator {
	int num1;
	int num2;
	
	
	// 덧셈
	int sum(int num1, int num2) {
		int sum = this.num1 + this.num2;
		return sum;
	}
	
	// 뺄셈
	int subtraction(int num1, int num2) {
		int sum = this.num1 - this.num2;
		return sum;
	}
	
	// 곱셈
	int multiplication(int num1, int num2) {
		int sum = this.num1 * this.num2;
		return sum;
	}
	
	// 나눗셈
	int division(int num1, int num2) {
		int sum = this.num1 / this.num2;
		return sum;
	}
	
	
}
