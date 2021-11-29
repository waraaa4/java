package day17_20211027_03;

public class Exception_ex {

	public static void main(String[] args) {

		/*
		 * 정수간의 a/b 와 같은 나눗셈을 할 때 b에 0이 오면 발생하는 
		 * 예외를 확인하고 예외처리하는 코드를 작성해보세요. 
		 * 예외 발생시 0으로나눌 수 없습니다 출력할 것.
		 */

		try {
			int num1 = 10;
			int num2 = 10;
			int result = num1 / num2;
			System.out.println(result);
			
			String a = null;
			System.out.println(a.equals("bb"));
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NPE 발생");
		} catch (Exception e) {
			System.out.println("Arith, Null, Exception 발생");
		}

	}
}
