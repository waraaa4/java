package day17_20211027_03;

public class TestMain {

	public static void main(String[] args) {
		
		TestDTO t1 = new TestDTO("aaa", "bbb");
		TestDTO t2 = new TestDTO("aaa", "bbb");
		
		// t1객체의 값과 t2객체의 값이 같은지
		System.out.println(t1.equals(t2));
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());

	}

}
