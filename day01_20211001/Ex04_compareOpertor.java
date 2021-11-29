package day01_20211001;

public class Ex04_compareOpertor {

	public static void main(String[] args) {
		
		/*
		 * num1 = 7, num2 = 3 을 각각 줬을 때
		 * <, >, <=, >=, ==, != 을 각각 수행한 결과를 출력하세요.
		 */
		
		int num1 = 7, num2 = 3;
		System.out.println(num1 < num2);
		System.out.println(num1 > num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
		// 변수 활용 할때 result에 true를 초기값으로 넣어줌
		boolean result = true;
		result = num1 < num2;
		System.out.println(result);
		
	}

}
