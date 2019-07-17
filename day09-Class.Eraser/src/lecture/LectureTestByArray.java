package lecture;
/**
 * 2개의 지우개와 4개의 마커를 
 * 배열을 사용하여 사용/관리 하는 테스트 클래스
 * --------------------------------------------
 * 1. 마커(Marker) 배열 markers 를 선언
 *    지우개(Eraser) 배열 erasers 를 선언
 *    
 * 2. markers 는 길이 4로 생성
 *    eraser 는 길이 2로 생성
 *  
 *  markers[0] <== 에는 순서대로 
 *  ~ 
 *  markers[3] red, green, blue, black 마커를 저장 
 *  
 *  erasers[0], [1] 에는 순서대로
 *            leftEraser, rightEraser 를 저장
 *            
 * 3. foreach 를 사용하여
 *   (1) 모든 마커를 한번씩 사용(use())
 *   (2) 모든 지우개를 한번씩 사용(erase())
 *   (3) 모든 지우개를 한번씩 한 겹 벗겨내기(peel())
 *   (4) 모든 지우개의 상태 출력
 *   (5) 모든 마커의 상태 출력          
 *  
 * @author 304
 *
 */
public class LectureTestByArray {

	public static void main(String[] args) {
		// 1. 선언
		marker[] markers;
		Eraser[] erasers;
		
		marker red;
		marker bule;
		marker green;
		marker black;
		Eraser rightEraser; 
		Eraser leftEraser;

		// 2. 
		markers = new marker[4];
		erasers = new Eraser[2];
		
		markers[0] = new marker(true, true, "빨강");
		markers[0] = new marker(false, false, "파랑");
		markers[0] = new marker(true, true, "초록");
		markers[0] = new marker(false, false, "검정");
		
		erasers[0] = new Eraser(3.5, 12.0, 5.5, 5, "검정색", "왼쪽");
		erasers[0] = new Eraser(3.5, 12.0, 5.5, 5, "하얀색", "오른쪽");

		
		
		// 3.
		for(marker marker: markers) {
			
		}
		
		
		
	}
	}


