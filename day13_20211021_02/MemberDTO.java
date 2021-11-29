package day13_20211021_02;

public class MemberDTO {
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private int memNum;
	
	MemberDTO() {
		
	}
	
	public MemberDTO(String id, String pw, String name, String email, int memNum) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.memNum = memNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMemNum() {
		return memNum;
	}

	public void setMemNum(int memNum) {
		this.memNum = memNum;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email
				+ ", memNum=" + memNum + "]";
	}

		
}
