package day02_20211005;

public class Ex02_IncreaseOperator {

	public static void main(String[] args) {
		
		// 증감 연산자
		int result = 0, var = 10;
		System.out.println("result: " + result + " var: " + var); // 0, 10
		result = 10 + var++;
		System.out.println("result: " + result + " var: " + var); // 20, 11
		result = 10 + var++;
		System.out.println("result: " + result + " var: " + var); // 21, 12
		result = 10 + var--;
		System.out.println("result: " + result + " var: " + var); // 22, 11	
		result = 10 + var--;
		System.out.println("result: " + result + " var: " + var); // 21, 10	
		
		result = 0;
		var = 10;
		result = 10 + ++var;
		System.out.println("result: " + result + " var: " + var); // 21, 11
		result = 10 + ++var;
		System.out.println("result: " + result + " var: " + var); // 22, 12
		result = 10 + --var;
		System.out.println("result: " + result + " var: " + var); // 21, 11
		result = 10 + --var;
		System.out.println("result: " + result + " var: " + var); // 20, 10
		
		
	}

}
