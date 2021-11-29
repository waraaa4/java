package day13_20211021_02;

import java.util.*;

public class MemberMain {

	public static void main(String[] args) {
		
		List<MemberDTO> memberList = new ArrayList<MemberDTO>();
		MemberService ms = new MemberService();
		MemberDTO m1 = new MemberDTO();
		boolean run = true;
		int num = 0;
		Scanner scan = new Scanner(System.in);
	
		while(run) {
			System.out.println("1.회원가입 2.회원조회 3.로그인 4.회원정보변경 5.종료");
			System.out.print("번호 선택: ");
			num = scan.nextInt();
			if(num == 1) {
				memberList = ms.memberJoin(memberList);
			} else if(num == 2) {
				ms.memberListView(memberList);
			} else if(num == 3) {
				ms.memberLogin(memberList);
			} else if(num == 4) {
				ms.memberUpdate(memberList);
				System.out.println();
			} else if(num == 5) {
				run = false;
				System.out.println("종료합니다.");
			}
			
		}

	}

}
