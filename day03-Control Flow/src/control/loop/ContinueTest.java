package control.loop;

/**
 * 1~ 100 사이의 홀수의 합을 구하는 클래스
 * for loop, continuew를 활용하여 테스트한다.
 *-------------------------------------------
 *continue : 현재 이하 문장 무시(실행 X)
 *			 다음 반복 실행 
 * @author Administrator
 *
 */
public class ContinueTest {

	public static void main(String[] args) {
//		// 1. 선언, 2. 초기화 
//		int sum = 0;
//		
//		// 3. 사용
//		for(int idx = 1; idx <= 100; idx++) {
//			if(idx % 2 == 0) {
//				continue;
//			}
//			sum += idx;
//		}
//		System.out.printf("1~ 100 사이 홀수의 합 : %d%n", sum);
//		
//		// countinuw == > if ~ else 변경하면
//		for(int idx = 1; idx <= 100; idx++) {
//			if(idx % 2 == 0) {
//				;
//			}else {
//				sum += idx;	
//			}
//		}
//		System.out.printf("1~ 100 사이 홀수의 합 : %d%n", sum);

		
		// 문제 : 1 ~ 100 사이의 3의 배수의 합을 구하시오
		
		int mul = 0;
		
		for (int idx2 = 1; idx2 <= 100; idx2++) {
			if(idx2 % 3 != 1) {
				continue;
			}
			mul += idx2;
			
		}
		System.out.printf("1~100 사이의 3의 배수의 합 : %d%n", mul);
		
		
		
		
		
		
		
	}

}
