package day02_20211005;

import java.util.Scanner; // java.util 패키지에 소속된 Scanner 클래스

public class Ex03_Scanner { // 클래스 이름을 Scanner로 만들면 안됨.

	public static void main(String[] args) {
		
		// 스캐너 활용
		// 스캐너 객체를 선언하여 활용 가능
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		System.out.println(num1);
		
		// 스캐너를 이용하여 num1에 데이터 입력
		System.out.println("숫자를 입력하세요: "); // println() ()안에 있는 내용을 출력하고 줄을 바꿈.
		System.out.print("숫자를 입력하세요: "); // print() 줄 안바꾸고 입력 가능.
		num1 = scan.nextInt(); // Scanner 클래스가 가지고 있는 nextInt() 메서드를 호출.
		System.out.println(num1);
		
		String name = "";
		System.out.print("이름을 입력하세요(next메서드): ");
		name = scan.next(); // 띄어쓰기 또는 엔터 전까지 입력한 내용을 저장
		System.out.println(name);
		scan.nextLine();
		
		System.out.print("이름을 입력하세요(nextLine메서드): ");
		name = scan.nextLine(); // 엔터 전까지 입력한 모든 내용을 저장
		System.out.println(name);

	}

}
