package day08_20211014;

import java.util.Scanner;

public class Ex02_Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int selectNo = 0;
		int[] scores = null; // scores 라는 배열 이름만 선언
		
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택> ");
			selectNo = scan.nextInt();
			
			switch(selectNo) {
			case 1:
				// 학생수 입력 받고 해당 수 크기를 갖는 배열로 선언
				System.out.print("학생수> ");
				studentNum = scan.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				// 배열에 점수 데이터 저장
				for(int i = 0; i<scores.length; i++) {
					scores[i] = scan.nextInt();
				}
				break;
			case 3:
				// 저장된 데이터 출력
				for(int i = 0; i < scores.length; i++) {
					System.out.println((i+1) + "번 째 학생 점수: ");
				}
				break;
			case 4:
				// 최댓값, 평균값
				int sum = 0, max = 0;
				double avg = 0.0;
				for(int i = 0; i < scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				avg = sum / scores.length;
				avg = (double) sum / scores.length;
				System.out.println("최고점수: " + max);
				System.out.println("평균점수: " + avg);
				
				// 내림차순 정렬
				int temp = 0;
				for(int i = 0; i < scores.length; i++) {
					for(int j = i + 1; j < scores.length; j++) {
						if(scores[i] < scores[j]) {
							temp = scores[i];
							scores[i] = scores[j];
							scores[j] = temp;
						}
					}
				}
				for(int i = 0; i < scores.length; i++) {
					System.out.println(scores[i]);
				}
				break;
			case 5:
				// 배열에 점수 데이터 저장
				run = false;
				break;
			}
		}
			
		
		
		
	}

}
