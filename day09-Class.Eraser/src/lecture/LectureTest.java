package lecture;

import marker.Marker;

/**
 * 마커(Marker)와 칠판 지우개(Eraser)를 사용하여 마커를 쓰고 지우개로 지워보는 테스트 클래스
 * 
 * @author Administrator
 *
 */
public class LectureTest {
	// 1. 선언 : 지우개 2개
	public static void main(String[] args) {
		Eraser leftEraser;
		Eraser rightEraser;

		Marker red;
		Marker blue;
		Marker green;
		Marker black;

		// 2. 초기화
		// (1) 왼쪽 지우개는 기본 생성자로 초기화
		leftEraser = new Eraser();

		// (2) 오른쪽 지우개는 매개변수 생성자로 초기화
		rightEraser = new Eraser(3.5, 12.0, 5.5, 3, "흰색");
	}

	// 3. 사용
	// (1) 네개의 마커를 한번씩 사용
	
	// (2) 오른쪽 지우개로 사용한 내용 지우기
	
	// (3) 오른쪽 지우개 한겹 벗겨내기
	

}
