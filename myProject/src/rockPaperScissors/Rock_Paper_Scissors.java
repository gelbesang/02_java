package rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {

	
	public static void main(String[] args) {
		int num; // random수 받는 변수
		int scanValue = 0; // 입력받은 가위바위보를 숫자로 바꾼 함수
		String scanString; // 입력받은 가위바위보
		Random random = new Random();
		num = random.nextInt(3); // 0 ~ 2까지 랜덤수를 받음
		
		Scanner scan = new Scanner(System.in);
		System.out.println("random!!" + num); // 랜덤수 확인
		
		System.out.println("가위바위보  게임!!!");
		System.out.println("입력 : \n");
		
		scanString = scan.nextLine(); // 가위바위보를 입력다음
		
		switch(scanValue) { // 입력받은 가위바위보를 랜덤수와 비교하여 가위바위보의 결과를 알려줌
		case 0:
			if(num == 0) {
				System.out.println("비겼습니다.");
			}else if (num == 1) {
				System.out.println("졌습니다.");
			}else if (num ==2) {
				System.out.println("이겼습니다.");
			}
			break;
			
		case 1:
			if (num == 0) {
				System.out.println("이겼습니다.");
			}else if (num == 1) {
				System.out.println("비겼습니다.");
			}else if (num == 2) {
				System.out.println("졌습니다.");
			}
			break;
			
		case 2:
			if (num == 0) {
				System.out.println("졌습니다.");
			}else if(num == 1) {
				System.out.println("이겼습니다.");
			}else if(num == 2) {
				System.out.println("비겼습니다.");
			}
			break;
		}
			
	}
}
