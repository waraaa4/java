package day05_20211008;

public class Ex02_While {

	public static void main(String[] args) {
		
		// i값이 123456이 될 때 반복문이 종료되도록 해보세요
		boolean run = true;
		int i = 1;
		while(run) {
			System.out.println(i);
			if(i == 123456) {
				run = false;
			}
			i++;
		}
		System.out.println("while문 종료: " + i);

		
		
		
		
	}

}
