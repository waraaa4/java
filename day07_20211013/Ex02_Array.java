package day07_20211013;

public class Ex02_Array {

	public static void main(String[] args) {

		// 정수 타입의 number 배열 객체 선언(값, 크기는 결정되지 않은 상태)
		int[] number;
		// System.out.println(number[]); 값이 없어서 오류
		int number1[];
		int[] number2 = null;
		String[] strVars = null;

		// 배열 선언하면서 초기값 지정
		int[] number3 = { 1, 3, 12, 100, 123 };
		String[] strVarS1 = { "가나", "가나다라", "abcdef", "123456@#AA" };

		// 배열에 저장된 값 출력하기(인덱스 활용)
		System.out.println(number3[0]);
		System.out.println(number3[1]);
		System.out.println(number3[2]);
		System.out.println(number3[3]);
		System.out.println(number3[4]);
		// System.out.println(number3[5]); out of bounds excetion 발생

		// 배열 데이터 바꾸기
		// number3 배열의 2번 인덱스에 99 저장
		System.out.println(number3[2]);
		number3[2] = 99;
		System.out.println(number3[2]);

		// 배열의 크기(몇 개의 데이터가 있는지) 확인
		System.out.println(number3.length);
		int number3Size = number3.length;
		System.out.println(number3Size);

		
		
		// number3 배열의 크기: 5
		// number3 배열 인덱스: 0~4

		// 타입: 정수형
		// 이름은 number4
		// 크기: 3
		// 인덱스 0~2
		int[] number4 = new int[3];
		System.out.println(number4[0]);

		double[] number5 = new double[2];
		System.out.println(number5[0]);

		String[] strVars2 = new String[3];
		System.out.println(strVars2[0]);

		
		// 34,555,7898,1111 이 들어있는 정수형 배열 num을 선언하고
		// 이 배열에 들어있는 값을 for문을 통해 출력해보시오.
		int[] num = { 34, 555, 7898, 1111 };
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		// num 배열에 저장된 데이터의 총합과 평균 계산
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum  += num[i];
		}
		System.out.println("총합 " + sum);
		System.out.println("평균 " + sum/num.length);
		
		
		
		

	}

}
