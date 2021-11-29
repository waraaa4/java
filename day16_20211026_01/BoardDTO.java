package day16_20211026_01;

public class BoardDTO {
	private int bnumber;	// 글번호
	private String writer;	// 작성자
	private String title;	// 제목
	private String contents;	// 내용
	private String password;	// 비밀번호
	private int hits;	// 조회수
	
	public BoardDTO() {
		
	}
	
	public BoardDTO(int bnumber, String writer, String title, String contents, String password, int hits) {
		this.bnumber = bnumber;
		this.writer = writer;
		this.title = title;
		this.contents = contents;
		this.password = password;
		this.hits = hits;
	}

	public int getBnumber() {
		return bnumber;
	}

	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	@Override
	public String toString() {
		return "BoardDTO [bnumber=" + bnumber + ", writer=" + writer + ", title=" + title + ", contents=" + contents
				+ ", password=" + password + ", hits=" + hits + "]";
	}
	
}
