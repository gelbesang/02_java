package type.casting;
/**
 * 숫자형 데이터 사이에 
 * 형 변환 (Type Casting)을 
 * 테스트 하는 클래스이다.
 * @author Administrator
 *
 */
public class TypeCastingTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		double pi = 3.1415926535797;
		int number = 100;
		int result;
		
		// 3. 형 변환 : (타입 이름) 피 연산 값;
		result = number + (int)pi;
	
		// 4. 사용 : 값 출력
		System.out.println("double pi =" + pi);
		System.out.println("int number =" + number);
		System.out.println("int reseult =" + result);
		System.out.println("==============================");
		
		// 5. byte 타입으로 result를 변환 저장
		byte buffer = (byte) result;
		System.out.println("int number =" + number);
		System.out.println("byte buffer =" + buffer);
	}

}
