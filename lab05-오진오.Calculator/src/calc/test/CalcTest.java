package calc.test;

import calc.input.DoubleInputValue;
import calc.input.IntInputValue;
import calc.result.DoubleResultValue;
import calc.result.IntResultValue;

/**
 * Calculator 클래스의 각 메소드(10개)를 
 * 사용해보는 CalcTest 클래스 스스로 작성하여 
 *  실행하고 각 메소드 실행 결과를 출력
 * @param args
 */
    
public class CalcTest {

	public static void main(String[] args) {

		// 넣을 숫자 변수 선언 초기화 동시에
		IntInputValue inp = new IntInputValue();
		DoubleInputValue input = new DoubleInputValue();
		
		// 값 설정
		inp.setX(100);
		inp.setY(30);
		
		input.setX(100);
		input.setY(30);
		
		// 값 : 선언 초기화 동시에
//		IntResultValue integer = new IntResultValue();
//		DoubleResultValue real = new DoubleResultValue();
		
		// 계산기 타입 선언 초기화 동시에
		Calculator calc  = new Calculator();
		
		// 정수형 더하기
		IntResultValue addResult = calc.add(inp);
		
		// 정수형 빼기
		IntResultValue subResult = calc.sub(inp);
		
		// 정수형 곱하기
		IntResultValue mulResult = calc.mul(inp);
		
		// 정수형 나누기
		IntResultValue divResult = calc.div(inp);
		
		// 정수형 나머지
		IntResultValue modResult = calc.mod(inp);
		
		// --------------------------------------------------
		// 실수형 더하기
		DoubleResultValue addResult2 = calc.add(input);
		
		// 실수형 빼기
		DoubleResultValue subResult2 = calc.add(input);
		
		// 실수형 곱하기
		DoubleResultValue mulResult2 = calc.mul(input);
		
		// 실수형 나누기
		DoubleResultValue divResult2 = calc.div(input);
		
		// 실수형 나머지
		DoubleResultValue modResult2 = calc.mod(input);
		
		
		// 출력
		System.out.println("정수형: 더하기 결과는:" + addResult);
		System.out.println("정수형: 빼기 결과는:" 	+ subResult);
		System.out.println("정수형: 곱하기 결과는:" + mulResult);
		System.out.println("정수형: 나누기 결과는:" + divResult);
		System.out.println("정수형: 나눈 나머지는 " + modResult);
		System.out.println("=====================================");
		System.out.println("실수형: 더하기 결과는:" + addResult2);
		System.out.println("실수형: 빼기 결과는:"   + subResult2);
		System.out.println("실수형: 곱하기 결과는:" + mulResult2);
		System.out.println("실수형: 나누기 결과는:" + divResult2);
		System.out.println("실수형: 나눈 머지는:"   + modResult2);
		
		
		
	}

}
