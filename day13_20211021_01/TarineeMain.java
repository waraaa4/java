package day13_20211021_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TarineeMain {

	public static void main(String[] args) {
		List<TarineeDTO> traineeList = new ArrayList<TarineeDTO>();
		Scanner scan = new Scanner(System.in);

		TarineeDTO t1 = new TarineeDTO();
		t1.setName("이름1");
		t1.setAge(21);
		t1.setPhoneNumber("010-000-1111");
		t1.setMajor(true);

		TarineeDTO t2 = new TarineeDTO("이름2", 22, "010-000-2222", true);

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

		t3.setName(name);
		t3.setAge(age);
		t3.setPhoneNumber(phoneNumber);
		t3.setMajor(major);
		
		TarineeDTO t4 = new TarineeDTO(name, age, phoneNumber, major);
		
		traineeList.add(t1);
		traineeList.add(t2);
		traineeList.add(t3);
		traineeList.add(t4);
		
		for (int i = 0; i < traineeList.size(); i++) {
			System.out.println(traineeList.get(i));
		}
		for (TarineeDTO t : traineeList) {
			System.out.println(t.toString());
		}
		
		//TarineeList TarineeService 클래스로 넘겨서 출력
		/*
		 * 매개변수로 전달하는 값: TarineeList
		 */
		// listView 메서드를 호출하면서 traineeList를 전달하는 코드 작성
		TarineeService ts = new TarineeService();
		// 객체를 만들어야 해당 클래스가 가지고 있는
		// 자원(필드, 매서드 등등등)을 활용할 수 있음.
		
		System.out.println("Main에서 listView 호출전");
		ts.listview(traineeList);
		System.out.println("Main에서 listView 호출후");
		
		// TarineeMain에서 traineeList를 관리
		traineeList = ts.addTrainee(traineeList);
	}

}
