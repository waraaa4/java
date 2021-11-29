package day17_20211027_02;

public class BoardMain {

	public static void main(String[] args) {
		// boardService1을 사용하는 경우
		boardService1 bs1 = new boardService1();
		bs1.boardWrite();
		// boardService2를 사용하는 경우
		boardService2 bs2 = new boardService2();
		bs2.boardWrite();
		
		// 인터페이스 활용
		// 인터페이스는 생성자가 없음.
		// 우변에는 인터페이스의 구현클래스 생성자를 사용함.
//		BoardServiceInterface bs = new BoardServiceInterFace();	(x)
		
		BoardServiceInterface bs = new boardServiceInt2();
		bs.boardWrite("aa", "bb");
		
		
	}

}
