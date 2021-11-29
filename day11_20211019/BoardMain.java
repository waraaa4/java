package day11_20211019;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		Board bd = new Board();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int num = 0;
		
		while(run) {
			System.out.println("1.새글 | 2.조회수 | 3.수정 | 4.종료");
			System.out.print("선택: ");
			num = scan.nextInt();
			switch(num) {
			case 1:
				System.out.print("제목을 입력하세요: ");
				bd.title = scan.nextLine();
				System.out.print("작성자를 입력하세요: ");
				bd.writer = scan.nextLine();
				System.out.print("내용을 입력하세요: ");
				bd.content = scan.nextLine();
				break;
			case 2:
				int result = bd.boardView();
				System.out.println(result);
				break;
			case 3:
				bd.boardUpdate();
				
				break;
			case 4:
				run = false;
				System.out.println("종료");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		

	}

}
