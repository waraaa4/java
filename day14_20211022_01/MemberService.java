package day14_20211022_01;

import java.util.*;

public class MemberService {

	// 회원가입 메서드
	/*
	 * 메서드이름: memberJoin 리턴타입: List<MemberDTO> 매개변수: List<MemberDTO>
	 */
	List<MemberDTO> memberJoin(List<MemberDTO> memberList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = scan.nextLine();
		System.out.print("비밀번호 : ");
		String password = scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("이메일 : ");
		String email = scan.nextLine();
		int number = memberList.size() + 1;

		MemberDTO member = new MemberDTO(number, id, password, name, email);

		memberList.add(member);
		return memberList;

	}

	// 회원조회 메서드
	/*
	 * 메서드이름: memberListView 리턴타입: void 매개변수: List<MemberDTO>
	 */
	void memberListView(List<MemberDTO> memberList) {
		for (MemberDTO m : memberList) {
			System.out.println(m);
		}
	}

	// 로그인 메서드
	/*
	 * 메서드이름: memberLogin 리턴타입: void 매개변수: List<MemberDTO>
	 */
	void memberLogin(List<MemberDTO> memberList) {
		Scanner scan = new Scanner(System.in);
//		System.out.print("아이디 : ");
//		String id = scan.nextLine();
//		System.out.print("비밀번호 : ");
//		String password = scan.nextLine();

//		for (int i = 0; i < memberList.size(); i++) {
//			if (id.equals(memberList.get(i).getId()) && password.equals(memberList.get(i).getPassword())) {
//				System.out.println(id + "님 환영합니다.");
//			} else {
//				System.out.println("아이디 또는 비밀번호가 틀립니다.");
//			}
//		}
		int result = loginCheck(memberList);
		// result 가 -1이면 로그인 실패, 0이상의 값을 가지고 있으면 로그인성공으로 판단 
		// 로그인성공이라면 로그인한 회원의 인덱스번호를 가지고 있는 것 
		if (result >= 0) {
			System.out.println("로그인 성공");
			System.out.println(memberList.get(result).getId() + "님 환영합니다.");
		} else {
			System.out.println("로그인 실패");
		}

	}

	// 회원정보 변경 메서드
	/*
	 * 메서드이름: memberUpdate 리턴타입: List<MemberDTO> 매개변수: List<MemberDTO>
	 */
	List<MemberDTO> memberUpdate(List<MemberDTO> memberList) {
//		System.out.print("아이디 : ");
//		String id = scan.nextLine();
//		System.out.print("비밀번호 : ");
//		String password = scan.nextLine();
//
//		for (int i = 0; i < memberList.size(); i++) {
//			if (id.equals(memberList.get(i).getId()) && password.equals(memberList.get(i).getPassword())) {
//				System.out.print("변경할 이메일 : ");
//				String email = scan.nextLine();
//				memberList.get(i).setEmail(email);
//			} else {
//				System.out.println("아이디 또는 비밀번호가 틀립니다.");
//			}
//		}
		Scanner scan = new Scanner(System.in);
		int result = loginCheck(memberList);
		if (result >= 0) {
			System.out.println("로그인 성공");
			System.out.println(memberList.get(result).getId() + "님 환영합니다.");
			System.out.print("변경할 이메일 : ");
			String email = scan.nextLine();
			memberList.get(result).setEmail(email);
		} else {
			System.out.println("로그인 실패");
		}
		return memberList;
	}

	// 아이디, 비밀번호 확인을 위한 메서드
	// memberLogin, memberUpdate에서 호출해서 활용
	// 아이디, 비밀번호 일치하는 회원의 인덱스번호를 리턴하고 
	// 아이디, 비밀번호가 일치하지 않으면 -1를 리턴함. 
	int loginCheck(List<MemberDTO> memberList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = scan.nextLine();
		System.out.print("비밀번호 : ");
		String password = scan.nextLine();
		// 로그인한 회원의 인덱스 번호를 가져가기 위한 변수 (회원번호 아님)
		int indexNumber = -1;
		for (int i = 0; i < memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId()) && password.equals(memberList.get(i).getPassword())) {
				indexNumber = i;
			}
		}
		return indexNumber;
	}

}
