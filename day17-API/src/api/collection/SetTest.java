package api.collection;

import java.util.HashSet;
import java.util.Set;


/**
 * 객체를 요소(Element)로 저장하는
 * 컬렉션(Collection) 중에서
 * 
 * 1. 중복 허용하지 않음
 * 2. 순서 상관 없음
 * 
 * 으로 저장하는 Set 타입을 테스트
 * 
 * @author taim
 *
 */
public class SetTest {

	public static void main(String[] args) {
		// 1. Set 선언
		Set set; // java.util 패키지에 있으므로 import 필요
		
		// 2. Set 초기화
		//    Set 은 인터페이스타입 이므로
		//    직접 new Set(); 은 불가능
		//    대신 구현 클래스인 HashSet()의 생성자로 
		//    인스턴스를 생성한다.
		set = new HashSet();
		
		// 3. 사용
		// (1) set 에 요소(element)추가
		//     Set 은 모든 Object 를 다 저장할 수 있다.
		//     add(Object) 메소드 : Collection 인터페이스에서 
		//                          물려받은 추상 메소드가
		//                          HashSet 클래스에서 구현된 것 사용
		// 문자열 타입 저장
		System.out.println(set.add("1st Item"));
		// 동일 데이터 저장 시도
		System.out.println(set.add("1st Item"));
		// auto-boxing 
		System.out.println(set.add(2));
		// double 타입의 포장객체
		System.out.println(set.add(new Double("3.0")));
		// boolean 타입의 포장객체
		System.out.println(set.add(new Boolean(true)));
		System.out.println(set.add(false));
		
		Book vegetarian = 
				new Book(1, "9788936433598", "채식주의자"
						  , "한강", "창비", 247, 10800, 10);
		
		Book book = new Book(1);
		
		// 사용자 정의 타입인 Book 타입도 set 에 저장 가능
		System.out.println(set.add(vegetarian));
		// vegitatrian과 seq 가 같은 새 객체 book 을 넣도록 추가		
		System.out.println(set.add(book));
		// 실행결과 false 인 이유 : 
		//   Book 타입은 seq 만 같으면 같은 객체로 판단하도록
		//   equals(), hashCode() 를 재정의 했으므로
		//   vegitarian 과 같은 seq 1을 갖는 book 이 추가되지 않음.
		
		// (2) set 의 내용 출력
		System.out.println("=== set 의 내용 출력 ===");
		// Set 클래스는 toString() 재정의 해두었음.
		System.out.println(set);
		
		System.out.println("=== foreach 로 출력 ===");
		// foreach 에서 : 뒤쪽은 자료구조가 올 수 있다.
		// 자료구조 : 배열, 셋, 리스트, 맵
		for (Object obj: set) {
			System.out.println(obj);
		}
	}

}