package control.ifstmt;

import java.util.Scanner;

/**
 * 입력 된 세 정수중 가장 큰 값을 판별하는 클래스 입력 값은 각각 int num1, num2, num3; 변수에 저장 가장 큰 값은 int
 * max; 변수에 저장
 * 
 * 중첩 if ~ else 로 판단
 * 
 * 마지막 출력 : printf 사용
 * 
 * @author Administrator
 *
 */
public class MaxOfThree {

	public static void main(String[] args) {
		// 1. 선언
		int num1;
		int num2;
		int num3;
		int max;

		Scanner scan;

		scan = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요.");

		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		// 3.
		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			} // end else
}
			// 출력
			System.out.printf("입력 된 세 값 %d, %d, %d, 중" + "가장 큰 값 : %d%n", num1, num2, num3, max);

			scan.close();
		
	}

}
