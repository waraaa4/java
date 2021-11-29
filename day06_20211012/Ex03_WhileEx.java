package day06_20211012;

public class Ex03_WhileEx {

	public static void main(String[] args) {
		
		// 1-2+3-4+5-6+7...
		// 합계가 100을 넘었을때의 숫자는?
		System.out.println();
		
		int num = 0; // 1,-2,3,-4,5,-6~~~~~
		int count = 1; // 1,2,3,4,5,6~~~~~
		int s = 1; // 부호용 변수
		int sum = 0; // 합계용 변수
		boolean run = true;
		
		while(run) {
			sum += num;
			if (sum >= 100) {
				run = false;
			} else { 
				num = s * count;
				s = -s;
				count++;
			}	
		}
		System.out.println("숫자: " + num);
		System.out.println("합계: " + sum);
		
		
		
		
	}

}
