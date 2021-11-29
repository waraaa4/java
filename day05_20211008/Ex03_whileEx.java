package day05_20211008;

public class Ex03_whileEx {

	public static void main(String[] args) {

		// while문 이용하여 1부터 10까지 합계 출력
		// 1+2+3+~~~~~~~+10=55 출력하기
		
		int i = 1;
		int sum = 0;
		
		// 내가한거
//		boolean bool = true;
//		while (bool) {
//			if (i < 10) {
//				sum += i;
//				System.out.print(i + "+");
//			} else {
//				sum += i;
//				System.out.print(i);
//				System.out.print("=" + sum);
//				bool = false;
//			}
//			num++;
//		}
		
		//선생님이 하신거
		while(i <= 10) {
			System.out.print(i);
			sum += i;
			if(i < 10) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
			i++;
		}
		System.out.println(sum);
		

	}

}
