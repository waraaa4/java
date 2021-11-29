package day11_20211019;

import java.util.Scanner;

public class Board {

	String title;		// 제목
	String writer;		// 작성자
	String content; 	// 내용
	int viewCount;		// 조회수
	
	void boardWrite(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	int boardView() {
		++viewCount;
		return viewCount;
	}
	
	void boardUpdate() {
		Scanner scan = new Scanner(System.in);
		System.out.print("제목 수정: ");
		this.title = scan.nextLine();
		System.out.print("내용 입력: ");
		this.content = scan.nextLine();
	}
	
	
	
	
	
	
}
