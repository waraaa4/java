package day16_20211026_02;

import java.util.*;

public class BookMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Integer, BookDTO> bookMap = new HashMap<Integer, BookDTO>();
		Map<Integer, ClientDTO> clientMap = new HashMap<Integer, ClientDTO>();
		BookService bookSb = new BookService();
		boolean run = true;
		
		while(run) {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("1.회원등록 | 2.도서등록 | 3.도서대출 | 4.전체 회원목록 | 5.전체 도서목록 | 6.종료");
			System.out.println("------------------------------------------------------------------------");
			System.out.print("선택> ");
			
			int select = scan.nextInt();
			
			if (select == 1) {
				// 회원등록
				clientMap = bookSb.memberRegistration(clientMap);
			} else if (select == 2) {
				// 도서등록
				bookMap = bookSb.bookRegistration(bookMap);
			} else if (select == 3) {
				// 도서대출
				bookMap = bookSb.bookLoans(bookMap,clientMap);
			} else if (select == 4) {
				// 전체 회원목록
				bookSb.memberList(clientMap);
			} else if (select == 5) {
				// 전체 도서목록
				bookSb.bookList(bookMap);
			} else if (select == 6) {
				run = false;
			} else {
				System.out.println("다시 선택해주세요.");
			}
			
		}
		
		
		
		
	}

}
