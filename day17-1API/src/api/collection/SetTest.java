package api.collection;

import java.util.HashSet;
import java.util.Set;

import book.Book;

/**
 * 객체를 요소(Element)로 저장하는
 * 컬렉션(Collection) 중에서
 * 
 * 1. 중복 허용하지 않음
 * 2. 순서 상관 없음
 * 
 * 으로 저장하는 Set 타입을 테스트 
 * 
 * @author Administrator
 *
 */
public class SetTest {

	public static void main(String[] args) {
		// 1. 선언
		Set set; // java.util 패키지에 있으므로 import 필요
		
		// 2. Set 초기화
		//    Set 은 인터페이스 타입이므로 
		//    직접 new Set();은 불가능
		//	  대신 구현 클래스인 HashSet()의 생성자로
		//    인스턴스를 생성한다.
		set = new HashSet();
		
		// 3. 사용
		// (1) set에 요소(element)추가 
		//     Set은 모든 Object를 다 저장 할 수 있다.
		//	   add(Object) 메소드 : Collection 인터페이스에서 물려받은 추성 메소드가 
		//							HashSect 클래스에서 구현 된 것 사용
		// 문자열 타입저장
		System.out.println(set.add("1st Item"));
		// 동일 데이터 저장 시도
		System.out.println(set.add("1st Item"));
		// auto-boxing
		System.out.println(set.add(2)); // add는 참조형이지만 wrapper이 일어나서 int형인 2가 들어갈 수있음  // auto - boxing
		// double 타입의 포장객체
		System.out.println(set.add(new Double("3.0")));
		// boolean 타입의 포장 객체
		System.out.println(set.add(new Boolean(true)));

		Book vegetarian = 
				new Book(1, "9788936433598", "채식주의자"
						  , "한강", "창비", 247, 10800, 10);
		
		Book book = new Book(1);
		
		
		
		// 사용자 정의 타입인 Book 타입도 set에 저장 가능
		System.out.println(set.add(vegetarian));
		
		// vegitatrian 과 seq 가 같은 새 객체 book을 넣도록 추가
		System.out.println(set.add(book));
		// 실행 결과 false 인 이유 : Book 타입은 seq만 같으면 같은 객체로 판단 하도록 
		// equlas(), hashCode()를 재정의 했으므로 
		// vegitarian 과 같은 seq 1을 같은 book이 추가 되지 않음
		
		// (2) set의 내용 출력
		System.out.println("=== set의 내용 출력 ===");
		// Set 클래스는 toString() 재정의 해 두었음.
		System.out.println(set);
		
		System.out.println("=== foreach로 출력 ===");
		// foreach 에서 : 뒤쪽은 자료 구조가 올 수 있다.
		// 자료 구조 : 배열, 셋, 리스트, 맵
		for(Object obj : set) {
			System.out.println(obj);
		}
	}

}
