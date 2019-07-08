package control.ifstmt;

import java.util.Scanner;

/**
 * 두 정수 중 작은 값을 가려내는 클래스
 * 두 정수는 Scanner 로 입력 받는다.
 * 
 * @author Administrator
 *
 */
public class FindMin {

	public static void main(String[] args) {
		// 1. 선언 : 입력받을 변수, 작은 값을 저장 할 변수
		int x;
		int y;
		int min = 0;
		
		Scanner scan; // ctrl+ shift + o : import 
		
		// 2. 초기화 
		scan = new Scanner(System.in);
		
		// 입력을 알리는 안내 메세지
		System.out.println("두 정수를 입력 space bar 로 분리");
		// 스캐너 사용한 정수 입력(초기화)
		x = scan.nextInt();
		y = scan.nextInt();
		
		// 3.  사용 : 입력 된 두 값을 비교 (if)
		if(x < y) {
			min = x;
			System.out.printf("입력 된 두 값 x = %d, y = %d 중 "
					        + "작은 값은 %d%n", x, y, min);
		}
		
		if(y < x) {
			min = y;
			System.out.printf("입력 된 두 값 x = %d, y = %d 중 "
							+ "작은 값은 %d%n", x, y, min);
		}
		
		if(x == y) {
			System.out.printf("입력 된 두 값 x = %d, y= %d 이 동일 합니다.%n", x, y);
		}
	}

}
