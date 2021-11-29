package day07_20211013;

import java.util.Scanner;

public class Ex03_ArrayEx {

	public static void main(String[] args) {
		
		// 크기가 3인 정수형 배열을 선언하고 스캐너를 이용해 배열에 데이터를 저장하고
		// 저장된 값의 총합, 평균을 계산하세요.
		int sum = 0;
		int[] num = new int[3];
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(i+"번째 숫자 입력: ");
			num[i] = scan.nextInt();
			sum += num[i];
		}
		
		System.out.println("총합: " + sum);
		System.out.println("평균: " + sum/num.length);
		

	}

}
