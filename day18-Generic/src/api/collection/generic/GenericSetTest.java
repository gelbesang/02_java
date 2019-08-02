package api.collection.generic;

import java.util.HashSet;
import java.util.Set;

/**
 * 컬렉션에 저장 할 수 있는 타입에 제한을 주는 
 * Generic이 적용 된 Set을 테스트 
 * 
 * @author Administrator
 *
 */
public class GenericSetTest {

	public static void main(String[] args) {
		// 1. 선언 Integer 만 저장하는 Set 
		Set<Integer> set; // 저장하려는 진짜 타입의 이름을 <>안에 써줍니다.
		
		// Book 만 저장하는 set
		Set<Book> books;
		
		// 2. 초기화 : HashSet 으로 초기화 : 
		//             Integer만 저장하는 HashSet으로 초기화 
		
		set = new HashSet<Integer>(); 
		//set = new HashSet<>(); 생략도 가능 java 1.5버전부터 
		// Generic(<Integer>)을 위에 선언에서 뒤에 줫기때문에 초기화 할때도 뒤에 줘야 일관성이 있다.
		
		books = new HashSet<Book>(); // 이게 기본 표기법 
		
		// 3. 엘리먼트 추가
		
		// auto - boxing
		set.add(1);
		set.add(20);
		set.add(new Integer(300));
//		set.add("사백"); 
		// String을 추가 시도시 컴파일 오류 발생
		
		// Book 객체들 생성
		Book vegetarian = 
				new Book(1, "9788936433598", "채식주의자"
						  , "한강", "창비", 247, 10800, 10);
		
		Book littlePrince = 
				new Book(2, "9791159039690", "어린왕자(초판본)"
						  , "생텍쥐페리", "더스토리", 150, 8820, 5);
		
		Book noDaap = 
				new Book(3, "9791190182645", "제 인생에 답이 없어요"
						  , "선바", "위즈덤하우스", 192, 10800, 3);
		
		Book dduk = 
				new Book(4, "9791196394509", "죽고 싶지만 떡볶이는 먹고 싶어"
						  , "백세희", "흔", 208, 12420, 2); 
		
		Book ax = 
				new Book(5, "9788956055466", "책은 도끼다"
						  , "박웅현", "북하우스", 348, 14400, 2);
		
		books.add(vegetarian);
		books.add(littlePrince);
		books.add(noDaap);
		books.add(dduk);
		books.add(ax);
//		books.add("책 입니다.");
		
		
		// 3. 사용
		// Integer Set 에서 데이터 추출 : foreach 
		for (int number : set) {
			// set에서 추출 된 값에 * 100 을 출력
			System.out.println(number * 100);
			
		}
		
		// Book Set 에서 데이터 추출
		for (Book book : books) {
			// book 의 가격을 10% 다운
			int price = book.getPrice();
			book.setPrice((int)(price * 0.9));
			System.out.println(book);
		}
		
		

	}

}
