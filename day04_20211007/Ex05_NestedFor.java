package day04_20211007;

public class Ex05_NestedFor {

	public static void main(String[] args) {
		
		// 중첩 for문
		System.out.println("바깥for문 들어가기 전");
		for(int i = 1; i <= 2; i++) {
			System.out.println("안쪽 for문 들어가기 전");
			for(int j = 1; j <= 3; j++) {
				System.out.print("i: " + i);
				System.out.println("\t j: " + j);
			}
			System.out.println("안쪽for문 끝");
		}
		System.out.println("바깥쪽for문 끝");
		
		
		
		

	}

}
