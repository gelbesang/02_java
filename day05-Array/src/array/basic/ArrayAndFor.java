package array.basic;

/**
 * 10칸짜리 int 배열 numbers 를 선언, 생선(0 초기화) 한 후 
 * 각 원소의 값을 0번 인덱스부터 9번 인덱스 까지 10, 20, 30, 40, .... 100 까지 저장
 * 
 * 배열에 저장 된 원소의 합을 int summary; 변수에 누적하여
 * 출력하시오.
 * 
 * @author Administrator
 */

public class ArrayAndFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers;
		int summery = 0;
		numbers = new int[10];
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		numbers[5] = 60;
		numbers[6] = 70;
		numbers[7] = 80;
		numbers[8] = 90;
		numbers[9] = 100;
	
		
		
		for (int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = (idx + 1) * 10;
			summery += numbers[idx];
		}
		
		System.out.printf("원소의 합 : %d%n", summery);
	}

}
