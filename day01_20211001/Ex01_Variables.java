package day01_20211001;

public class Ex01_Variables {

	public static void main(String[] args) {
		
		// 정수형 변수 number1을 선언 하면서 값은 10저장
		int number1 = 10; // 초기값
		
		// 정수형 변수 number2 선언
		//특별한 값이 없다면 변수 선언시 초기값을 0을 준다.
		int number2 = 0;
		
		// 선언하지 않은 변수 사용
		// number3 = 20; (x)
		
		// number1 변수의 값을 50으로
		// 변수값을 바꾼다는 건 덮어쓰기
		number1 = 50;
		
		// number1이 가지고 있는 값 출력하기
		System.out.println(number1);
		System.out.println("number1");
		
		// long 타입 변수
		long longVar = 10L;
		System.out.println(longVar);
		
		// float 타입 변수
		float floatVar = 1.2345f;
		System.out.println(floatVar);
		
		// bool 타입 변수
		boolean boolVar = false;
		System.out.println(boolVar);
		
		// String 타입 변수
		// String 클래스 타입의 객체 stringVar
		String stringVar = "스트링 데이터는 더블쿼터로 묶어줍니다. 1234abc~~";
		System.out.println(stringVar);
		
	}

}
