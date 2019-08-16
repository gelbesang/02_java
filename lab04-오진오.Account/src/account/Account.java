package account;

/**
 * 은행계좌를 나타내는 클래스
 * ----------------------------------------------------------------------------
 * 클래스변수(static 변수)
 * serial : int : 계좌번호에 사용될 일련번호 0으로 초기화
 * ----------------------------------------------------------------------------
 * 멤버변수(인스턴스 변수) 
 * accNumber : int : 계좌번호
 * balance : double : 계좌잔액
 * owner : String : 계좌 소유자 이름
 * ----------------------------------------------------------------------------
 * 기본생성자 : private 으로 설정
 * 
 * 기본생성자 안에서 계좌번호는 serial 을 1씩 자동으로 증가시킨 값으로 설정하고
 * 잔액은 0인 상태의 계좌가 만들어지도록 초기화 코드 작성
 * ----------------------------------------------------------------------------
 * 매개변수 받는 생성자 : public 으로 설정
 * 
 * 매개변수로 계좌 소유자 이름만 받는 생성자를 중복정의
 * 계좌번호와, 잔액은 기본생성자의 기능을 사용하여 초기화하고
 * 소유자 이름은 입력받은 매개변수를 통해서 직접 초기화하는 코드 작성
 * -----------------------------------------------------------------------------
 * 추가 메소드
 * +deposit(double amount) : void : 입력된 amount 만큼 계좌 잔액을 증가시켜 balance 에 반영
 * 
 * +withdraw(double amount) : boolean : 입력된 amount 만큼 계좌 잔액을 차감시켜 balance 에 반영
 *                          만약 amount 가 balance 보다 크면 잔액을 변경시키지 않고 false 를 리턴
 *                          amount 가 balance 보다 작으면 잔액을 차감하여 balance 에 반영하고 true 를 리턴  
 * 
 * +print() : void : 계좌 상태를 출력 
 * ----------------------------------------------------------------------------
 * accNumber 필드에 대한 접근자 메소드 1개만 정의
 * ----------------------------------------------------------------------------
 * equals() & hashCode() 는 accNumber 기준으로 재정의
 * -----------------------------------------------------------------------------
 * toString() 재정의 : "계좌정보 [계좌번호: O, 잔액: XXX (원), 소유자:OOO]" 의 형태로 스트링 리턴할 것
 * -----------------------------------------------------------------------------
 * @author HannaC
 *
 */
public class Account {
	// 클래스 변수 
	static int serial =0;
	
	// 멤버 변수
	int accNumber; 
	double balance;
	String owner;
	
	// 기본 생성자
	private Account() {
		this.accNumber = serial++;
		this.balance=0.0;
	}
	
	// 매개 변수
	public Account(String newOwner) {
		this();
		owner = newOwner;
		
	}
	
	// 메소드 
	public void deposit(double amount) {
		balance += amount;
	}
	
	public boolean withdraw(double amount) {		
		balance -= amount;
		if(amount > balance) {
			return false;
		}else {
			return true;
		}
	}
	public void print() {
		System.out.println("계좌 번호:"+ accNumber + " 계좌잔액 :"+ balance + "소유자 :" + owner);
	}

	// accNumber 기준으로 재정의
	public int getAccNumber() {
		return accNumber;
	}


	// 재정의
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accNumber;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accNumber != other.accNumber)
			return false;
		return true;
	}

	//toString() 재정의
	@Override
	public String toString() {
		return "Account [계좌번호=" + accNumber + ", 잔액=" + balance + ", 소유자=" + owner + "]";
	}
	
	
	
	

	
	
}
