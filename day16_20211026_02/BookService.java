package day16_20211026_02;

import java.util.*;

public class BookService {
	/*
	 * 회원등록 메서드이름: memberRegistration 리턴타입: Map<Integer, ClientDTO> 매개변수:
	 * Map<Integer, ClientDTO>
	 */
	public Map<Integer, ClientDTO> memberRegistration(Map<Integer, ClientDTO> clientMap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("고객이름: ");
		String clientName = scan.nextLine();
		System.out.print("전화번호: ");
		String clientPhone = scan.nextLine();
		int clientNumber = clientMap.size() + 1;

		ClientDTO cMember = new ClientDTO(clientNumber, clientName, clientPhone);
		clientMap.put(clientNumber, cMember);

		return clientMap;
	}

	/*
	 * 도서등록 메서드이름: bookRegistration 리턴타입: Map<Integer, BookDTO> 매개변수: Map<Integer,
	 * BookDTO>
	 */
	public Map<Integer, BookDTO> bookRegistration(Map<Integer, BookDTO> bookMap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("도서명: ");
		String bookName = scan.next();
		System.out.print("작가: ");
		String bookAuthor = scan.nextLine();
		System.out.print("대출여부 false & true: ");
		boolean bookCheck = scan.nextBoolean();
		scan.nextLine();
		System.out.print("대출회원: ");
		String clientNumber = scan.nextLine();
		int bookNumber = bookMap.size() + 1;

		BookDTO bMember = new BookDTO(bookNumber, bookName, bookAuthor, bookCheck);
		bookMap.put(bookNumber, bMember);
		return bookMap;
	}

	/*
	 * 도서대출 메서드이름: bookLoans 리턴타입: Map<Integer, BookDTO> 매개변수: Map<Integer, BookDTO>
	 */
	public Map<Integer, BookDTO> bookLoans(Map<Integer, BookDTO> bookMap, Map<Integer, ClientDTO> clientMap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("고객번호: ");
		int clientNumber = scan.nextInt();
		System.out.print("도서번호: ");
		int bookNumber = scan.nextInt();

		ClientDTO num1 = null;
		BookDTO num2 = null;

		for (int n : clientMap.keySet()) {
			if (clientNumber == clientMap.get(n).getClientNumber()) {
				num1 = clientMap.get(n);
			}
		}
		for (int n : bookMap.keySet()) {
			if (bookNumber == bookMap.get(n).getBookNumber()) {
				num2 = bookMap.get(n);
			}
		}
		if (num1.getClientNumber() == clientNumber && num2.bookCheck == true) {
			num2.bookCheck = false;
			num2.setClientNumber(clientNumber);
			System.out.println(num2.getBookName() + " 책이 대출되었습니다.");

			ClientDTO client = clientMap.get(num2);
			// ClientDTO 타입의 bookBorrowed 필드에 데이터 저장
			bookMap.get(num1).setBookBorrowed(client);
		} else {
			System.out.println("대출이 불가능 합니다.");
		}

		bookMap.put(bookNumber, num2);
		return bookMap;
	}
	/*
	 * public List<BookDTO> borrowBook (List<BookDTO> bookList, List<ClientDTO>
	 * clientList) {
	 * 
	 * System.out.println("고객 번호 : "); int clientNumber = scan.nextInt();
	 * System.out.println("빌릴 책 번호 : "); int bookNumber = scan.nextInt();
	 * 
	 * //해당 고객 번호가 어떤 인덱스에 있는지 체크 int clientIndex =
	 * clientCheck(clientList,clientNumber); int bookIndex =
	 * bookCheck(bookList,bookNumber);
	 * 
	 * if(clientIndex > 0 && bookIndex > 0) {
	 * if(bookList.get(bookIndex).isBookCheck()) { //bookCheck = true > 대출가능,
	 * bookCheck = false > 대출불가능
	 * bookList.get(bookIndex).setClientNumber(clientNumber);
	 * bookList.get(bookIndex).setBookCheck(false);
	 * 
	 * //ClientDTO 타입의 bookBorrowed 필드에 데이터 저장 //대출하고자 하는 고객정보를 가져옴 ClientDTO client
	 * = clientList.get(clientIndex);
	 * bookList.get(bookIndex).setBookBorrowed(client);
	 * 
	 * // bookList.get(bookIndex).setBookBorrowed(clientList.get(clientIndex)); }
	 * else { System.out.println("이미 대출중 입니다."); } } else { //clientIndex 또는
	 * bookIndex가 유효하지 않은 경우 System.out.println("정보가 유효하지 않습니다.");
	 * 
	 * 
	 * } return bookList; }
	 */

	/*
	 * 전체 회원목록 메서드이름: memberList 리턴타입: void 매개변수: Map<Integer, ClientDTO>
	 */
	public void memberList(Map<Integer, ClientDTO> clientMap) {

		for (int n : clientMap.keySet()) {
			System.out.println(clientMap.get(n));
		}
	}

	/*
	 * 전체 도서목록 메서드이름: bookList 리턴타입: void 매개변수: Map<Integer, BookDTO>
	 */
	public void bookList(Map<Integer, BookDTO> bookMap) {
		for (int n : bookMap.keySet()) {
			System.out.println(bookMap.get(n));
		}
	}

}
