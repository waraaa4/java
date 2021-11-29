package day14_20211022_02;

import java.util.*;

public class BankService {
	
	// 고객등록
	/*
	 *  메서드이름: clientJoin 
	 *  리턴타입: List<BankDTO>
	 *  매개변수: List<BankDTO>
	 */
	List<BankDTO> clientJoin(List<BankDTO> bankList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 등록: ");
		String name = scan.nextLine();
		System.out.print("계좌 등록: ");
		String accountNumber = scan.nextLine();
		
		int clientNumber = bankList.size() + 1;
		int balance = 0;
		BankDTO mumber = new BankDTO(clientNumber, name, accountNumber, balance);
		bankList.add(mumber);
		return bankList;
	}
	
	// 전체 고객조회
	/*
	 *  메서드이름: clientListView
	 *  리턴타입: void
	 *  매개변수: List<BankDTO>
	 */
	void clientListView(List<BankDTO> bankList) {
		for(int i = 0; i <bankList.size(); i++) {
			System.out.println(bankList.get(i)); 
		}
	}
	
	// 입금
	/*
	 * 메서드이름: deposit
	 * 리턴타입: List<BankDTO>
	 * 매개변수: List<BankDTO>
	 */
	List<BankDTO> deposit(List<BankDTO> bankList) {
		Scanner scan = new Scanner(System.in);
		int result = loginCheck(bankList);
		if(result >= 0) {
			System.out.println("로그인 성공");
			System.out.print("입금할 금액: ");
			int money = scan.nextInt();
			int sum = bankList.get(result).getBalance() +  money;
			bankList.get(result).setBalance(sum);
		} else {
			System.out.println("로그인 실패");
		}
		return bankList;
	}
	
	// 출금
	/*
	 * 메서드이름: withdraw
	 * 리턴타입: List<BankDTO>
	 * 매개변수: List<BankDTO>
	 */
	List<BankDTO> withdraw(List<BankDTO> bankList) {
		Scanner scan = new Scanner(System.in);
		int result = loginCheck(bankList);
		if(result >= 0) {
			System.out.println("로그인 성공");
			System.out.print("출금할 금액: ");
			int money = scan.nextInt();
			if(money <= bankList.get(result).getBalance()) {
				int sum = bankList.get(result).getBalance() -  money;
				bankList.get(result).setBalance(sum);
			} else {
				System.out.println("잔액이 모자랍니다." + bankList.get(result).getBalance() + "원 있습니다.");
			}
		} else {
			System.out.println("로그인 실패");
		}
		return bankList;
	}
	
	// 잔액확인
	/*
	* 메서드이름: checkBalance
	* 리턴타입: void
	* 매개변수: List<BankDTO>
	*/
	void checkBalance(List<BankDTO> bankList) {
		Scanner scan = new Scanner(System.in);
		int result = loginCheck(bankList);
		if(result >= 0) {
			System.out.println("로그인 성공");
			System.out.println(bankList.get(result).getBalance() + "원 있습니다.");
		} else {
			System.out.println("로그인 실패");
		}
	}
	
	
	// 로그인 공통 메서드
	/*
	* 메서드이름: loginCheck
	* 리턴타입: int
	* 매개변수: List<BankDTO>
	*/
	int loginCheck (List<BankDTO> bankList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scan.nextLine();
		System.out.print("계좌: ");
		String accountNumber = scan.nextLine();
		int indexNumber = -1;
		for(int i = 0; i<bankList.size(); i++) {
			if(name.equals(bankList.get(i).getName()) && accountNumber.equals(bankList.get(i).getAccountNumber())) {
				indexNumber = i;
			}
		}
		return indexNumber;
	}

	
	
	
}
