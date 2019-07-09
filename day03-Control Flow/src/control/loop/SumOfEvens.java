package control.loop;

/**
 * while 문을 이용하여 1 ~ 100사이의 짝수의 합을 구하는 클래스
 * 
 * @author Administrator
 *
 */
public class SumOfEvens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, sum = 0;
		
		while(num <=100) {
			sum += num;
			num += 2;
			
		}
		System.out.printf("1부터 100사이의 짝수의 합은 %d입니다. %n", sum);
	}
	

}
