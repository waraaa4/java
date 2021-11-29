package day03_20211006;

public class Ex05_SwitchCase {

	public static void main(String[] args) {
		
		// switch case 실습

		int num = 0;
		
		switch(num) {
		case 0:
			System.out.println("num이 0입니다.");
			break;
		case 1:
			System.out.println("num이 1입니다.");
			break;
		case 2:
			System.out.println("num이 2입니다.");
			break;
		default:
			System.out.println("0, 1, 2에 해당하지 않습니다.");
			break;
		}
		
		String var = "";
		var = "가";
		
		switch(var) {
		case "가":
			System.out.println("가 입니다.");
			break;
		case "나":
			System.out.println("나 입니다.");
			break;
		case "다":
			System.out.println("다 입니다.");
			break;
		default:
			System.out.println("가, 나, 다에 해당하지 않습니다.");
			break;
		}
		
		
		
	}

}
