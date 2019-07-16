package account.one;
/**
 * 은행 계좌르 정의하는 클래스
 * --------------------------------------------
 * 계좌의 속성을 나타내기 위하여 두개의 멤버 변수 선언
 * 계좌 번호 : accNumber
 * 계좌 잔액 : balance
 * --------------------------------------------
 * 계좌의 잔액을 증가시키는 입금 메소드 : deposit(int amount)
 * 계좌의 현재 상태 출력하는 메소드 : print()
 * @author Administrator
 *
 */
public class Account {
	// 1. 멤버 변수 (실체 변수) 선언부 
	/** 계좌 번호 */
	int accNumber;
	/** 계좌 잔액 */
	int balance;
	// 2. 생성자 선언부(생략)
	
	
	// 3. 메소드 선언부 
	/**
	 * 입력된 amount 만큼 이 계좌의 잔액을 증가시킨다.
	 * @param amount : int 입급할 금액
	 */
	public void deposit(int amount) { 
//		int value;
//		value += amount;
		balance += amount;
	}
	/**
	 * 이 계좌의 상태을 출력
	 */
	public void print() {
		System.out.printf("계좌 번호 : %d | \t 계좌잔액 : %d%n"
						 , accNumber, balance);
		
	}
	
}
