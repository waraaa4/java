package day04_20211007;

public class Ex07_Star {

	public static void main(String[] args) {
		
		// 별찍기
		// 중첩 for문을 이용해서 아래와 같이 출력
//		*
//		**
//		***
//		****
//		*****
		
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
	}

}
