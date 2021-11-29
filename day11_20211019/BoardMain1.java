package day11_20211019;

import java.util.Scanner;

public class BoardMain1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Board1 board = new Board1();
		
		System.out.print("제목을 입력하세요: ");
		String title = scan.nextLine();
		System.out.print("작성자를 입력하세요: ");
		String writer = scan.nextLine();
		System.out.print("내용을 입력하세요: ");
		String contents = scan.nextLine();
		board.boardWrite(title, writer, contents);
		board.boardView();
		System.out.print("수정 할 제목을 입력하세요: ");
		title = scan.nextLine();
		System.out.print("수정 할 내용을 입력하세요: ");
		contents = scan.nextLine();
		board.boardUpdate(title, contents);
		System.out.println("전체 실행 종료");
	}

}
