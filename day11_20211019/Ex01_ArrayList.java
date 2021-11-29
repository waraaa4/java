package day11_20211019;

import java.util.ArrayList; // ArrayList 클래스
import java.util.List; // List 인터페이스

public class Ex01_ArrayList {

	public static void main(String[] args) {
		
		// arrayList 선언
		// List객체이름: list1
		// List에 담을 수 있는 데이터 타입: String
		// <>
		List<String> list1 = new ArrayList<String>();
		list1.add("첫번째데이터");
		list1.add("두번째데이터");
		list1.add(1, "어디에 들어갈까요");
		list1.add(1, "이건 어디에?");
		
		// ArrayList에 담긴 데이터 출력
		// get() 메서드: 리턴있음.(String) 매개변수있음.(int)
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		
		// ArrayList 크기 확인
		// ArrayList 클래스가 가지고 있는 size() 메서드 호출
		// size() : 리턴있음. 매개변수 없음.
		System.out.println(list1.size());
		
		// ArrayList 데이터 삭제
		System.out.println("삭제전 1번인덱스 데이터: " + list1.get(1));
		list1.remove(1);
		System.out.println("삭제후 1번인덱스 데이터" + list1.get(1));
		System.out.println("삭제후 list의 사이즈" + list1.size());
		
		// for문을 이용하여 list1에 담긴 모든 데이터 출력
		for(int i = 0; i<3; i++) {
			System.out.println(list1.get(i)); 
		}
		
		/*
		 * List객체이름: list2
		 * List에 담을 수 있는 데이터 타입: 정수 데이터
		 * long(Long), double(Double), boolean(Boolean)
		 * Wrapper 클래스
		 */
		List<Integer> list2 = new ArrayList<Integer>();

	}

}
