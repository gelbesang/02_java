package type.primitive;

/*
 * char : 문자 1개를 저장하는 타입
 * 
 * 내부적으로는 숫자를 저장하는 특징이 있따.
 * 
 */
public class CharTest {

	public static void main(String[] args) {
		// 1. 선언 : 타입이름 변수이름
		char input;
		
		// 2. 초기화 : 변수 이름 = 값;
		input = 'a';
		/*
		 input ='A+'; // 두글자 이상을 저장하려는 시도
		 input = A;   // ''따옴표 안에 문자를 쓰지 않았으므로 오류
		 */
		
		// 3. 사용
		System.out.println("input" + input);
		
		// 4. char가 내부적으로 숫자로 저장 되는 것 확인
		// 정수를 저장하는 변수 code를 선언하면서
		// 문자를 저장하는 변수 input 의 값을 복사
		int code =input;
		System.out.println("code=" + code);	
		// 값이 97이 나오는 이유는 ascii 코드에서 a의 10진수가 97이기 때문
		
		// code는 정수를 저장하는 변수이므로
		// + 1 하는 산술연산을 하여 값을 증가시키고
		code = code + 1;
		System.out.println("code=" + code);
		// + 1 증가된 정수 값을 강제로 문자(char)로 바꾸어 출력
		System.out.println("(char)code=" + code);
	}

}





