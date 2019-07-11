package array.multi;

import java.util.Scanner;

/**
 * 야구 구단의 1 ~ 5선발 선수의 방어율을 입력하고 그 중 가장 방어율이 낮은 최고의 투수를 찾는 클래스
 * 
 * @author Administrator
 *
 */
public class BestPitcher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] era = new double[3][5];
		double min = 10.0;
		

		// 각 팀별로 각 투수의 방어율을 입력받아 배열에 저장한다.
		System.out.println("1선발 2선발 3선발 4선발 5선발 방어율 입력");
		for (int idx = 0; idx < era.length; idx++) {
			System.out.printf((idx + 1) + "번째 팀 1 ~5 선발 투수 방어율 :");
			for (int ball = 0; ball < era[idx].length; ball++) {
				era[idx][ball] = scan.nextDouble();

			}
		}
		for (int[] bas : era) {
			for (int ber : bas) {
				System.out.printf("%d\t", bas);
			}
			System.out.println();
		}
	}
}
