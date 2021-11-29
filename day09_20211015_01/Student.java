package day09_20211015_01;

public class Student {
	// 필드
	String name;
	String classOf;
	String department;
	int age;
	
	Student() {
		System.out.println("기본");
	}
	
	// 학번을 String로 한 이유는 앞에 01이 이런식으로
	// 앞에 0이 붙으면 0은 없어지고 1만 표시되서 String을 사용
	Student(String name, String classOf, String department, int age) {
		this.name = name;
		this.classOf = classOf;
		this.department = department;
		this.age = age;
		System.out.println("이름, 학번, 학과, 나이");
	}
	
	Student(String name, String classOf) {
		this.name = name;
		this.classOf = classOf;
		System.out.println("이름, 학번");
	}
	
	Student(String classOf, String department, int age) {
		this.classOf = classOf;
		this.department = department;
		this.age = age;
		System.out.println("학번, 학과, 나이");
	}
}
