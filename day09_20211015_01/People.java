package day09_20211015_01;

public class People {
	// 필드 선언
	String name;
	int age;
	// 필드 초기값
	String nation = "미국";
	
	// 기본생성자 선언
	People() {
		System.out.println("기본생성자 호출됨.");
	}
	
	// 매개변수가 있는 생성자 선언
	People(String name, int age, String nation) {
		System.out.println("매개변수 3개 생성자");
		// this.: 현재 클래스의 필드를 가리킬 때 
		this.name = name;
		this.age = age;
		this.nation = nation;
		
		//매개변수 값 확인
		System.out.println(name);
		System.out.println(age);
		System.out.println(nation);
		System.out.println("매개변수 3개 생성자 끝");
	}
	
	// 매개변수 타입: String, int
	People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 매개변수 타입: String, int
//	People(String nation, int age) {
//		this.name = nation;
//		this.age = age;
//	}
	
	People(int age, String nation) {
		this.age = age;
		this.nation = nation;
	}
	
	People(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
}
