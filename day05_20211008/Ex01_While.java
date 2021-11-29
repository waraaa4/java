package day05_20211008;

public class Ex01_While {

	public static void main(String[] args) {
		
		// while
		// while문을 이용하여 1부터 3까지 출력하기
		int i = 1;
		while(i <= 3) {
			System.out.println("while문 내부");
			System.out.println(i);
			i++;
		}
		
		// do
		i = 10;
		do {
			System.out.println("do while 내부");
			System.out.println(i);
			i++;
		} while(i <= 3);
		System.out.println("while문종료: " + i);
		
		//for
		for(int j = 1; j <= 3; j++) {
			System.out.println(j);
		}
		
		
		
		
		
		
		
		

	}

}
