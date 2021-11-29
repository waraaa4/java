package day13_20211021_01;

import java.util.List;
import java.util.Scanner;

public class TarineeService {
	
	/*
	 * 매서드 이름 listView
	 * 리턴없음.
	 * 매개변수: traineeList
	 */
	
	void listview(List<TarineeDTO>traineeList) {
		System.out.println("listView 호출됨");
		for(int i = 0; i<traineeList.size(); i++) {
			System.out.println(traineeList.get(i));
		}
		System.out.println("listView 호출됨");
	}
	/*
	 *  훈련생을 추가하는 메서드 (addTrainee)
	 *  리스트에 훈련생을 추가하는 기능을 수행함.
	 *  Main으로 부터 리스트를 넘겨받아 훈련생을 추가하고
	 *  다시 Main으로 넘겨주는 코드가 작성되어야함.
	 */
	
	// 매개변수: traineeList
	// 리턴타입: List<TarineeDTO>(TarineeDTO 객체를 담는 List)
	List<TarineeDTO> addTrainee(List<TarineeDTO>traineeList) {
		System.out.println("addTrainee 호출됨");
		Scanner scan = new Scanner(System.in);
		
		TarineeDTO t3 = new TarineeDTO();
		System.out.print("이름 입력: ");
		String name = scan.nextLine();
		System.out.print("나이 입력: ");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.print("폰번호 입력: ");
		String phoneNumber = scan.nextLine();
		System.out.print("전공유무 입력: ");
		boolean major = scan.nextBoolean();
		
		TarineeDTO t = new TarineeDTO(name, age, phoneNumber, major);
		traineeList.add(t);
		return traineeList;
	}
	
}
