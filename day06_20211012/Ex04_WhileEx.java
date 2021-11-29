package day06_20211012;

import java.util.Scanner;

public class Ex04_WhileEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = 0;
		int count = 0;
		boolean run = true;
		final int answer = (int) (Math.random()*100) + 1;
		System.out.println("정답숫자 확인용 " + answer);
		System.out.print("1부터 100까지의 숫자를 입력하세요: ");
		input = scan.nextInt();
		
		// 내가 한거
//		while (run) {
//			count ++;
//			if (answer == input) {
//				run = false;
//			} else if(answer < input && 0 < input && 100 >= input) {
//				System.out.println("더 작은 수를 입력하세요.");
//				System.out.print("1부터 100까지의 숫자를 입력하세요: ");
//				input = scan.nextInt();
//			} else if(answer > input && 0 < input && 100 >= input) {
//				System.out.println("더 큰 수를 입력하세요.");
//				System.out.print("1부터 100까지의 숫자를 입력하세요: ");
//				input = scan.nextInt();
//			} else if(input < 0 || 100 < input) {
//				System.out.println("잘못입력 했습니다.");
//				System.out.print("1부터 100까지의 숫자를 입력하세요: ");
//				input = scan.nextInt();
//			}
//		}
//		System.out.println("정답 입니다!");
//		System.out.println("시도횟수는 " + count + "번 입니다.");
		
		// 선생님이 하신거
		do {
			System.out.print("1부터 100까지의 숫자를 입력하세요: ");
			input = scan.nextInt();
			count ++;
			if (input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if (input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
			} else {
				System.out.println("정답 입니다!");
				System.out.println("시도횟수는 " + count + "번 입니다.");
				run = false;
			}
		} while(run);
		
		
		
	}

}
