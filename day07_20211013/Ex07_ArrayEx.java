package day07_20211013;

import java.util.Scanner;

public class Ex07_ArrayEx {

	public static void main(String[] args) {
		
		// 거스름 돈 계산하기
		int[] coin = { 500, 100, 50, 10 };
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int change = scan.nextInt();
		int coinCount = 0;
		
		for (int i = 0; i < coin.length; i++) {
			coinCount = change / coin[i];
			System.out.println(coin[i] + "원 " + coinCount + "개");
			change %= coin[i];
		}
		
		
		

	}

}
