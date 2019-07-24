package school;

/**
 * 학교 시스템에서 
 * 학생의 정보를 저장하는 클래스
 * 
 * 사람의 공통정보를 담는 클래스인 Person을 상속한다.
 * @author 304
 *
 */
public class Student extends Person {

	// 1. 멤버변수 선언부
	/** 학생의 전공을 저장하는 멤버변수 */
	private String major;
	
	// 2. 생성자 선언부
	// (1) 기본 생성자
	public Student() {
		
	}
	
	// (2) 매개변수 받는 생성자
	/**
	 * Student 만의 필드인 major 를 초기화하는 생성자
	 * @param major
	 */
	public Student(String major) {
		this.major = major;
	}
	
	/**
	 * Person 클래스에서 물려받은 필드(id, name, age) 와
	 * Student 만의 필드인 major 를 모두 초기화하는 생성자
	 * @param id
	 * @param name
	 * @param age
	 * @param major
	 */
	public Student(String id, String name, int age, String major) {
		super(id, name, age);
//		this(major); // 불가능
		// super(), this() 는 생성자 선언 첫줄에 한번만 등장 가능
		// super() 도 사용하고, this() 도 사용할 순 없다.
		this.major = major;
	}
	
	// 3. 메소드 선언부
	// (1) toString() 재정의 : 학생에 맞도록
	@Override
	public String toString() {
		String stdStr = String.format(", 전공:%s", major);
//		return "학생정보[" + super.toString() + stdStr + "]";
		return String.format("학생정보[%s%s]", super.toString(), stdStr);
	}
	
	
	
	
	
	
	
	
}