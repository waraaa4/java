package day15_20211025_01;

import java.util.*;

public class BoardService {
	
	/*
	 * 	글쓰기
	 *  메서드이름: boardWrite 
	 *  리턴타입: List<BoardDTO>
	 *  매개변수: List<BoardDTO>
	 */
	public List<BoardDTO> boardWrite(List<BoardDTO> boardList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("작성자: ");
		String writer = scan.nextLine();
		System.out.print("제목: ");
		String title = scan.nextLine();
		System.out.print("내용: ");
		String contents = scan.nextLine();
		System.out.print("비밀번호: ");
		String password = scan.nextLine();
		int bnumber = boardList.size() + 1;
		
		// 새로 만들어서 add로 넣어준다음 바뀐값을 리턴
		BoardDTO bulletin = new BoardDTO(bnumber, writer, title, contents, password,0);
		boardList.add(bulletin);
		return boardList;
	}
	
	/*
	 * 	전체목록조회
	 *  메서드이름: boardListView 
	 *  리턴타입: void
	 *  매개변수: List<BoardDTO>
	 */
	public void boardListView(List<BoardDTO> boardList) {
		for(BoardDTO b: boardList) {
			System.out.println(b);
		}
	}
	
	/*
	 * 	상세글조회
	 *  메서드이름: boardView 
	 *  리턴타입: List<BoardDTO>
	 *  매개변수: List<BoardDTO>
	 */
	public List<BoardDTO> boardView(List<BoardDTO> boardList){
		Scanner scan = new Scanner(System.in);
		System.out.print("글번호 입력: ");
		int number = scan.nextInt();
		for(int i=0; i < boardList.size(); i++) {
			if(number == boardList.get(i).getBnumber()) {
				// 조회수 증가
//				int hits = boardList.get(i).getHits() +1;
//				boardList.get(i).setHits(hits);
				boardList.get(i).setHits(boardList.get(i).getHits()+1);
				System.out.println(boardList.get(i)); 
			}
		}
		return boardList;
	}
	
	/*
	 * 	글삭제
	 *  메서드이름: boardDelete 
	 *  리턴타입: List<BoardDTO>
	 *  매개변수: List<BoardDTO>
	 */
	public List<BoardDTO> boardDelete(List<BoardDTO> boardList) {
		int checkResult = clientCheck(boardList);
		if(checkResult >= 0) {
			boardList.remove(checkResult);
		}
		return boardList;
	}
	
	/*
	 * 	글수정
	 *  메서드이름: boardUpdate 
	 *  리턴타입: List<BoardDTO>
	 *  매개변수: List<BoardDTO>
	 */
	public List<BoardDTO> boardUpdate(List<BoardDTO> boardList) {
		Scanner scan = new Scanner(System.in);
		int checkResult = clientCheck(boardList);
		if(checkResult >= 0) {
			System.out.print("제목: ");
			String title = scan.nextLine();
			System.out.print("내용: ");
			String contents = scan.nextLine();
			boardList.get(checkResult).setTitle(title);
			boardList.get(checkResult).setContents(contents);
		}
		return boardList;
	}
	
	/*
	 *  글삭제 글수정 공통 메서드
	 *  글번호, 비밀번호 체크
	 *  메서드이름: clientCheck 
	 *  리턴타입: int
	 *  매개변수: List<BoardDTO>
	 */
	public int clientCheck(List<BoardDTO> boardList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("글번호: ");
		int bnumber = scan.nextInt();
		scan.nextLine();
		System.out.print("비밀번호: ");
		String password = scan.nextLine();
		
		int clientNumber = -1;
		
		for(int i = 0; i <boardList.size(); i++) {
			if(bnumber == boardList.get(i).getBnumber() && password.equals(boardList.get(i).getPassword())) {
				clientNumber = i;
			}
		}
		return clientNumber;
	}
	
	
	
}
