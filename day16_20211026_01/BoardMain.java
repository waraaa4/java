package day16_20211026_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import day14_20211022_01.MemberDTO;

public class BoardMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Integer, BoardDTO> boardMap = new HashMap<Integer, BoardDTO>();
		BoardService bs = new BoardService();
		boolean run = true;
		
		while (run) {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("1.글쓰기 | 2.전체목록조회 | 3.상세글조회 | 4.글삭제 | 5.글수정 | 6.종료");
			System.out.println("------------------------------------------------------------------------");
			System.out.print("선택> ");
			int select = scan.nextInt();

			if (select == 1) {
				boardMap = bs.boardWrite(boardMap);
			} else if (select == 2) {
				bs.boardListView(boardMap);
			} else if (select == 3) {
				boardMap = bs.boardView(boardMap);
			} else if (select == 4) {
				boardMap = bs.boardDelete(boardMap);
			} else if (select == 5) {
				bs.boardUpdate(boardMap);
			} else if (select == 6) {
				run = false;
			} else {
				System.out.println("다시 선택해주세요.");
			}

		}

	}

}
