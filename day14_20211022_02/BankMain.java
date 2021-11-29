package day14_20211022_02;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<BankDTO> bankList = new ArrayList<BankDTO>();
		boolean run = true;
		BankService bs = new BankService();
		
		while (run) {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("1.고객등록 | 2.전체 고객조회 | 3.입금 | 4.출금 | 5.잔액확인 | 6.종료");
			System.out.println("------------------------------------------------------------------------");
			System.out.print("선택> ");
			int select = scan.nextInt();
			
			if(select == 1) {
				// 고객등록 
				bankList = bs.clientJoin(bankList);
			} else if(select == 2) {
				// 전체 고객조회 
				bs.clientListView(bankList);
			} else if(select == 3) {
				// 입금
				bankList = bs.deposit(bankList);
			} else if(select == 4) {
				// 출금
				bankList = bs.withdraw(bankList);
			} else if(select == 5){
				bs.checkBalance(bankList);
			} else if(select == 6){
				// 종료 
				run = false;
			} else {
				System.out.println("다시 선택해주세요.");
			}
			
		}	

	}

}
