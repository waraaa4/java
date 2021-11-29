package day08_20211014;

import java.util.Scanner;

public class Ex02_Ex {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int choice = 0;  	// 선택
		int student = 0; 	// 학생 입력
		int[] studentNum = null; // 학생수 배열
		int hiScore = 0;		// 최고점수
		int agScore = 0;	// 평균점수
		int bug1 = 0;		// 1번 입력 안하고 다른번호 누르는거 방지
		int bug2 = 0;		// 2번 입력 안하고 다른번호 누르는거 방지
		boolean run = true;	// 종료
		
		do {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택> ");
			choice = scan.nextInt();
			if(choice == 1) {
				System.out.print("학생수> ");
				student = scan.nextInt(); 	 // 3
				studentNum = new int[student];
				bug1 = 1; 
			} else if(choice == 2 && bug1 == 1) {
				for(int i = 0; i < student; i++) {
					System.out.print((i+1) + "번째 학생점수: ");
					int temp = scan.nextInt(); // 3
					studentNum[i] += temp;
				}
				bug2 = 1;
			} else if(choice == 3) {
				for(int i = 0; i < student; i++) {
					System.out.println((i+1) + "번째 학생점수: " + studentNum[i]);
				}
			} else if(choice == 4 && bug2 == 1) {
				// 최고점수, 평균점수
				for(int i = 0; i < student; i++) {
					agScore += studentNum[i];
					if(hiScore < studentNum[i]) {
						hiScore = studentNum[i];
					}
				}
				System.out.println("최고점수: " + hiScore);
				System.out.println("평균점수: " + agScore / student);
				//높은 점수 순서
				for(int i = 0; i < student; i++) {
					for(int j = i+1; j < student; j++) {
						if(studentNum[i] < studentNum[j]) {
							int temp = studentNum[i];
							studentNum[i] = studentNum[j];
							studentNum[j] = temp;
						}
					}
					System.out.println(studentNum[i]);
				}
			} else if(choice == 5) {
				run = false;
				System.out.println("종료 합니다.");
			} else {
				System.out.println("번호를 다시 입력해 주세요.");
			}
		} while(run);
		
		
		
		

	}

}
