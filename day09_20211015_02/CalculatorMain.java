package day09_20211015_02;

public class CalculatorMain {

	public static void main(String[] args) {
		// 덧셈
		int num1 = 10;
		int num2 = 20;
		
		int sum = 0;
		sum = num1 + num2;
		System.out.println(sum);
		
		// 덧셈을 수행하기 위한 메서드만 호출하는 코드로
		Calculator cal1 = new Calculator();
		// add1 메서드 호출
		cal1.add1();
		// 리턴 데이터를 변수에 저장하기
		int result = 0;
		result = cal1.add1();
		System.out.println(result);
		// 리턴 데이터를 바로 출력하기
		System.out.println(cal1.add1());
		
		num1 = 12;
		num2 = 34;
		// add2 메서드 호출
		result = cal1.add2(num1, num2);
		System.out.println(result);
		System.out.println(cal1.add2(55, 100));
		
		// add3 리턴 없는 메서드 호출
		cal1.add3();
//		result = cal1.add3(); (x)
//		System.out.println(cal1.add3()); (x)
		
		// add4 호출
		cal1.add4(num1, num2);
		cal1.add4(100, 1000);
	}

}
