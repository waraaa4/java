package day13_20211021_01;

//  DTO (Data Transfer Object)
// VO(Value Object)
public class TarineeDTO {
	// 필드 선언
	private String name;
	private int age;
	private String phoneNumber;
	private boolean major;

	// 기본 생성자 선언
	TarineeDTO() {

	}

	public TarineeDTO(String name, int age, String phoneNumber, boolean major) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isMajor() {
		return major;
	}

	public void setMajor(boolean major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Tarinee [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + ", major=" + major + "]";
	}

}
