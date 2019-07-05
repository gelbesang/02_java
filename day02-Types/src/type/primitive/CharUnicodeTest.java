package type.primitive;

/*
 * char : 문자 1개를 저장하는 타입
 * -------------------------------
 * 문자를 유니코드 표기법으로 저장하고
 * 출력하여 테스트하는 클래스
 * 
 */
public class CharUnicodeTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화 동시에
		char han = '\ud55c'; // 한
		char gul = '\uae00'; // 글

		// \ 백슬레시를 입력하면 유니코드 값으로 인식
		
		System.out.println("han=" + han);
		System.out.println("gul=" + gul);
		System.out.println("han + gul=" + han + gul);
		
		System.out.println("===========================");
		
		System.out.println(han);
		System.out.println(gul);
		System.out.println(han + gul);
		System.out.println(han + "" + gul); // "" string 은 산술 연산이 불가능함. 화살표를 가져서 
	}

}
