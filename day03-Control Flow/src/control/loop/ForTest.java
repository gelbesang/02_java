package control.loop;

/**
 * 1. 50 ~ 0 까지 짝수만 역순으로 출력
 *   (1) continue 없이 
 *   (2) continue 사용
 *  
 * -------------------------------------  
 * 2. 1 ~ 10 까지 제곱표를 출력
 *    1 x 1 =   1
 *    2 x 2 =   4
 *    ...
 *    10x10 = 100
 * -------------------------------------     
 * @author Administrator
 *
 */
public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (1)
		for( int idx = 50; idx > 0; idx--) {
			 if(idx % 2 == 0) {
				 System.out.printf("idx = %2d%n", idx);
			 }
			
		}
		
		
		// (2)
		for( int idx = 50; idx > 0; idx--) {
			if(idx % 2 != 0) {
				 continue;
			 }
			 System.out.printf("idx = %2d%n", idx);

			
		}
		System.out.println("=============================================");
		// 2. 제곱표 출력
		for (int square = 1; square <= 10; square++) {
			System.out.printf("%2d x % 2d = $3d%n", square, square);
		}
		
		// 3. 제곱표 출력( 배열, foreach 사용 )
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int num : numbers) {
			System.out.printf(" %2d x %2d = %3d%n"
							, num, num, num * num);
		}
		
		
	}

}
