package school;

/**
 * 학교 시스템에서 교직원의 정보를 받는 클래스
 * 
 * 사람의 공통정보를 담는 클래스인 Person을 상속한다.
 * ---------------------------------------------------
 * dept : String : 소속부서 이름
 * ---------------------------------------------------
 * @author Administrator
 *
 */
public class Employee extends Person {
	
	// 1. 멤버 변수 선언
	/** 직원의 소속 부서 이름	 */
	private String dept;
	// 2. 생성자 선언부
	// (1) 기본 생성자
	/**
	 * 기본 생성자
	 */
	public Employee() {
		
	}
	
	/**
	 * Employee 만의 필드 dept 를 초기화 하는 생성자
	 * @param dept : STring : 소속 부서명
	 */
	public Employee(String dept) {
		this.dept = dept;
	}
	/**
	 * Person 에서 물려받은 필드(id , name , age)와 
	 * Employee 만의 필드 dept 를 모두 초기화 하는 생성자
	 * @param id
	 * @param name
	 * @param age
	 * @param dept
	 */
	public Employee(String id,String name, int age,String dept) {
		super(id, name, age);
		this.dept = dept;
	}

	// 3. 메소드 선언부
	// (1) toString() 재정의
	@Override
	public String toString() {
		String empStr = String.format(",부서: %s", dept);
		return String.format("직원정보 [%s%s]",super.toString(),empStr);
	}
	
	
	
	
	
}
