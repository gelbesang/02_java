package account.two;
/**
 * 은행 계좌르 정의하는 클래스
 * --------------------------------------------
 * 계좌의 속성을 나타내기 위하여 두개의 멤버 변수 선언
 * 계좌 번호 : accNumber
 * 계좌 잔액 : balance
 * --------------------------------------------
 * 기본 생성자 : 매개변수가 비어있는 생성자
 * 매개 변수가 있는 생성자 : 매개변수 목록이 있는 생성자
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
	
	// 2. 생성자 선언부
	/**
	 * 기본 생성자 : 클래스 이름과 대소문자 까지 모두 동일하고 
	 * 				 매개 변수 목록이 비어 있는 생성자.[()<-안이 매개변수]
	 */
	Account() {
//		accNumber = 0;
//		balance = 0;
	}
	/**
	 * 계좌 번호 , 계좌 잔액을 매개변수로 받아서
	 * 입력된 값으로 계좌를 실체화 (초기화) 하는 생성자
	 * 
	 * 중복 정의 된 생성자
	 * 
	 * @param newAccNumber
	 * @param newBalance
	 */
	Account(int newAccNumber, int newBalance){
		accNumber = newAccNumber;
		balance = newBalance;
	}
	
	/**
	 * 문자열로 된 계좌번호와
	 * 정수 값의 잔액을 입력받아서
	 * 각각 계좌번호(accNumber)와 잔액(balance) 
	 * 필드를 초기화 하는 중복 정의 된 생성자
	 * 
	 * 중복정의(Overloading)
	 * ----------------------------------------------------------
	 * 메소드의 이름은 같고, 매개변수 목록이 다른 메소드를 
	 * 정의하는 기법
	 * 중복정의는 생성자에도 적용되는 정의 기법
	 * 
	 * 매개변수 목록이 다르다
	 *    (1) 갯수가 다르다.
	 *    (2) 갯수가 같을 때는 매개변수의 타입의 순서가 다르다.
	 * 
	 * @param strAccNumber
	 * @param newBalance
	 */
	Account(String strAccNumber, int newBalance){
		accNumber = Integer.valueOf(strAccNumber);
		balance = newBalance;
	}
	
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
	
	/**
	 * 출금하는 메소드
	 * 
	 * 출금하려는 금액(amount) 만큼 잔액에서 차감하는 메소드
	 * 
	 * 만약 잔액이 amount보다 적으면 출금을 진행하지 않는다.
	 * 
	 * 출금이 실패하면 
	 * "잔액이 부족합니다." 라는 문자열을 리턴하고 
	 * 출금이 성공하면 
	 * "얼마..가 출금 되었습니다. 잔액은 얼마입니다." 라는 문자열을 리턴한다.
	 * 
	 * 
	 * @param amount : int 출금하려는 금액
	 * @return String : 출금 성공 실패 알림 문자열
	 */
	
	public String apint(int amount){
		String result;
		if(balance>= amount) {
			balance -= amount;
			result = amount + "가 출금되었습니다."
					+ "잔액은" + balance + "입니다.";
		}else{
			result = "잔액이 부족합니다.";
		}
		
		return result;
	}	
	
	
	
	
	
	
	
	
	
}
