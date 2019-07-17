package lecture;
/**
 * isNew	: String 마커가 꽉 찼습니다.
 * isOpen 	: String 뚜껑이 열려있습니다.
 * color  	: String 뭔 색이냐 
 * @author Administrator
 *-----------------------------------------
 *메소드 : use 색의 마커를 사요하고 있습니다 void
 */
public class marker {
	// 1. 멤버 변수 선언
	/**
	 * 새 마커인지 여부
	 * true : 새마커
	 * false :  다 쓴 마커
	 */
	boolean isNew;
	/**
	 * 마커의 뚜껑이 열려있는지 여부 
	 * true : 뚜껑 열려있는상태
	 * false : 닫혀있는 상태
	 */
	boolean isOpened;
	String color;

	// 2. 
	// (1) 기본 생성자
	marker(){
		
	}
	
	// (2) 매개변수가 있는 타입 
	marker(boolean isNew){
		this();
		this.isNew=isNew;
	}
	marker(boolean isNew, boolean isOpened){
		this(isNew);
		this.isOpened = isOpened;
	}
	marker(boolean isNew, boolean isOpened, String color){
		this(isNew, isOpened);
		this.color= color;
	}
	
	// 3. 메소드 선언부
	public void use(){
		System.out.printf("%s색의 마커를 사용하고 있습니다.%n", color);
	}
	
	
	public void print() {
		String message = "마커 색상 : %s, %s,%s";
		String openStatus = "";
		String newStatus;
		
		if(isOpened) {
			openStatus = "뚜껑이 열려 있습니다.";
		}else {
			openStatus = "뚜껑이 닫혀 있습니다.";
		}
		
		if(isNew) {
			newStatus = "새 마커입니다.";
		}else {
			newStatus = "다 쓴 마커입니다.";
		}
		System.out.printf("마커 색상 : %s, %s,%s",message,color,openStatus,newStatus);
	}
	
 

}

