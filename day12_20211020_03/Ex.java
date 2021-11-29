package day12_20211020_03;

public class Ex {
	
	private String name;
	private int age;
	private String studentNumber;
	
	Ex() {
		
	}
	
	public Ex(String name, int age, String studentNumber) {
		this.name = name;
		this.age = age;
		this.studentNumber = studentNumber;
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

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	@Override
	public String toString() {
		return "Ex [name=" + name + ", age=" + age + ", studentNumber=" + studentNumber + "]";
	}
	
	
}
