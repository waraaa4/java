package day09_20211015_01;

public class StudentMain {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name = "이름1";
		stu1.classOf = "1학번";
		stu1.department = "컴공1";
		stu1.age = 21;
		Student stu2 = new Student("이름2", "2학번", "컴공2", 22);
		Student stu3 = new Student("이름3", "3학번");
		Student stu4 = new Student("4학번", "컴공4", 24);
	}
}
