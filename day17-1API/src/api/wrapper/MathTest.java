package api.wrapper;

import static java.lang.Math.*;

public class MathTest {

	public static void main(String[] args) {
		System.out.println(Math.ceil(3.2)); 		//올림
		System.out.println(Math.floor(3.2));		//내림
		System.out.println(Math.round(3.2));		// 반올림
		System.out.println(Math.max(2.3,100.8));	// 둘 중 큰 값
		System.out.println(Math.min(1, 20));		// 둘 중 작은 값
		System.out.println(Math.sin(Math.PI/2));	// 삼각 함수 sin 값
		System.out.println(Math.cos(Math.PI));		// 삼각 함수 cos 값
		System.out.println(Math.tan(0));			// 삼각 함수 tan 값
		System.out.println(Math.abs(-20));			// 절댓 값
		System.out.println(Math.sqrt(4));			// 제곱 근
		System.out.println(Math.random());			// 난수 발생
		System.out.println(Math.random());			// 난수 발생
	}

}
