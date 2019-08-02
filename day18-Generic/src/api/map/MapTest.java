package api.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
/**
 * 데이터를 Key,Value를 쌍으로 저장하는 자료 구조인
 * Map을 테스트하는 클래스
 * 
 * Key 	 : 중복을 허용하지 않음
 * Value : 중복을 허용
 * 
 * Key, Value 는 반드시 한 쌍으로만 취급 할 수 있음
 * Key 없는 Value 를 만들 수 없음.
 * Key 없이 Value를 찾을 수 없음.
 * 
 * Key, Value에 모든 타입의 데이터 저장 가능
 * 
 * --------------------------------------------
 * @param args
 */
	public static void main(String[] args) {
		// 1. 선언 : Map 인터페이스 타입 변수
		Map map;
		
		// 2. 초기화 : HashMap 클래스 인스턴스로 초기화
		map = new HashMap();
		
		// 3. 사용
		// (1) Map 에 데이터 추가 put(K, V);
		// key : String , value : String
		map.put("1", "안녕하세요");
		// key : Integer, value : String 
		map.put(new Integer(2), "반가워요~");
		// key : Character, value : String
		map.put('3', "아 .. 오늘 날씨가..."); // '3' 이라는 캐릭터 글자
		// key : Double, value : String 
		map.put(4.0, "너무나 더워요...!");
		// key : Boolean, value : Book(사용자 정의 타입 가능)
		map.put (true, new Book());
		map.put (false, new Book(5));

		// (2) map의 데이터 추출 get(K) 
		System.out.println(map.get("1")); // 위의 "1"과 String 비교
		// auto - boxing, equals(), HashCode(), toStirng()
		System.out.println(map.get(2));  // 위의 new Integer(2)와 Integer 비교 
		System.out.println(map.get('3')); // 위의 '3'과 Character 비교
		System.out.println(map.get(4.0)); // 위의 4.0과 Double 비교
		System.out.println(map.get(true)); // 위의 true와 Boolean 비교
		System.out.println(map.get(false)); // 위의 false와 Boolean 비교
		
		
		// (3) Map의 데이터 추출 : 전체 데이터 추출
		//     foreach 로
		// 1.key 꾸러미를 먼저 얻어내야 함 
		Set keys = map.keySet(); // 위의 데이터 get(K)가 Set타입인 keys가 됨
		
		// 얻어진 key 꾸러미가 Set 이기 때문에
		// 2. 이 key에 foreach 를 적용
		// 3. 이 때 얻어진 key로 get(key)를 반복 적용
		for(Object key : keys) {
			System.out.println(map.get(key));
			System.out.printf("key= %s : value = %s%n"
							  , key.toString(),map.get(key).toString());	
		}
		
		
		
		
		
		
		
		
		
	}

}
