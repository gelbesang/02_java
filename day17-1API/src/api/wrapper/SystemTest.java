package api.wrapper;

import static java.lang.System.currentTimeMillis;

public class SystemTest {

	public static void main(String[] args) {
		
		// 변수 선언
		long start;
		long end;
		
		start = System.currentTimeMillis(); // 타임 스탬프 (스탬프 속성의 데이터는 모두 long)
		
		System.out.println("현재 시간 :" + start);
		System.out.println("10,000만 번 반복문 시작");
		for (int i = 0; i < 10000; i++);
		System.out.println("10,000만번 반복문 종료");
		
		end = System.currentTimeMillis();
		System.out.println("반복 종료 시간 :" + end);
		System.out.println("반복 소요 시간 :" + (end - start));

	}

}
