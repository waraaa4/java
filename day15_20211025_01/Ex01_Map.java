package day15_20211025_01;

import java.util.HashMap;
import java.util.Map;

public class Ex01_Map {

	public static void main(String[] args) {
		// 맵 선언
		// key: int, value: String
		Map<Integer, String> map1 = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		
		// 맵에 데이터 저장
		// put 메서드사용. 매개변수는 key, value 순으로
		map1.put(1, "데이터1");
		map1.put(2, "데이터2");
		map1.put(11, "데이터3");
		
		// 맵에 담긴 데이터 출력
		System.out.println(map1.get(1));
		System.out.println(map1.get(11));
		
		// 데이터는 덮어쓰기
		map1.put(11, "데이터33333");
		System.out.println(map1.get(11));
		
		// 반복문에 활용
		for(Integer n: map1.keySet()) {
			String s = map1.get(n);
			System.out.print("키값: " + n);
			System.out.println("벨류값: " + s);
			
			System.out.println(map1.get(n));
		}
		
		// String 도 키값을 넣을수 있다.
		Map<String, Integer> map3 = new HashMap<String, Integer>();
		map3.put("키1", 1234);
		map3.put("키키키1", 555555);
		map3.put("aaaa", 1231532123);
		
		System.out.println(map3.get("키키키1"));
		
		for(String v: map3.keySet()) {
			System.out.print("키값: " + v);
			System.out.println("\t 벨류값: " + map3.get(v));
		}
		
		// 맵 데이터 삭제
		map3.remove("aaaa");
		
		// TestDTO 담는 map 선언
		Map<Integer, TestDTO> testMap = new HashMap<Integer, TestDTO>();
		
		// TestDTO 객체 3개 만들기
		TestDTO test1 = new TestDTO(1, "aaa", "aaa");
		TestDTO test2 = new TestDTO(2, "bbb", "bbb");
		TestDTO test3 = new TestDTO(3, "ccc", "ccc");
		
		testMap.put(1, test1);
		testMap.put(2, test2);
		testMap.put(3, test3);
		
		System.out.println(testMap.get(2));// test2 객체
		
		for(Integer i: testMap.keySet()) {
			System.out.println(testMap.get(i));
		}
		
		// 맵 크기 확인
		System.out.println(testMap.size());
		
	}
	
}
