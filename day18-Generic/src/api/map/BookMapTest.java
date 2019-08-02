package api.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * key : Integer 
 * value : Book
 * -----------------------------------
 * 데이터 입력
 * key : Book 객체의 seq를 입력
 * value : Book 객체 자체
 * -----------------------------------
 * 데이터 출력
 * foreach 
 * (1) key set 얻기
 * (2) get(key) 로 추출 => 출력
 * foreach
 * (1) key set 얻기
 * (2) 각 Book 객체의 가격 10% 할인가로 출력
 * -----------------------------------
 * 
 * 
 * @author Administrator
 * 
 */
public class BookMapTest {

	public static void main(String[] args) {
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
		
		// 1. 선언 key : Integer value : Book
		Map<Integer, Book> books;
		 
		// 2. 초기화 
		books = new HashMap<>();
		
		// 3. 사용
		books.put(1, vegetarian);
		books.put(2, littlePrince);
		books.put(3, noDaap);
		books.put(4, dduk);
		books.put(5, ax);
		
		Set<Integer> keys = books.keySet();
		
		for (int key : keys) {
			System.out.printf("key= %d : value = %s%n", key,books.get(key));
		}
		System.out.println();
		for (Object key : keys) {
			int price = books.get(key).getPrice();
			books.get(key).setPrice((int)(price*0.9));
			System.out.printf("key= %d : value = %s%n", key,books.get(key));
			 
		}
		
		
	}

}
