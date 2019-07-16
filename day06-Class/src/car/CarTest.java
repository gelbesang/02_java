package car;

/**
 * Car(자동차) 라는 타입의 실제 객체를 생성하고
 *사용(테스트)하는 클래스
 *
 * 
 * @author Administrator
 *
 */
public class CarTest {

	public static void main(String[] args) {
		// car 라는 타입의 객체를 사용하기 위한 
		// 참조 변수가 필요함
		// 1. Car 타입의 변수 선언
		Car myCar;
	
		String name;
		//next int 는 int 값을 리턴하는것.
		
		
		// 2. 초기화 
		myCar = new Car(); // 기본이 아닌건 그냥 new 붙이고 타입 () 써주면됨.
		
		// 3. 사용 : Car 라는 타입(클래스)에 정어듼 메소드 호출
		// (1) 별명 붙이기
		System.out.println("== 별명 붙이기 전 ==");
		myCar.print();
		
		System.out.println("== 별명 붙이고 난 후 ==");
		myCar.setNickname("일리단");
		myCar.print();
		
		// (2) 가속	
//		myCar.accelerate(60); // <= 호출 구문 이게 리턴 된 값으로 치환됨.
//		int newVelocity = myCar.accelerate(60);
		System.out.println("1.myCar 의 초기화 후 속도");
		myCar.print();
		
		System.out.println("2. 60만큼 가속 후 속도");
		myCar.accelerate(60);
		myCar.print();
		
		System.out.println("3. 20만큼 추가 가속 후 속도");
		myCar.accelerate(20);
		myCar.print();
		
		System.out.println("4. 정지 후 속도");
		myCar.stop();
		myCar.print();
		
		
	}

}
