package day12_20211020_02;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		// Student 객체를 담을 수 있는 ArrayList 선언
		List<Student> studentList = new ArrayList<Student>();
		
		// student 객체 선언
		Student stu1 = new Student();
		stu1.name = "학생1";
		stu1.age = 22;
		stu1.studentNumber = "20211234";
		
		Student stu2 = new Student("학생2", 20, "20213333");
		
		// Student 객체를 list에 저장
		studentList.add(stu1);
		studentList.add(stu2);
		
		// Student 객체가 가지고 있는 필드값 출력
		System.out.println(studentList.get(0).name);
		System.out.println(studentList.get(1).name);
		
		// stu1이 가지고 있는(즉, 0번 인덱스에 담긴) view() 메서드 호출
		studentList.get(0).view();
		System.out.println(studentList.get(0).toString());
		
		// studentList에 담긴 stu2의 이름 변경
		studentList.get(1).name = "학생2 이름변경";
		
		// foreach 출력해보기
		for(Student s: studentList) {
			System.out.println(s.name);
			System.out.println(s.toString());
			s.view();
		}
		
		// for
		for(int i = 0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i).name);
			System.out.println(studentList.get(i).toString());
			studentList.get(i).view();
		}
		
		

	}

}
