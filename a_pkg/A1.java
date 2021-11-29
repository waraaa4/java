package a_pkg;

// 서로 다른 패키지에 소속되어 있기 때문에
// A1 클래스에 B1 클래스를 사용하려면 import 해줘야함.
import b_pkg.B1;

// 소속: a_pkg
// 접근제한자: public
public class A1 {
	public static void main(String[] args) {
		
	B1 b1 = new B1();
	b1.b = "aaa";
	// not visiable: 보이지 않는다(접근이 불가능하다)
	// a는 default 접근제한이기 때문에 다른 패키지에서 접근 불가
//	b1.a = "bbb";
//	b1.c = "ccc";
	
	// 다른 패키지에 소속된 A1 클래스가
	// default로 B3을 사용 할수 있는지
	// default는 같은 패키지에서만 접근 가능
//	b3 b3 = new B3();
	
	
	}
}
