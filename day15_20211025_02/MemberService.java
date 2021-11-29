package day15_20211025_02;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import day14_20211022_01.MemberDTO;

public class MemberService {
	
	// 회원가입
	/*
	 * 메서드이름: memberJoin 
	 * 리턴타입: Map<Integer, MemberDTO>
	 * 매개변수: Map<Integer, MemberDTO>
	 */
	public Map<Integer, MemberDTO> memberJoin(Map<Integer, MemberDTO> memberMap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = scan.nextLine();
		System.out.print("비밀번호 : ");
		String password = scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("이메일 : ");
		String email = scan.nextLine();
		int number = memberMap.size() + 1;

		MemberDTO member = new MemberDTO(number, id, password, name, email);

		memberMap.put(number, member);
		return memberMap;
	}
	
	// 회원조회
	/*
	 * 메서드이름: memberListView 
	 * 리턴타입: void
	 * 매개변수: Map<Integer, MemberDTO>
	 */
	public void memberListView(Map<Integer, MemberDTO> memberMap) {
		for (Integer m : memberMap.keySet()) {
			System.out.println(memberMap.get(m));
		}
	}
	
	// 로그인
	/*
	* 메서드이름: memberLogin 
	* 리턴타입: void
	* 매개변수: Map<Integer, MemberDTO>
	*/
	public void memberLogin(Map<Integer, MemberDTO> memberMap) {
		int result = loginCheck(memberMap);
		if (result >= 0) {
			System.out.println("로그인 성공");
			System.out.println(memberMap.get(result).getId() + "님 환영합니다.");
		} else {
			System.out.println("로그인 실패");
		}
	}
	
	// 회원정보 변경 메서드
	/*
	 * 메서드이름: memberUpdate 
	 * 리턴타입: Map<Integer, MemberDTO>
	 * 매개변수: Map<Integer, MemberDTO>
	 */
	Map<Integer, MemberDTO> memberUpdate(Map<Integer, MemberDTO> memberMap) {
		Scanner scan = new Scanner(System.in);
		int result = loginCheck(memberMap);
		if (result >= 0) {
			System.out.println("로그인 성공");
			System.out.println(memberMap.get(result).getId() + "님 환영합니다.");
			System.out.print("변경할 이메일 : ");
			String email = scan.nextLine();
			memberMap.get(result).setEmail(email);
		} else {
			System.out.println("로그인 실패");
		}
		return memberMap;
	}
	
	// 아이디, 비밀번호 확인을 위한 메서드
	/*
	 * 메서드이름: loginCheck 
	 * 리턴타입: int
	 * 매개변수: Map<Integer, MemberDTO>
	 */
	int loginCheck(Map<Integer, MemberDTO> memberMap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = scan.nextLine();
		System.out.print("비밀번호 : ");
		String password = scan.nextLine();
		// 로그인한 회원의 인덱스 번호를 가져가기 위한 변수 (회원번호 아님)
		int indexNumber = -1;
		for(Integer i: memberMap.keySet()) {
			if(id.equals(memberMap.get(i).getId()) && password.equals(memberMap.get(i).getPassword())) {
				indexNumber = i;
			}
		}
		return indexNumber;
	}
		
}
	
	
	
	
	

