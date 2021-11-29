package day18_20211110;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		// 키보드로 정수(n)를 입력받아서 1~n까지의 합을 구해서 출력하기
//		Scanner scan= new Scanner(System.in);
//		int num = 0;
//		System.out.print("정수: ");
//		num = scan.nextInt();
//		int sum = 0;
//		for(int i =0; i<num+1; i++) {
//			sum+=i;
//		}
//		System.out.println("정수 합계: "+sum);
		
		
		//1~n까지 합이 100을 초과하는 n과 합을 출력하시오
		
		int i =1, sum=0;
		while(true) {
			sum+=i;
			if(sum>100) {
				break;
			}
			i++;
		}
//		while(sum<100) {
//			sum+=i;
//			i++;
//		}
		System.out.println((i) + "" + sum);
		
		
		
		
		
	}

}
