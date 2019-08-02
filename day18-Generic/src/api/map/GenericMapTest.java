package api.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 데이터를 Key,Value 쌍으로 저장하는 구조인 
 * Map 인터페이스에서 
 * 
 * Key, Value 양쪽 모두 Generic을 적용하는 
 * 테스트 
 * 
 * @author Administrator
 *
 */
public class GenericMapTest {

	public static void main(String[] args) {
		// 1. 선언 : Key : Integer, Value : String
		Map<Integer, String> map;
		
		// 2. 초기화 : HashMap 중 Key : Integer, Value : String
		map = new HashMap<>();
		
		// 3. 사용 
		map.put(1, "안녕하세요");
		map.put(new Integer(2), "반가워요~");
		map.put(3, "아 .. 오늘 날씨가..."); // '3' 이라는 캐릭터 글자
		map.put(4, "너무나 더워요...!");
		map.put(5, new Book().getTitle());
		map.put(6, new Book(5).getAuthor());
		
		// key : Boolean, value : Book(사용자 정의 타입 가능) Value가 스트링만 되게 했기때문에 이대로는 쓸수없음
//		map.put (5, new Book());
//		map.put (6, new Book(5));

		// (3) Map의 데이터 추출 : 전체 데이터 추출
				//     foreach 로
				// 1.key 꾸러미를 먼저 얻어내야 함 
				Set<Integer> keys = map.keySet(); 
				
				// 얻어진 key 꾸러미가 Set 이기 때문에
				// 2. 이 key에 foreach 를 적용
				// 3. 이 때 얻어진 key로 get(key)를 반복 적용
				for(int key : keys) {
					System.out.printf("key= %d : value = %s%n"
									  , key,map.get(key));	
				}	
	}

}
