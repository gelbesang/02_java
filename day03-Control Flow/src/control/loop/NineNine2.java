package control.loop;

public class NineNine2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 선언, 2. 초기화, 3. 사용
		
		for (int times = 2; times <= 9; times++) {
	         System.out.printf("%n%d 단  %d 단%n", times, times += 1);
	         for(int stage = 1; stage <= 9; stage++) {
	        	
	            System.out.printf("%d x %d = %d, %d x %d = %d%n", times - 1 , stage, (times * stage), times -1 , stage , ((times +1) * stage));
	         }
		
		}
	int cnt = 3;
		
		// 결과 출력
	
		for (int i = 0; i < 2; i++)		// 영역 구분
		{ 	         System.out.printf("%n%d 단  %d 단%n", i, i += 1);

			for (int y = 1; y <= 9; y++)
			{
				for (int x = 2+cnt*i; x <= 5+cnt*i; x++)
				{
					System.out.printf("%d * %d = %d\t", x , y, x*y);
				}
				System.out.println();
			}
			System.out.println();
		}

	
	}
}