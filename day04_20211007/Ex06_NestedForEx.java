package day04_20211007;

public class Ex06_NestedForEx {

	public static void main(String[] args) {

		// 중첩 for문을 활용하여 구구단을 출력해 보세요.

		
		for (int i = 2; i <= 9; i++) { // 단수
			for (int j = 1; j <= 9; j++) { // 곱하는수
				System.out.print(i + "x" + j + "=" + (i *j));
				System.out.print("\t");
			}
			
			System.out.print("\n"); // 줄바꿈
		}
		
		

	}

}
