package day07_20211013;

import java.util.Scanner;

public class Ex04_ArrayEx {

	public static void main(String[] args) {

		// 크기가 5인 정수형 배열을 선언하고
		// 스캐너로 값을 받은 뒤
		// 입력받은 값 중에서 가장 큰 값을 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int max = 0;
		
		// 배열 값 넣기
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자를 입력하세요: ");
			num[i] = scan.nextInt();
			if(max < num[i]) {
				max = num[i];
			}
		}
		System.out.print(max);
		
		
		
	}

}
