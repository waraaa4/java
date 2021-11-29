package day05_20211008;

public class Ex05_WhileEx {

	public static void main(String[] args) {

		// 주사위(1~6)가 있을때
		// 주사위를 계속 던져서 6이 나오면 종료가 되는 프로그램을 while로 작성해 보시오.

		// 내가한거
//		int i = 1;
//		while (i < 6) {
//			i = (int) (Math.random() * 6) + 1;
//			System.out.println("숫자: " + i);
//		}
//		System.out.println("6이 나왔네요. 종료합니다.");

		// 선생님이 하신거
		boolean run = true;
		while(run) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if(num == 6) {
				System.out.println("6이 나왔네요. 종료합니다.");
				run = false;
			}
		}
		
		
		
		
	}

}
