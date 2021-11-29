package day07_20211013;

import java.util.Scanner;

public class Ex06_ArrayEx {

	public static void main(String[] args) {
		
		// 아래와 같이 배열이 있을 때
		// 어떤 숫자가 몇번 인덱스에 있는 지 출력
		// 예) 8 입력하면 8은 9번 인덱스에 있습니다.
		// 		4 입력하면 4는 4번 인덱스에 있습니다.
		int num[] = { 5, 2, 1, 3, 4, 7, 6, 9, 10, 8 };
		int input = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		input = scan.nextInt();
		
		for(int i = 0; i < num.length; i++) {
			if(input == num[i]) {
				System.out.println(input + "는 " + i + "번 인덱스에 있습니다.");
			}
		}
		
		
		
	}

}
