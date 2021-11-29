package day15_20211025_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import day14_20211022_01.MemberDTO;

public class MemberMain {

	public static void main(String[] args) {
		// 백문이불여일타
		// memberList는 MemberMain에서 관리주체 
		Scanner scan = new Scanner(System.in);
		Map<Integer, MemberDTO> memberMap = new HashMap<Integer, MemberDTO>(); 
		boolean run = true;
		MemberService ms = new MemberService();
		
		while (run) {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("1.회원가입 | 2.전체회원조회 | 3.로그인 | 4.이메일변경 | 5.종료");
			System.out.println("------------------------------------------------------------------------");
			System.out.print("선택> ");
			int select = scan.nextInt();
			
			if(select == 1) {
				// 회원가입 
				memberMap = ms.memberJoin(memberMap);
			} else if(select == 2) {
				// 전체회원조회 
				ms.memberListView(memberMap);
			} else if(select == 3) {
				// 로그인
				ms.memberLogin(memberMap);
			} else if(select == 4) {
				// 회원정보 변경
				memberMap = ms.memberUpdate(memberMap);
			} else if(select == 5){
				// 종료 
				run = false;
			} else {
				System.out.println("다시 선택해주세요.");
			}
			
		}
	}
}
