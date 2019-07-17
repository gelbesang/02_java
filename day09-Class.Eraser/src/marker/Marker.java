package marker;

/**
 * 화이트 보드 마커를 정의하는 클래스
 * -----------------------------------
 * 속성 :
 * isNew    : boolean : 새 마커인지/ 다 쓴 것인지 판단
 * isOpened : boolean : 마커의 뚜껑이 열렸는지 닫혀있는지 판단
 * color    : String  : 마커의 잉크 색깔
 * -----------------------------------
 * 생성자 : this, this() 사용하여 생성자 중복정의
 * 기본생성자
 * isNew를 초기화하는 생성자
 * isNew, isOpened 를 초기화하는 생성자
 * 모든 멤버변수 필드를 초기화하는 생성자
 * ------------------------------------- 
 * 메소드 :
 * use() : void : "~색의 마커를 사용하고 있습니다." 출력
 * print() : void 
 *     : isNew 가 true 이면 "새 마커입니다." 
 *               false 이면 "다 쓴 마커입니다." 
 *       isOpened 가 true 이면 "뚜껑이 열려 있습니다."
 *                  false 이면 "뚜껑이 닫혀 있습니다." 
 *       마커의 색상 출력
 * --------------------------------------          
 * @author 304
 *
 */
public class Marker {

	// 1. 멤버변수 선언부
	/** 
	 * 새 마커인지 여부
	 * true : 새마커
	 * false : 다 쓴 마커 
	 * */
	boolean isNew;
	
	/** 
	 * 마커의 뚜껑이 열려있는지 여부
	 * true : 뚜껑이 열려있는 상태
	 * false : 뚜껑이 닫혀있는 상태 
	 * */
	boolean isOpened;
	
	/** 마커 잉크의 색상 */
	String color;

	// 2. 생성자 선언부 : 중복정의 & this, this() 사용
	public Marker() {
	}

	public Marker(boolean isNew) {
		this();
		this.isNew = isNew;
	}
	
	public Marker(boolean isNew, boolean isOpened) {
		this(isNew); 
		this.isOpened = isOpened;
	}
	
	public Marker(boolean isNew, boolean isOpened, String color) {
		this(isNew, isOpened);
		this.color = color;
	}
	
	// 3. 메소드 선언부
	/**
	 * ~ 색의 마커를 사용하고 있습니다.
	 * 라는 문장을 출력하는 메소드
	 */
	public void use() {
		System.out.printf("%s색의 마커를 "
				       + "사용하고 있습니다.%n", color);
	}
	
	
	public void print() {
		String message = "마커 색상 : %s, %s, %s%n";
		String openStatus;
		String newStatus;

		if (isOpened) {
			openStatus = "뚜껑이 열려 있습니다."; 
		} else {
			openStatus = "뚜껑이 닫혀 있습니다.";
		}
		
		if (isNew) {
			newStatus = "새 마커입니다.";
		} else {
			newStatus = "다 쓴 마커입니다.";
		}
		
		System.out.printf(message, color, openStatus, newStatus);
	}
	
	
}