package school;

public abstract class Person {
	
	// 1. 변수 선언
	private String id;
	private String name;
	private int age;
	
	// 2. 생성자
	public Person(String id, String name, int age ) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// 3. 메소드
	public String getId() {
		return id;
	}
	
	public void setId() {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age = age;
	}
	

}
