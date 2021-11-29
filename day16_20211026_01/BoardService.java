package day16_20211026_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import day14_20211022_01.MemberDTO;

public class BoardService {
	/*
	 * 	글쓰기
	 *  메서드이름: boardWrite 
	 *  리턴타입: Map<Integer, BoardDTO>
	 *  매개변수: Map<Integer, BoardDTO>
	 */
	public Map<Integer, BoardDTO> boardWrite(Map<Integer, BoardDTO> boardMap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("작성자: ");
		String writer = scan.nextLine();
		System.out.print("제목: ");
		String title = scan.nextLine();
		System.out.print("내용: ");
		String contents = scan.nextLine();
		System.out.print("비밀번호: ");
		String password = scan.nextLine();
		int bnumber = boardMap.size() + 1;
		
		BoardDTO bulletin = new BoardDTO(bnumber, writer, title, contents, password,0);
		
		boardMap.put(bnumber, bulletin);
		return boardMap;
	}
	
	/*
	 * 	전체목록조회
	 *  메서드이름: boardListView 
	 *  리턴타입: void
	 *  매개변수: List<BoardDTO>
	 */
	public void boardListView(Map<Integer, BoardDTO> boardMap) {
		for(int n: boardMap.keySet()) {
			System.out.println(boardMap.get(n));
		}
	}
	
	/*
	 * 	상세글조회
	 *  메서드이름: boardView 
	 *  리턴타입: Map<Integer, BoardDTO>
	 *  매개변수: Map<Integer, BoardDTO>
	 */
	public Map<Integer, BoardDTO> boardView(Map<Integer, BoardDTO> boardMap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("글번호 입력: ");
		int bnumber = scan.nextInt();
		
		for(Integer boardKey: boardMap.keySet()) {
			if(bnumber == boardMap.get(boardKey).getBnumber()) {
				BoardDTO bnumberNum = boardMap.get(bnumber);
				bnumberNum.setHits(boardMap.get(bnumber).getHits()+1);
				System.out.println(boardMap.get(bnumber)); 
				boardMap.put(bnumber, bnumberNum);
			}
		}
		return boardMap;
	}
	
	/*
	 * 	글삭제
	 *  메서드이름: boardDelete 
	 *  리턴타입: Map<Integer, BoardDTO>
	 *  매개변수: Map<Integer, BoardDTO>
	 */
	public Map<Integer, BoardDTO> boardDelete(Map<Integer, BoardDTO> boardMap) {
		int checkResult = clientCheck(boardMap);
		if(checkResult > 0) {
			boardMap.remove(checkResult);
		}
		return boardMap;
	}
	
	/*
	 * 	글수정
	 *  메서드이름: boardUpdate 
	 *  리턴타입: Map<Integer, BoardDTO>
	 *  매개변수: Map<Integer, BoardDTO>
	 */
	public Map<Integer, BoardDTO> boardUpdate(Map<Integer, BoardDTO> boardMap) {
		Scanner scan = new Scanner(System.in);
		int checkResult = clientCheck(boardMap);
		if(checkResult > 0) {
			System.out.print("제목: ");
			String title = scan.nextLine();
			System.out.print("내용: ");
			String contents = scan.nextLine();
			
			BoardDTO loginBoard = boardMap.get(checkResult);
			
			loginBoard.setTitle(title);
			loginBoard.setContents(contents);
			boardMap.put(checkResult, loginBoard);
		}
		return boardMap;
	}
	
	/*
	 *  글삭제 글수정 공통 메서드
	 *  글번호, 비밀번호 체크
	 *  메서드이름: clientCheck 
	 *  리턴타입: int
	 *  매개변수: Map<Integer, BoardDTO>
	 */
	public int clientCheck(Map<Integer, BoardDTO> boardMap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("글번호: ");
		int bnumber = scan.nextInt();
		scan.nextLine();
		System.out.print("비밀번호: ");
		String password = scan.nextLine();
		
		MemberDTO member = null;
		int memberNumber = 0;
		
		for(Integer boardKey: boardMap.keySet()) {
			if(bnumber == boardMap.get(boardKey).getBnumber() && password.equals(boardMap.get(boardKey).getPassword())) {
				memberNumber = boardKey;
			}
		}
		return memberNumber;
	}
				
			
			
}
