package day02_20211005;

public class Ex01_LogicaOperator {

	public static void main(String[] args) {
		
		// 논리 연산자 (&&, ||)
		
		// and, or 연산 각각 수행해서 결과 확인
		boolean result1 =  true && true;
		System.out.println(result1);
		result1 = true && false;
		System.out.println(result1);
		result1 = false && false;
		System.out.println(result1);
		
		boolean result2 = true || true;
		System.out.println(result2);
		result2 = true || false;
		System.out.println(result2);
		result2 = false || false;
		System.out.println(result2);
		
		// not 연산 (!)
		boolean var1 = false;
		System.out.println(var1); // false
		System.out.println(!var1); // true
		var1 = !var1;
		System.out.println(var1); // true
		System.out.println(7>5); // true
		System.out.println(!(7>5)); // false
		
		// 실습
		// 영어, 수학 점수가 둘다 90점 이상이면 합겹(true)
		int engScore = 95;
		int mathScore = 97;
		boolean result3 = false;
		result3 = engScore >= 90 && mathScore >= 90;
		System.out.println(result3); // true
		
		engScore = 80;
		result3 = engScore >= 90 && mathScore >= 90;
		System.out.println(result3); // false
		
		// 응용
		// 회원가입을 할 때 id= myid, password= 1234 라고 가입하고
		// 나중에 로그인을 한다고 했을 때 id, pw을 모두 맞게 입력하면 로그인 성공(true),
		// 둘 중 하나라도 틀린 값을 입력했다면 로그인 실패(false) 처리를 한다고 했을 때
		String id = "myid";
		String password = "1234";
		boolean loginResult = (id == "myid") && (password == "1234");
		System.out.println(loginResult); // true
		
		id = "ididid";
		loginResult = (id == "myid") && (password == "1234");
		System.out.println(loginResult); // false
		
		
	}

}
