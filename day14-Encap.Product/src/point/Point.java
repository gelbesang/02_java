package point;

/**
 * x,y좌표를 정수로 가지는
 * 수학의 한 점을 나타내는 클래스 
 * @author Administrator
 *
 */
public class Point {

	// 1. 멤버변수
	public int x;
	int y; 
	
	// 2. 생성자
	// 기본 생성자
	public Point() {
		
	}
	
	
	// 매개변수 받는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	// 3. 메소드
	// 접근자 / 수정자
	public int getX() {
		return x;
	}
	/**
	 * x 좌표 값이 -10~10 사이만 유효하도록
	 * 유효성 체크 로직이 추가된 수정자
	 * @param y
	 */
	public void setX(int x) {
		if( x > 10) {
			this.x = 10;
		}else if(x < -10) {
			this.x = -10;
		}else {
		this.x = x;
		}
	}
	
	public int getY() {
		return y;
	}
	/**
	 * y 좌표 값이 -10~10 사이만 유효하도록
	 * 유효성 체크 로직이 추가된 수정자
	 * @param y
	 */
	public void setY(int y) {
		if( y > 10) {
			this.y = 10;
		}else if(y < -10) {
			this.y = -10;
		}else {
		this.y = y;
		}
	}
	/**
	 * 자바의 최상위 클래스인 Object 로 부터 물려받은 메소드
	 * 이 객체를 대표하는 문자열 
	 *   : 멤버변수 필드를 조합하는 문자열을 리턴
	 *     print 계열의 메소드에서 자동으로 작동!
	 */
	@Override // <-- anotation 이 메소드가 재정의 되고 있음을 확인
	public String toString() {
//		return "(" + x + ", " + y + ")";
		return String.format("(%d,%d)", x, y);
	}
	/**
	 * 점 q와의 거리를 계산하여 double로 리턴하는 메소드
	 * @param q
	 * @return 점 q와의 거리 : double
	 */
	public double distanceFrom(Point q) {
		return Math.sqrt(Math.pow(q.getX() - x, 2)
					   + Math.pow(q.getY() - y, 2));
	}
	
}
