package school;

/**
 * 시스템에 저장 될 학생, 선생, 직원의 정보중
 * 공통적인 내용을 추출한 상위 클래스
 * 일반적인 사람의 정보를 저장한다.
 * ------------------------------------------
 * 
 * id 	: String
 * name : String
 * age  : int
 * ------------------------------------------
 * @author Administrator
 *
 */
public abstract class Person {
	
	// 1. 변수 선언
	private String id;
	private String name;
	private int age;
	
	// 2. 생성자
	// (1) 기본 생성자 명시 : 생성자 선언부를 완전히 생략하면
	//						  자동으로 기본 생성자 선언이 들어감
	//						  그러나 기본생성자가 아닌 생성자를
	//						  하나라도 선언하면 자동생성되지 않음.
	public Person() {
		
	}
	
	// (2) 매개변수를 받는 생성자 중복정의
	//		매개변수를 받는 생성자가 선언이 된 상태에서 
	//      기본생성자 선언을 누락하는 경우
	//      기본생성자는 자동으로 만들어지지 않음
	
	/**
	 * ID 필드만 초기화 하는 생성자
	 * @param id
	 */
	public Person(String id) {
		
	this();
	this.id = id;
	}
	/**
	 * id, name 필드만 초기화 하는 생성자
	 */
	public Person(String id, String name) {
		
	this(id);
	this.name = name;
	}
	/**
	 * 전체 필드를 초기화 하는 생성자
	 * @param id
	 * @param name
	 * @param age
	 */
	public Person(String id, String name, int age ) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// 3. 메소드
	// toString() 재정의
	@Override
	/**
	 * toString() 메소드의 특별함
	 * ----------------------------------------------------
	 * 1. print 계열의 메소드에서 객체 참조변수를 출력 할 때
	 * 자동으로 작동하는 메소드
	 * 2. Object 클래스에서 상속받는 메소드
	 * 3. 객체를 대표하는 문자열을 만들어서 리턴하는 메소드
	 * 	  => 각 필드를 모두 출력하는 문자열
	 * 
	 */
	public String toString() {
//	 덧셈뺄셈 방법	return "아이디;" + id + "이름:"+ name + "나이" + age;
		return String.format("아이디: %s, 이름 : %s, 나이 :%d"
							, id, name, age);
	}
	
	// (2) print()
		/**
		 * 현재의 객체를 출력하는 메소드
		 * 
		 * 
		 */
	public void print() {
		System.out.println(this);
	}
	// this 변수가 내 객체를 가르키고 있음
	
	
//	
//	public String getId() {
//		return id;
//	}
//	
//	public void setId() {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName() {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge() {
//		this.age = age;
//	}
//	

}
