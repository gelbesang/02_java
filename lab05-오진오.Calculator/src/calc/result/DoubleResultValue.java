package calc.result;
/**
 * 패키지 : calc.result
 *  실수형 멤버변수 result 한 개를 갖는 
 *  클래스 DoubleResultValue 클래스를 자바빈즈 규격의 클래스로 작성
 * @author Taim
 *
 */
public class DoubleResultValue {
	double result;
	
	public DoubleResultValue() {
		
	}

	// 생성자 접근자
	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	
	// toString() 재정의
	@Override
	public String toString() {
		return "DoubleResultValue [result=" + result + "]";
	}
	
	
	
}
