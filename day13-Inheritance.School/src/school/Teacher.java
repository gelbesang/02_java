package school;

/**
 * 학교 시스텡메서 
 * 학생의 정보를 저장하는 클래스
 * 
 *  사람의 공통 정보를 담는 클래스인 Person을 상속한다.
 * @author Administrator
 *
 */
public class Teacher extends Person {

	// 1. 멤버변수
	private String subject;
	
	// 2. 생성자
	// (1) 기본생성자
	/**
	 * 기본 생성자
	 */
	public Teacher() {
		
	}
	
	// (2) 매개변수 받는 생성자
	/**
	 * Teacher 만의 필드인 subject를 초기화 하는 생성자
	 * 
	 */
	
	public Teacher(String subuject) {
		this.subject = subuject;
	}
	/**
	 * 모든 필드를 초기화 하는 생성자
	 * -----------------------------------------
	 * Person 에서 물려받은 필드 (id,name, age)를 
	 * 부모 클래스의 생성자를 빌려서 초기화하고
	 * Teacher 의 필드인 subject는 직접 초기화
	 * 
	 * @param id
	 * @param name
	 * @param age
	 * @param subject
	 * 
	 */
	public Teacher (String id,String name, int age, String subject) {
		super(id,name,age);
		this.subject = subject;	
	}
	
	// 3. 메소드
	// (1) toString() 재정의
	@Override 
	public String toString() {
		String tcStr = String.format(",과목:%s", subject);
		return String.format("교사 정보[%s%s]"
							, super.toString(),tcStr);
	}
	
	
	
	
	
}
