package calc.result;
/**
 * 패키지 : calc.result
    정수형 멤버변수 result 한 개를 갖는 
    클래스 IntResultValue 클래스를 자바빈즈 규격의 클래스로 작성
    
 * @author Taim
 *
 */
public class IntResultValue {

	 int result;
	
	// 기본생성자
	public IntResultValue() {
		
	}
	
	//get set
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	
	
	//toString 재정의
	@Override
	public String toString() {
		return "IntResultValue [result=" + result + "]";
	}
	
	
	
	
	
	
	
}
