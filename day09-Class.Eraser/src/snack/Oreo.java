package snack;

/**
 * Oreo 쿠키를 정의하는 클래스
 * ------------------------------
 * 속성
 * cream 	 : String : 바닐라, 초코, 딸기
 * radius 	 : double : 오레오 쿠키 1개의 반지름
 * thickness : double : 오레오 쿠키 1개의 두께
 * ------------------------------
 * 생성자 : 기본 생성자, 중복 된 this , this()로 정의하는 생성자
 * 총 4개의 생성자 중복정의
 * ------------------------------
 * 메소드  : 
 * print() :오레오 쿠키의 상태 출력
 * changerCream(String cream) : void 
 * 			: 매개변수로 입력된 cream 값으로 
 * 			  오레오 쿠키의 크림을 변경함 
 * ------------------------------
 * 
 * @author Administrator
 *
 */
public class Oreo {
	// 1. 선언
	String cream;
	double radius;
	double thickness;
	
	
	// 2. 생성자 
	Oreo(){
		
	}
	Oreo(String cream){
		this();
		this.cream = cream;
	}
	Oreo(String cream, double redius){
		this(cream);
		this.radius = radius;
	}
	Oreo(String cream, double redius, double thickness){
		this(cream, redius);
		this.thickness = thickness;
	}
	
	// 3. 메소드 선언
	public void changerCream(String cream) {
		this.cream = cream;
	}
	public void print() {
		System.out.printf("이 오레오는 %s 맛 %4.1f 반지름 %4.1f 굵기 입니다.%n ", cream, radius, thickness);
	}

}
