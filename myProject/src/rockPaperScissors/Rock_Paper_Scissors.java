package rockPaperScissors;

//import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {

	public static void main(String[] args) {
//		int num; // random수 받는 변수
//		int scanValue = 0; // 입력받은 가위바위보를 숫자로 바꾼 함수
//		String scanString; // 입력받은 가위바위보
//		Random random = new Random();
//		num = random.nextInt(3); // 0 ~ 2까지 랜덤수를 받음

//		System.out.println("random!!" + num); // 랜덤수 확인

//		System.out.println("가위바위보  게임!!!");
//		System.out.println("입력 : \n");

//		scanString = scan.nextLine(); // 가위바위보를 입력

		// 1. 가위
		// 2. 바위
		// 3. 보

		Scanner scan = new Scanner(System.in);
		
		// 3번만 게임 하게 하기
		for (int i = 0; i < 3; i++) {
			int player;
			
			while (true) {
				int com = (int)(Math.random() * 3  ) + 1; // 랜덤 표출
				System.out.println("가위바위보를 내세요");
			
				player = scan.nextInt();
				
				if (com == player) {
					System.out.println("비겼습니다"); 
					System.out.printf("com=%d",com); 
					break;
				} else if (com == 1 && player == 3) {
					System.out.println("컴퓨터가 이겼습니다.");
					System.out.printf("com=%d",com);
					break;
				} else if (com == 2 && player == 1) {
					System.out.println("컴퓨터가 이겼습니다.");
					System.out.printf("com=%d",com);
					break;
				} else if (com == 3 && player == 2) {
					System.out.println("컴퓨터가 이겼습니다.");
					System.out.printf("com=%d",com);
					break;
				} else {
					System.out.println("player가 이겼습니다.");
					System.out.printf("com=%d",com);
					break;
				}
			
				
		}

		// while를 true를 계속 돌릴려면 가위바위보를 계속 내야한다.
		// if 는 제반 조건이 다끝날 때

//			if(num == 0) {
//				System.out.println("비겼습니다.");
//			}else if (num == 1) {
//				System.out.println("졌습니다.");
//			}else if (num ==2) {
//				System.out.println("이겼습니다.");
//			}
//		
//			
//		
//			if (num == 0) {
//				System.out.println("이겼습니다.");
//			}else if (num == 1) {
//				System.out.println("비겼습니다.");
//			}else if (num == 2) {
//				System.out.println("졌습니다.");
//			}
//	
//			
//		
//			if (num == 0) {
//				System.out.println("졌습니다.");
//			}else if(num == 1) {
//				System.out.println("이겼습니다.");
//			}else if(num == 2) {
//				System.out.println("비겼습니다.");
//			}

	}
		scan.close();
	}
}
