package statical.method;

import static statical.method.Calculator.*;

public class CalcTeset {

	public static void main(String[] args) {
		// static 이 아닌 메소드를 호출할때는
		// 해당 메소드가 정의 된 클래스 객체 참조 변수를 초기화 후
		// 해당 변수에 메소드를 호출
//		Calculator cal = new Calculator();
//		cal.add(10.0, 15.2);
		double result = Calculator.add(1.0,2.5);
		System.out.println(result);

		int addResult = Calculator.add(10, 2);
		System.out.println(addResult);
		
		// 자바에서는 클래스의 
		// static 필드들 (변수,메소드)에 대해서
		// static import 지원
		// static import 구문을 클래스 선언 위쪽에 위치한 경우 
		// 메소드 이름 만으로 호출 할 수 있다.
		
		double subResult = subtract(20.5, 1.4);
		System.out.println(subResult);
	}

}
