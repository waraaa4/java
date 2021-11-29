package day04_20211007;

import java.util.Scanner;

public class Ex03_ForEx {

	public static void main(String[] args) {
		
		// for문을 이용하여 1부터 10까지 합계 구하기
		// for문을 이용해서 1부터 10까지 숫자를 만들어야 하고 이 숫자들을 더하는 과정이 필요.
		// 합계를 구하기 위한 변수가 하나 필요함.
		// 출력을 아래와 같이 나오도록 해보세요.
		// 1+2+3+4+5+6+7+8+9+10=55
		
		// 합계용 변수
		int start,end,sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작값: ");
		start = scan.nextInt();
		System.out.print("끝값: ");
		end = scan.nextInt();
		
		for(int i = start; i <= end; i++) {
			sum += i; 
			if(i < end) {
				System.out.print(i + "+");
			} else {
				System.out.print(i + "=");
			}
			
		}
		System.out.println(sum);
		
		
		
	}

}
