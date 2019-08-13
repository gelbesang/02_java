package rockPaperScissors;

//import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {

	public static void main(String[] args) {
		// 1. 가위
		// 2. 바위
		// 3. 보

		Scanner scan = new Scanner(System.in);
		System.out.println("동전을 넣어주세요(숫자 입력)");
		
		int coin = scan.nextInt();
		
		
		// 3번만 게임 하게 하기
		for (int i = 0; i < coin; i++) {
			
			int player;
			int count = 0;

			while (true) {
				int com = (int) (Math.random() * 3) + 1; // 랜덤 표출
				System.out.println("가위바위보를 내세요");

				player = scan.nextInt();

				if (com == player) {
					System.out.println("비겼습니다\n");
					System.out.printf("com=%d\n", com);

					System.out.printf("승리횟수%d :\n", count);
					break;
				} else if (com == 1 && player == 3) {
					System.out.println("컴퓨터가 이겼습니다.\n");
					System.out.printf("com=%d\n", com);
					count--;
					System.out.printf("승리횟수%d :\n", count);
					break;
				} else if (com == 2 && player == 1) {
					System.out.println("컴퓨터가 이겼습니다.\n");
					System.out.printf("com=%d\n", com);
					count--;
					System.out.printf("승리횟수%d :\n", count);
					break;
				} else if (com == 3 && player == 2) {
					System.out.println("컴퓨터가 이겼습니다.\n");
					System.out.printf("com=%d\n", com);
					count--;
					System.out.printf("승리횟수%d :\n", count);
					break;
				} else {
					System.out.println("player가 이겼습니다.\n");
					System.out.printf("com=%d\n", com);
					count++;
					System.out.printf("승리횟수%d :\n", count);
					break;
				}

			}
		}
	}
}