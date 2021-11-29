package day17_20211027_03;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			List<String> list1 = new ArrayList<String>();
			list1.add("aa");
			list1.add("bb");
			
			for(int i=0; i<=list1.size(); i++) {
				System.out.println(list1.get(i));
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 초과 exception 발생");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("exception 발생");
			e.printStackTrace();
		} finally {
			System.out.println("여기는 항상 출력됩니다.");
		}
		System.out.println("리스트 출력 후");

	}

}
