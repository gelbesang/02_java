package account;

public class BankTest {

	public static void main(String[] args) {
		// 아래 실행코드가 정상적으로 돌아가야 함.
		// 실행코드에는 손 댈 필요 없음
		Bank sunMoonBank = new Bank();
	
		sunMoonBank.createAccount("김상진");
		sunMoonBank.createAccount("박준석");
		sunMoonBank.createAccount("김지원");
		sunMoonBank.createAccount("박성협");
		sunMoonBank.createAccount("송지환");
		sunMoonBank.createAccount("유가연");
		sunMoonBank.createAccount("민태영");
		sunMoonBank.createAccount("신창원");
		sunMoonBank.createAccount("송종호");
		sunMoonBank.createAccount("조기현");
		sunMoonBank.createAccount("박상용");
		sunMoonBank.createAccount("오진오");
		sunMoonBank.createAccount("유현동");
		sunMoonBank.createAccount("강유환");
		sunMoonBank.createAccount("김현수");
		sunMoonBank.createAccount("김지후");
		sunMoonBank.createAccount("최현정");
		sunMoonBank.createAccount("조혜진");
		
		sunMoonBank.deposit(5, 10000);
		sunMoonBank.deposit(9, 80000);
		sunMoonBank.deposit(15, 3000);
		sunMoonBank.deposit(30, 30000000);
		
		sunMoonBank.widthraw(1, 1000000);
		sunMoonBank.widthraw(5, 8000);
		sunMoonBank.widthraw(30, 20000000);
		
		sunMoonBank.printAccount(10);
		sunMoonBank.printAccount(15);
		sunMoonBank.printAllAccounts();
		// ---------------------------------------------------------
		// 다음의 결과나 나와야 함
		/*
		 *  계좌정보 [계좌번호: 5, 잔액: 10000.0(원), 소유자:송지환]
			계좌정보 [계좌번호: 9, 잔액: 80000.0(원), 소유자:송종호]
			계좌정보 [계좌번호: 15, 잔액: 3000.0(원), 소유자:김현수]
			존재하지 않는 계좌번호입니다.
			잔액이 부족합니다.
			존재하지 않는 계좌번호입니다.
			계좌정보 [계좌번호: 10, 잔액: 0.0(원), 소유자:조기현]
			계좌정보 [계좌번호: 15, 잔액: 3000.0(원), 소유자:김현수]
			계좌정보 [계좌번호: 1, 잔액: 0.0(원), 소유자:김상진]
			계좌정보 [계좌번호: 2, 잔액: 0.0(원), 소유자:박준석]
			계좌정보 [계좌번호: 3, 잔액: 0.0(원), 소유자:김지원]
			계좌정보 [계좌번호: 4, 잔액: 0.0(원), 소유자:박성협]
			계좌정보 [계좌번호: 5, 잔액: 2000.0(원), 소유자:송지환]
			계좌정보 [계좌번호: 6, 잔액: 0.0(원), 소유자:유가연]
			계좌정보 [계좌번호: 7, 잔액: 0.0(원), 소유자:민태영]
			계좌정보 [계좌번호: 8, 잔액: 0.0(원), 소유자:신창원]
			계좌정보 [계좌번호: 9, 잔액: 80000.0(원), 소유자:송종호]
			계좌정보 [계좌번호: 10, 잔액: 0.0(원), 소유자:조기현]
			계좌정보 [계좌번호: 11, 잔액: 0.0(원), 소유자:박상용]
			계좌정보 [계좌번호: 12, 잔액: 0.0(원), 소유자:오진오]
			계좌정보 [계좌번호: 13, 잔액: 0.0(원), 소유자:유현동]
			계좌정보 [계좌번호: 14, 잔액: 0.0(원), 소유자:강유환]
			계좌정보 [계좌번호: 15, 잔액: 3000.0(원), 소유자:김현수]
			계좌정보 [계좌번호: 16, 잔액: 0.0(원), 소유자:김지후]
			계좌정보 [계좌번호: 17, 잔액: 0.0(원), 소유자:최현정]
			계좌정보 [계좌번호: 18, 잔액: 0.0(원), 소유자:조혜진]
		*/
	}

}
