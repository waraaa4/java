package day15_20211025_01;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();
		BoardService bs = new BoardService();
		boolean run = true;
		
		while (run) {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("1.글쓰기 | 2.전체목록조회 | 3.상세글조회 | 4.글삭제 | 5.글수정 | 6.종료");
			System.out.println("------------------------------------------------------------------------");
			System.out.print("선택> ");
			int select = scan.nextInt();

			if (select == 1) {
				boardList = bs.boardWrite(boardList);
			} else if (select == 2) {
				bs.boardListView(boardList);
			} else if (select == 3) {
				boardList = bs.boardView(boardList);
			} else if (select == 4) {
				boardList = bs.boardDelete(boardList);
			} else if (select == 5) {
				bs.boardUpdate(boardList);
			} else if (select == 6) {
				run = false;
			} else {
				System.out.println("다시 선택해주세요.");
			}

		}
	}

}
