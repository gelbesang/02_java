package lecture;



/**
 * 칠판 지우개를 정의하는 클래스
 * ---------------------------------------------
 * 칠판 지우개 속성 정의 = > 멤버 변수로 생성
 * 가로 : width  : double 
 * 세로 : height : double
 * 높이 : depth  : double
 * 겹   : layer  : int
 * 색상 : color  : String
 * 위치 : loc    : String
 * ---------------------------------------------
 * 생성자 정의 : 중복정의
 * 기본생성사 명시
 * 매개변수를 받는 생성자 : 모든 필드를 다 받도록 정의
 * ---------------------------------------------
 * 기능 정의 	: 메소드로 생성
 * 칠판지우기 	: erase() : void : "칠판을 지웠습니다." 문자열 출력
 * 한 겹씩 제거 : peel() : void
 * 				: 현재 layer 값에서 1 감소 layer가 0이 될 때까지
 * 지우개 상태 출력 : print() : void 
 * 				: 현재 지우개의 가로, 세로, 높이, 겹, 색상등의 상태를 출력
 * 
 * @author Administrator
 *
 */
public class Eraser {
	// 1. 멤버 변수 선언부
	/** 지우개 가로 길이 */
	double width;
	/** 지우개 세로 길이 */
	double height;
	/** 지우개 높이 */
	double depth;
	/** 지우개 겹 */
	int layer;
	/** 지우개 색깔 */
	String color;
	/** 지우개가 있는 위치	 */
	String loc;
	// 2. 생성자 선언부
	// (1) 기본생성자
	/**
	 * 지우개 클래스의 기본 생성자 각 멤버 변수 필드를 타입의 기본값으로 초기화 진행
	 */
	Eraser() {
//			width = 0.0;
//			height = 0.0;
//			depth = 0.0;
//			layer = 0;
//			color = null;
	}

	// (2) 매개변수가 있는 생성자 :
	/**
	 * 지우개의 가로 필드만 초기화 생성자
	 * @param width : 가로길이 => 직접 초기화
	 */
	Eraser(double width) {
		// 45라인의 기본생성자 호출
		//  : 매개 변수가 비어있는 this() 이므로 
		this(); 
		// width 필드는 매개변수로 넘겨진 값으로 초기화
		this.width = width;
	}
	/**
	 * 지우개의 가로, 세로 필드만 초기화하는 생성자
	 * @param width : 가로길이
	 * 		=>width : 필드를 초기화 하는 생성자의 기능을 사용
	 * @param height: 세로길이 => 직접 초기화
	 */
	Eraser(double width, double height){
		this(width);
		this.height = height;
	}
	/**
	 * 지우개의 가로, 세로, 높이 필디를 초기화 하는 생성자
	 * @param width  : 가로길이 = > 매개변수 2개 받는 생성자로 초기화
	 * @param height : 세로길이 = > 매개변수 2개 받는 생성자로 초기화
	 * @param depth  : 높이 => 직접 초기화 
	 */
	Eraser(double width, double height, double depth){
		this(width, height);
		this.depth = depth;
	}
	/**
	 * 가로, 세로, 높이, 겹을 초기화 하는 생성자
	 * @param width : 가로길이 => 매개변수 3개 받는 생성자로 초기화
	 * @param height: 세로길이 => 매개변수 3개 받는 생성자로 초기화
	 * @param depth : 높이 => 매개변수 3개 받는 생성자로 초기화
	 * @param layer : 직접초기화
	 */
	Eraser(double width, double height, double depth, int layer){
		this(width,height,depth);
		this.layer = layer;
	}
	/**
	 * 모든 필드를 초기화 하는 생성자
	 * @param width : 매개변수 4개 받는 생성자로 초기화
	 * @param height: 매개변수 4개 받는 생성자로 초기화
	 * @param depth : 매개변수 4개 받는 생성자로 초기화
	 * @param layer : 매개변수 4개 받는 생성자로 초기화
	 * @param color : 직접 초기화
	 */
	// 다섯개의 매개변수를 모두 받는다.
	// alt + shift r 연결된 변수 수정
	Eraser(double width, double height, double depth, int layer, String color) {
		// alt + shift + a 세로 편집 모드 토글
		this(width, height, depth,layer);
		this.color = color;
	}

	Eraser(double width, double height, double depth, int layer, String color, String loc) {
		// alt + shift + a 세로 편집 모드 토글
		this(width, height, depth,layer, color);
	}
	// 3. 메소드 선언부
	// (1) eraser()
	public void eraser() {
		System.out.println("칠판을 지웠습니다.");
	}

	// (2) peel()
	/**
	 * 남아 있는 지우개 겹으 벗겨내는 메소드 layer 값이 0보다 작을 수는 없다.
	 */
	public void peel() {
		// if 를 사용하여 layer 값이
		// 0 보다 작아질 수 없도록
		// 값을 체크
		if ((this.layer - 1) >= 0) {
			this.layer--;
//			layer -=1;
		}

	}

	// (3) print()
	public void pirnt() {
		System.out.printf("가로: %4.2f, 세로:%4.2f, 높이:%4.2f, 남은 겹 :%d, 색깔 :%s%n", width, height, depth, layer, color);
	}

}
