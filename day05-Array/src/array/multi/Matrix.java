package array.multi;

/**
 * 수학의 행렬을 나타 낼 수 있는 
 * 2차원 배열을 선언하고 초기화 후
 * 출력해 보는 클래스
 *  
 * @author Administrator
 *
 */
public class Matrix {

	public static void main(String[] args) {
		// 1. 선언, 2.배열 초기화 리스트
		int[][]	matrix = {{0,1,0}, {1, 1, 1}, {0, 0, 0}};
		
		// 2차배열의 길이가 일정할 필요가 없다.
		
//		int[] numbers = {10, 20, 30};
//		int[] matrix[0] = {0, 1, 0};
		
		int[] numbers = {10, 20, 30};
		
		// 3. 출력 (for : index를 사용)
		for (int idx = 0; idx < matrix.length; idx++) {
			for (int ind = 0; ind < matrix[idx].length; ind++) {
				// matrix[0].length
				// matrix[1].length ==> matrix[idx].length 일반화 
				// matrix[2].length
				System.out.printf("%d\t", matrix[idx][ind]);
			}
			System.out.println(); //new line (Enter Key)
		} // end outter for
		System.out.println("===========================");
		
		// 4. 출력 foreach 출력
		for( int[] numbers2 : matrix){
			for (int num : numbers2) {
				System.out.printf("%d\t", num);
			}
			System.out.println();
		}
		
		
		
	
	
	}

}
