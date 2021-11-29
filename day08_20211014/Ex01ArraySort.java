package day08_20211014;

public class Ex01ArraySort {

	public static void main(String[] args) {
		
		// 정렬 알고리즘
		int[] num = { 3, 2, 1, 5, 4 };
		int temp = 0; // swap을 위한 중간 저장용 변수

		// 중첩 for을 이용하여 정렬하기
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j]; 
					num[j] = temp;
				}
			}
			System.out.print(num[i]);
		}
		
		
		
		
	}
}
