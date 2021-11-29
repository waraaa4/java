package day17_20211027_02;

// BoardServiceInterface의 구현클래스로 지정
public class BoardServiceInt1 implements BoardServiceInterface{
	
	// 상속받은 추상메서드를 
	// 인터페이스를 구현한 클래스에서 실행블록을 정의할 수 있음.
	// 상속받은 메서드에 붙이는 어노테이션
	// @Override: 메서드를 재정의에 사용하는 어노테이션
	@Override
	public void boardWrite(String var1, String var2) {
		System.out.println("BoardServiceInt1.boardWrite");
		
	}

}
