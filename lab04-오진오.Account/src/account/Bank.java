package account;

import java.util.ArrayList;
import java.util.List;

/**
 * 계좌들을 관리하는 은행을 나타내는 클래스 메소드 이름 앞의 + 기호는 public 메소드임을 나타냄
 * -----------------------------------------------------------------------------------
 * 멤버변수
 * 
 * 계좌를 여러개 관리하기 위한 계좌목록을 선언 accounts : List<Account> : 계좌목록
 * ----------------------------------------------------------------------------------
 * 기본생성자
 * 
 * 계좌목록을 타내내는 accounts 변수를 ArrayList 로 초기화 진행
 * ----------------------------------------------------------------------------------
 * 메소드 +createAccount(String owner) : boolean : 신규계좌를 1개 생성하는 메소드 계좌 소유자의 이름을
 * 받아서 신규계좌를 1개 생성한 후 계좌목록에 추가. 계좌목록에 추가 할 때 List 의 add 메소드 실행 결과로 리턴받는 boolean
 * 값을 리턴.
 * 
 * +printAccount(int accNumber) : void : 계좌번호를 입력받아서 해당 계좌의 상태를 출력하는 메소드 입력받은
 * accNumber 에 해당하는 계좌정보를 계좌목록에서 찾아서 출력
 * ----------------------------------------- 해당 번호의 계좌가 없는 경우 "존재하지 않는 계좌번호입니다."
 * 메시지 출력
 * 
 * 
 * +deposit(int accNumber, double amount) : void : 계좌번호와 입금액을 입력받아서 계좌목록에 있는 해당
 * 계좌번호 계좌에 amount 만큼을 입금하는 메소드 입금 후 계좌 상태를 출력
 * ------------------------------------------ 해당 번호의 계좌가 없는 경우 "존재하지 않는
 * 계좌번호입니다." 메시지 출력
 * 
 * +printAllAccounts() : void : 전체 계좌 목록을 출력 accounts 리스트를 foreach 를 사용하여 출력
 * ----------------------------------------------------------------------------------
 * 
 * @author HannaC
 *
 */
public class Bank {
	// 멤버변수
	List<Account> accounts;

	// 기본 생성자
	public Bank() {
		accounts = new ArrayList<>();
	}

	// 메소드
	/**
	 * * +createAccount(String owner) : boolean : 신규계좌를 1개 생성하는 메소드 계좌 소유자의 이름을 받아서
	 * 신규계좌를 1개 생성한 후 계좌목록에 추가. 계좌목록에 추가 할 때 List 의 add 메소드 실행 결과로 리턴받는 boolean 값을
	 * 리턴.
	 * 
	 * @param owner
	 * @return
	 */
	public boolean createAccount(String owner) {
		boolean uo =false;
		Account account = new Account(owner);
		uo = accounts.add(account);
		return uo;
	}

	/**
	 * +printAccount(int accNumber) : void : 계좌번호를 입력받아서 해당 계좌의 상태를 출력하는 메소드 입력받은
	 * accNumber 에 해당하는 계좌정보를 계좌목록에서 찾아서 출력
	 * ----------------------------------------- 해당 번호의 계좌가 없는 경우 "존재하지 않는 계좌번호입니다."
	 * 메시지 출력
	 * 
	 * @param accNumber
	 */
	public void printAccount(int accNumber) {
		int count = 1;
		for (Account idx : accounts) {
			if (idx.getAccNumber() == accNumber) {
				idx.print();
				break;
			}
			count++;

			}
		if(count < accNumber) {
			System.out.println("잔액 부족입니다.");
		}
			
		}
	

	/**
	 * +deposit(int accNumber, double amount) : void : 계좌번호와 입금액을 입력받아서 계좌목록에 있는 해당
	 * 계좌번호 계좌에 amount 만큼을 입금하는 메소드 입금 후 계좌 상태를 출력 해당 번호의 계좌가 없는 경우 "존재하지 않는
	 * 계좌번호입니다." 메시지 출력
	 * 
	 * @param accNumber
	 * @param amount
	 */
	public void deposit(int accNumber, double amount) {
		int coun =1;
		for (Account ind : accounts) {
			if (ind.getAccNumber() == accNumber) {
				ind.deposit(amount);
				break;
			}
			coun++;
			}
		if(coun < accNumber) {
			System.out.println("잔액 부족 입니다.");
		
		}
	}

	/**
	 * +printAllAccounts() : void : 전체 계좌 목록을 출력 accounts 리스트를 foreach 를 사용하여 출력
	 */
	public void printAllAccounts() {
		for (Account pri : accounts) {
			System.out.println(pri);
		}
	}

	/**
	 * 
	 * +printAccount(int accNumber) : void : 계좌번호를 입력받아서 해당 계좌의 상태를 출력하는 메소드 입력받은
	 * accNumber 에 해당하는 계좌정보를 계좌목록에서 찾아서 출력
	 * ----------------------------------------- 해당 번호의 계좌가 없는 경우 "존재하지 않는 계좌번호입니다."
	 * 메시지 출력
	 * 
	 * @param accNumber
	 * @param amount
	 */
	public void widthraw(int accNumber, double amount) {
		int cou =1;
		for (Account raw : accounts) {
			if (raw.getAccNumber() == accNumber) {
				raw.withdraw(amount);
				break;
			}
			cou++;
			}
		if(cou < accNumber) {
			System.out.println("잔액 부족 입니다.");
		}

	}

}
