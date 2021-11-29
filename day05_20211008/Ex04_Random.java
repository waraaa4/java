package day05_20211008;

public class Ex04_Random {

	public static void main(String[] args) {

		// Random 메서드
		// 특정 범위를 지정하면 해당 범위 내에서 숫자를 무작위로 발생시킴.
		// 1~10 사이의 정수 하나를 발생
		// (int)(Math.random() * 10) + 1

		System.out.println((int) (Math.random() * 10) + 1);
		System.out.println(Math.random()); // Math 클래스의 random() 메서드 호출
		// 우리는 정수가 필요하기 때문에 실수를 정수로 바꾸는 과정이 필요함.
		// 실수(double) -> 정수(int) : 강제 형(type)변환(Casting)
		// random() 0보다 크고 1보다 작은 실수
		System.out.println(Math.random() * 10); // 정수를 쓰기위해 10 곱함
		System.out.println((int) (Math.random() * 10)); // 0~9 정수만 출력됨
		System.out.println((int) (Math.random() * 10) + 1); // 1~10 정수만 출력됨
		System.out.println((int) (Math.random() * 45) + 1); // 1~45 정수만 출력됨

		int intVar = 10;
		double doubleVar = 1.234;

		doubleVar = intVar; // 정수(int)=>실수(doubl) 형변환
		System.out.println(doubleVar);
		
		doubleVar = 12.123123;
		intVar = (int) doubleVar; // 실수(double)=>정수(int) 강제형변환
		System.out.println(intVar);

		
		
	}

}
