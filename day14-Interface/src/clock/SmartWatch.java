package clock;

/**
 * Clock 인터페이스를 구현하여
 * SmartWatch를 정의하는 클래스
 * ------------------------------
 * 인터페이스를 구현하면 
 * 구현하는 인터페이스 안에 선언된
 * 추상 메소드를 물려받게 된다.
 * 
 * 클래스가 추상 메소드를 가지고 있으면 
 * 반드시 추상 클래스로 선언 되어야 한다.
 * 
 * @author Administrator
 *
 */
public abstract class SmartWatch implements Clock {

		/**
		 * 스마트 워치 이름을 저장하는 변수
		 */
		private String watchName;
		
		// 수정자/ 접근자
		
		public void setWatchName(String watchName) {
			this.watchName = watchName;
		}
		public String getWatchName() {
			return watchName;
		}
		
		// Clock 인터페이스에서 상속 받은 displayTime() 메소드가 
		// 구현되지 않았으므로 추상 클래스로 작성
		// ==> 인스턴스화 불가능한 추상 클래스가 되며
		// ==> 다형성의 타입제공의 의미만 있는 클래스로 된다.
		
}
