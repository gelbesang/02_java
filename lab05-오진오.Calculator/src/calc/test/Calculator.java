package calc.test;

import calc.input.DoubleInputValue;
import calc.input.IntInputValue;
import calc.result.DoubleResultValue;
import calc.result.IntResultValue;

/**
 * 패키지 : calc
 *  IntInputValue, DoubleInputValue 를 각각 
 *  입력받아 각 클래스 인스턴스의 멤버변수 값을 사용하여 
 *  사칙연산과 나머지 연산을 수행하는 
 *  add, sub, mult, div, mod(나머지 연산) 메소드가 중복정의된 
 *  클래스 Calculator 를 작성
 *  ---------------------------------------------------------------
 *  Calculator 클래스 메소드들의 리턴타입은 
 *  IntInputValue 를 받는 경우는 IntResultValue 로 
 *  DoubleInputValue 를 받는 경우는 DoubleResultValue 타입으로 작성
 *	---------------------------------------------------------------
 *  Calculator 클래스의 각 메소드(10개)를 
 *  사용해보는 CalcTest 클래스 스스로 작성하여 
 *   실행하고 각 메소드 실행 결과를 출력
 * @author Taim
 *
 */
public class Calculator {
	
	// 기본생성자
	public Calculator() {
		
	}
	
	// 낙타 표기법 꼭 지키자
	
	/**
	 * 메소드 명 :add
	 * @param iiv : IntInputValue 변수
	 * @return iiv 의 x,y 필드의 합
	 * 			: IntInputValue를 받는 경우는 IntResultValue 타입으로 작성
	 * 
	 */
	public IntResultValue add(IntInputValue iiv) { // 메소드 헤드
		IntResultValue result = new IntResultValue(); // IntResultValue 선언 후 초기화
		// 지역변수로 선언하는게 멤버변수로 선언한거보다 나은 이유
		// 한번쓰고 버리는것이지 유지 될 필요가 없음 
		result.setResult(iiv.getX() + iiv.getY()); // 호출
		
		return result;
	}
	// 빼기
	public IntResultValue sub(IntInputValue iiv) {
		IntResultValue result = new IntResultValue();
		result.setResult(iiv.getX() - iiv.getY());
		
		return result;
	}
	// 곱하기
	public IntResultValue mul(IntInputValue iiv) {
		IntResultValue result = new IntResultValue();
		result.setResult(iiv.getX() * iiv.getY());
		
		return result;
	}
	// 나누기
	public IntResultValue div(IntInputValue iiv) {
		IntResultValue result = new IntResultValue();
		result.setResult(iiv.getX() - iiv.getY());
		
		return result;
	}
	// 나머지 구하기
	public IntResultValue mod(IntInputValue iiv) {
		IntResultValue result = new IntResultValue();
		result.setResult(iiv.getX() - iiv.getY());
		
		return result;
	}
	// -------------------------------------------------------------
	
	// 실수형
	// 더하기
	public DoubleResultValue add(DoubleInputValue real) {
		DoubleResultValue result = new DoubleResultValue();
		result.setResult(real.getX() + real.getY());
		
		return result;
	}
	// 빼기
	public DoubleResultValue sub(DoubleInputValue real) {
		DoubleResultValue result = new DoubleResultValue();
		result.setResult(real.getX() - real.getY());
		
		return result;
	}
	// 곱하기
	public DoubleResultValue mul(DoubleInputValue real) {
		DoubleResultValue result = new DoubleResultValue();
		result.setResult(real.getX() * real.getY());
		
		return result;
	}
	// 나누기
	public DoubleResultValue div(DoubleInputValue real) {
		DoubleResultValue result = new DoubleResultValue();
		result.setResult(real.getX() / real.getY());
		
		return result;
	}
	// 나머지 구하기
	public DoubleResultValue mod(DoubleInputValue real) {
		DoubleResultValue result = new DoubleResultValue();
		result.setResult(real.getX() + real.getY());
		
		return result;
	}
	
}
