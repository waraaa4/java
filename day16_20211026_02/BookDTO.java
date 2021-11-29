package day16_20211026_02;

public class BookDTO {
	int bookNumber;		// 도서번호
	String bookName;	// 도서명
	String bookAuthor;	// 작가
	boolean bookCheck;	// 대출여부
	
	private int clientNumber;	// 고객번호
	
	private ClientDTO bookBorrowed; // 대출하는 고객정보 전체
	
	public BookDTO(int bookNumber, String bookName, String bookAuthor, boolean bookCheck) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookCheck = bookCheck;
//		this.clientNumber = clientNumber;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public boolean isBookCheck() {
		return bookCheck;
	}

	public void setBookCheck(boolean bookCheck) {
		this.bookCheck = bookCheck;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	@Override
	public String toString() {
		return "BookDTO [bookNumber=" + bookNumber + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor
				+ ", bookCheck=" + bookCheck + ", clientNumber=" + clientNumber + "]";
	}

	public void setBookBorrowed(ClientDTO client) {
		// TODO Auto-generated method stub
		
	}
	
}
