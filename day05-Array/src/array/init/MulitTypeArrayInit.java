package array.init;
/**
 * boolean, int, double, String 타입의 원소를 가지는
 * 배열 4가지를 선언하고
 * 
 * 크기 5로 생서한 뒤
 * 
 * 각 배열의 원소가 초기화 된 값을 확인한다.
 * 
 * @author Administrator
 *
 */
public class MulitTypeArrayInit {

	public static void main(String[] args) {
		// 각 배열의 크기르 지정하는 상수
		final int SIZE = 5;
		
		// 1. 선언 2.new 연산자를 사용하여 기본 초기화
		boolean[] flags = new boolean[SIZE];
		int[] ages = new int[SIZE];
		double[] heights = new double[SIZE];	
		String[] names = new String[SIZE];
		
		// 3. 각 배월의 원소 값을 출력
		// foreach 
		
		System.out.println("(1) boolean 배열 출력 ");
		for (boolean flag: flags) {
			System.out.printf("flag = %b%n", flag);
		}
		
		System.out.println("(2) int 배열 출력");
		for (int age: ages) {
			System.out.printf("age=%d%n", age);
		}
		System.out.println("(3) double 배열 출력");
		for (double height: heights) {
			System.out.printf("height = %f%n", height);
		}
		System.out.println("(4) String 배열 출력");
		for(String name : names) {
			System.out.printf("name = %s%n", name);
			
		}
		
	}

}
