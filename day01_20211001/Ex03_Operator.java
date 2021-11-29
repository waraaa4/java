package day01_20211001;

public class Ex03_Operator {

	public static void main(String[] args) {
		
		/*
		 * 정수형 변수 num1, num2를 각각 선언하고
		 * 초기값은 num1 = 5, num2 = 3을 대입한다.
		 * 그리고 +, -, *, /, % 연산자를 사용하여 각각의 연산결과를 출력하시오.
		 */

		int num1 = 5;
		int num2 = 3;
		// int num3 = 10, num4 = 5; , 로 같이 선언 가능
		System.out.println("num1 + num2: " + (num1 + num2));
		System.out.println("num1 - num2: " + (num1 - num2));
		System.out.println("num1 * num2: " + (num1 * num2));
		System.out.println("num1 / num2: " + (num1 / num2));
		System.out.println("num1 % num2: " + (num1 % num2));
		
		// 계산결과를 담는 변수 활용
		int result = 0;
		result = num1 + num2;
		System.out.println("num1 + num2: " + result);
		result = num1 - num2;
		System.out.println("num1 - num2: " + result);
		result = num1 * num2;
		System.out.println("num1 * num2: " + result);
		result = num1 / num2;
		System.out.println("num1 / num2: " + result);
		result = num1 % num2;
		System.out.println("num1 % num2: " + result);
		
		// String 변수간의 + 역활
		String strVar1 = "오늘은 ";
		String strVar2 = "금요일 입니다. ";
		System.out.println(strVar1 + strVar2);
		
		String strVar3 = strVar1 + strVar2;
		System.out.println(strVar3);
		
		String strVar4 = strVar1 + "10월 1일 입니다.";
		System.out.println(strVar4);
		
		// String 클래스에서 제공하는 length() 매서드 호출
		// length(): String 변수의 길이값(글자수)을 알려줌.
		System.out.println(strVar1.length());
		System.out.println(strVar2.length());
	}

}
