package day11_20211019;

public class Board1 {
	String title;
	String writer;
	String contents;
	int hits = 0;
	
	// this는 매개변수가 있는 생성자나 메서드에서
	// 매개변수와 필드를 구분하기 위해 필드앞에 붙이는 것
	// 매개변수와 필드 이름을 다르게 해서 this 안붙이기
	// 하지만 잘 사용안함
//	void boardWrite(String title1, String writer1, String contents1) {
//		title = title1;
//		writer = writer1;
//		contents = contents1;
//	}
	
	void boardWrite(String title, String writer, String contents) {
		this.title = title;
		this.writer = writer;
		this.contents = contents;
	}
	
	void boardView() {
		System.out.println(title);
		System.out.println(writer);
		System.out.println(contents);
		// boardView 메서드가 호출되면 hits 값을 하나 올림
		hits = hits + 1;
		System.out.println(hits);
	}
	
	void boardUpdate(String title, String contents) {
		this.title = title;
		this.contents = contents;
//		System.out.println(this.title);
//		System.out.println(this.writer);
//		System.out.println(this.contents);
//		System.out.println(this.hits);
		System.out.println("boardUpdate 메서드에서 boardView 메서드 호출");
		boardView();
		System.out.println("호출 끝");
	}
	
}
