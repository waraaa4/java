package day13_20211021_02;

import java.util.*;

public class MemberService {
	
	// 회원가입
	List<MemberDTO> memberJoin (List<MemberDTO> memberList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디: ");
		String id = scan.nextLine();
		System.out.print("비번: ");
		String pw = scan.nextLine();
		System.out.print("이름: ");
		String name = scan.nextLine();
		System.out.print("이메일: ");
		String email = scan.nextLine();
		int memNum = memberList.size() +1;
		MemberDTO mm = new MemberDTO(id, pw, name, email, memNum);
		memberList.add(mm);
		return memberList;
	}
	
	// 회원조회
	void memberListView(List<MemberDTO> memberList) {
		// for(int i = 0; i<traineeList.size(); i++) {
		//System.out.println(traineeList.get(i));
		for(int i =0; i<memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
	}
	
	// 로그인 
	void memberLogin(List<MemberDTO> memberList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디: ");
		String id = scan.nextLine();
		System.out.print("비번: ");
		String pw = scan.nextLine();
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getId().equals(id) && memberList.get(i).getPw().equals(pw)) {
				System.out.println(memberList.get(i).getName() + "님 환영합니다.");
				i = memberList.size();
			}else {
				System.out.println("아이디 또는 비밀번호가 틀립니다.");
			}
		}
		
		
	}
	
	// 회원정보 변경
	void memberUpdate(List<MemberDTO> memberList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디: ");
		String id = scan.nextLine();
		System.out.print("비번: ");
		String pw = scan.nextLine();
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getId().equals(id) && memberList.get(i).getPw().equals(pw)) {
				System.out.print("변경할 이메일을 입력해주세요: ");
				String email = scan.nextLine();
				memberList.get(i).setEmail(email);
				System.out.println(memberList.get(i).getEmail() + " 로 변경되었습니다.");
				i = memberList.size();
			} else {
				System.out.println("아이디 또는 비밀번호가 틀립니다.");
			}
		}
	}
	
}
