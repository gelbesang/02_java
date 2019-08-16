package calc;

/**
 * 사칙연산에 사용될 두 피연산자를
 * 멤버변수로 갖는 클래스를 정의
 * 
 * int x
 * int y 를 선언
 * 
 * 기본 생성자 선언
 * 
 * 접근자 수정자 선언
 * 
 * equals() & hashCode() 재정의
 * 
 * toString 재정의
 *    출력문자열:입력값 [x=값, y=값]
 * @author 304
 *
 */
public class IntInput {
 // 1. 선언
	private int x;
	private int y;
	
 // 2. 기본 생성자
	public IntInput() {
		
	}
	
	
	// 접근자 수정자
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	// hashcode / equlas
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IntInput other = (IntInput) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}


	// toString()
	@Override
	public String toString() {
		return "IntInput [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	
	
	
	
}
