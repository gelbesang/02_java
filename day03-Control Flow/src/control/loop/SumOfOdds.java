//package control.loop;
///**
// * while 문을 이용하여 1~100 사이의 홀수의 합을 구하시오.
// * @author Administrator
// *
// */
//public class SumOfOdds {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int num = 1, sum = 0;
//		
//		while(num <= 100) {
//			sum += num;
//			num += 2;
//		}
//		System.out.printf("1부터 100사이의 홀수의 합은 %d 입니다. %n", sum);
//	}
//
//}

package control.loop;
/**
 * while 문을 이용하여 1~100 사이의 홀수의 합을 구하시오.
 * @author Administrator
 *
 */
public class SumOfOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int sum = 0;
		
		while(num <= 100) {
			if(num % 2 == 1) {
				sum += num;
			}
			num++;
		}
		System.out.printf("1부터 100사이의 홀수의 합은 %d 입니다. %n", sum);
	}
}
