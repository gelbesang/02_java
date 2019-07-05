package operator.unary;
/**
 * 단항 연산자를 테스트 해보는 클레스
 * --------------------------------------
 * +, - : 부호 변경 연산자
 * 		  변수의 왼쪽에 붙여서 해당 변수에 있는 숫자 값의 부호를 변경
 * ---------------------------------------------------------
 * ++ , -- : 증감 연산자
 * 			 변수의 왼쪽/ 오른쪽에 붙여서
 * 		     해당 변수의 값에 1씩 증가를 하거나
 *  		 1씩 감소시키는 연산을 수행
 *  --------------------------------------------------------
 * @author Administrator
 *
 */
public class IncreaseDecrease {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int ten = 10;
		int count = 0;
		
		// 3. - 연산자로 부호를 변경
		System.out.println("ten = " + ten );
		ten = -ten; // ==> 동일 연산 : -1 * ten;
		System.out.println("ten = " + ten);

		ten = -ten; //
		System.out.println("ten = " + ten);
		
		ten = +ten; // ==> 동일연산 : 1 * ten;
		System.out.println("ten = " + ten);

		// 4. ++, -- 연산자로 count의 값을 변경
		System.out.println(++count); // count = count + 1 출력 전에
		System.out.println(count++); // count = count + 1 출력 후에 
		System.out.println(count);
		System.out.println(--count); // count = count - 1 출력 전에 
		System.out.println(count--); // count = count - 1 출력 후에
		System.out.println(count);
		
		System.out.println("=======================================");
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count);
		System.out.println("=======================================");

		System.out.println(count--);
		System.out.println(count--);
		System.out.println(count--);
		System.out.println(count--);
		System.out.println(count--);
		System.out.println(count);

		
	
	
	
	
	
	
	
	}
}
