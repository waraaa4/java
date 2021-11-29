package day18_20211110;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 키보드로 5개 정수를 입력받아서 배열에 저장후 합계 출력하기
		int[] arr=new int[5];
		int sum=0;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			System.out.print("정수: ");
			arr[i] = scan.nextInt();
			sum+=arr[i];
		}
		System.out.println(sum);
		
		
	}

}
