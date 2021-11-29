package day12_20211020_01;

import java.util.*;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;

public class Ex01_ArrayListEx {

	public static void main(String[] args) {
		
		/*
		 * ArrayList에 영어로 된 단어 5개를 스캐너로 입력 받고
		 * 입력받은 단어를 모두 출력하시오.
		 * 그리고 입력받은 단어 중 가장 긴 단어를 출력하시오.
		 */
		
		String var1 = "phone";
		System.out.println(var1.length()); // String 데이터 길이를 출력
		
		Scanner scan = new Scanner(System.in);
		
		List<String> list = new ArrayList<String>();
		List<String> list1 = new ArrayList<>();		// 둘다 가능한 방법
		
		String eng = "";
		int longEng  = 0;
		
		// 입력
		for(int i = 0; i < 5; i++) {
			System.out.print("영어 단어 입력 " + (i+1) + ": ");
			eng = scan.nextLine();
			list1.add(eng);
		}
		
		// 출력
		for(int i = 0; i < list1.size(); i++) {
			System.out.println("영어 단어 " + (i+1) + ": " + list1.get(i));
		}
		
		// 긴 단언 찾기
		// 0번 인덱스에 저장된 데이터의 길이값 출력
		System.out.println(list1.get(0).length());
		
		for(int i = 0; i < list1.size(); i++) {
			if(list1.get(longEng).length() < list1.get(i).length()) {
				longEng = i;
			}
		}
		System.out.println("가장 긴 영어 단어: " + list1.get(longEng));

	}

}
