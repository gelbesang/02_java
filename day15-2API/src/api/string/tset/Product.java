package api.string.tset;
/**
 * 
 * 전자 제품을 판매하는 매장에서
 * 관리하는 대상인 "제품"을 정의하는 클래스
 * ---------------------------------------------------
 * 멤버변수(private, protected, public 을 붙이지 말것)
 * 제품 번호 : pcode 	: String : < == "P001"
 * 제품 명   : pname 	: String : < == "삼성 지펠..."
 * 가격 	 : price 	: int    : 진짜 그 제품 가격
 * 재고 수량 : quantity : int 	 
 * ---------------------------------------------------
 *   생성자(public 으로 선언)
 * 기본생성자, 매개변수 생성자 필드 1씩 늘려가며
 * this, this() 사용
 * ---------------------------------------------------
 * 메소드 (public 으로 선언)
 * print()  : void
 * 	==> 제품의 상태를 출력
 * 
 * toString() : String
 *  ==> 이 제품을 대표하는 문자열을 리턴
 *  ==> String.format() 으로 문자열 생성후 리턴
 *  
 *  discount(double percentage) : int
 *   ==> 입력 된 퍼센트 만큼 할인된 가격을 리턴
 *   
 *  sell (int amount) : void
 *   ==> 매장에서 판매(출고)되어
 *   ==> 재고수량(quantity)이 amount 만큼 줄어들도록 반영
 *   ==> 재고 수량이 0 보다 작아질 수 없도록 제한
 *   ==> 판매하려는 수량(amount)가 재고보다 클 수 없도록 처리
 *   
 *   buy (int amount) : void 
 *   ==> 매장에 입고되어 재고수량(quantity)이 
 *   ==> amount 만큼 늘어나도록 반영
 *   =================================================
 *   작성시 주의할 것.
 *   각 필드를 선언 할 때, 필드에 대한 설명을 문서 주석으로 달 것
 *   각 생성자 선언 할 때, 문서 주석 달것
 *   각 메소드 선언 할 때, 메소드 설명을 문서 주석으로 달 것.
 *   ------------------------------------------------- 
 * @author Administrator
 *
 */

public class Product {
	
	// 1. 멤버 변수 선언
	private String pcode;
	private String pname;
	private int	price;
	private int quantity;
	
	// 2. 생성자 선언
	public  Product() { 
	}
	
	public Product(String pcode) {
		this();
		this.pcode= pcode;
	}
	
	public Product(String pcode, String pname) {
		this(pcode);
		this.pname = pname;
	}
	
	public Product(String pcode, String pname, int price) {
		this(pcode, pname);
		this.price = price;
	}
	
	public Product(String pcode, String pname, int price, int quantity) {
		this(pcode, pname, price);
		this.quantity = quantity;
	}
	
	
	// 3. 메소드 선언
	
	@Override
	public String toString() {
		return String.format("제품번호:%s 제품 이름:%s 가격:%d 재고:%d", pcode, pname, price, quantity);
	}
	// alt + shift + s로 만들어진 hashcode 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pcode == null) ? 0 : pcode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (pcode == null) {
			if (other.pcode != null)
				return false;
		} else if (!pcode.equals(other.pcode))
			return false;
		return true;
	}

	// 출력
	public void print() {
		System.out.println(this);
	}
	
	// 할인
	public int discount(double percentage) {
		this.price = price - (int)(price * percentage);
		return price;
	}
	
	// 판매
	public void sell(int amount) {
		if(quantity - amount >= 0 ) {
			quantity -= amount;
		}
	}
	
	// 입고 
	public void buy(int amount) {
		quantity += amount; 
	}
	
	/*-----------------------------------------------------------
	 * 캡슐화를 적용하여 멤버변수 필드의 가시성이
	 * private으로 조정되면 다른 모든 클래스에서 
	 * 접근이 불가능해진다.
	 * 따라서 숨겨진 필드에 접근 할 수 있는 전용 메소드 쌍을 
	 * 정의해야 한다. ==> 접근자 / 수정자 메소드
	 * ==========================================================
	 * 접근자 메소드 : getter
	 * ----------------------------------------------------------
	 * 1. get으로 시작
	 * 2. get 뒤에 오는 이름은 접근하려는 멤버변수 이름의
	 * 	  첫 글자만 대문자로 하는 낙타 표기법(camel - notation) 적용
	 * 3. 메소드 매개변수는 없어야 한다.
	 * 4. 메소드 리턴 타입은 접근 하려면 멤버변수의 타입과 맞춘다.
	 * 5. 멤버 변수 타입이 boolean인 경우
	 *    get 이 아니라 is로 시작하도록 작성
	 * 6. getXxx(), isXxx() 형태로 정의 
	 * ==========================================================
	 * 수정자 메소드 : setter
	 * ----------------------------------------------------------
	 * 1. set 으로 시작
	 * 2. set 뒤에 오는 이름은 수정하려는 멤버 변수 이름의 
	 *    첫 글자만 대문자로 하는 낙타표기법 적용
	 * 3. 메소드 매개변수는 수정하려는 멤버변수 타입과 맞추고
	 *    보통 수정하려는 멤버변수 이름과 같게 설정 
	 * 4. 리턴 타입은 void 로 한다.
	 * 5. 보통 안쪽의 로직은 
	 *    this . 멤버변수 = 매개변수; 로 작성
	 * ----------------------------------------------------------
	 * ----------------------------------------------------------
	 */
	// 수정자
	public void setPcode(String pdcode) {
		this.pcode = pdcode;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setquantity(int quantity) {
		this.quantity = quantity;
	}
	
	// 접근자 메소드
	public String getPcode() {
		return pname;
	}
	
	public int getPrice() {
		return price;
	}
	public String getPname() {
		return pname;
	}
	public int getQuantity() {
		return quantity;
	}

	
	
	
	
	// alt + shift + s gerneal hashcode().equals 클릭
	// 아래처럼 만들지 말고 그냥 써라 
	
	
	
//	//equals() : 객체 내용 비교 메소드 작성
//	// ==> pcode가 같으면 동일 객체로 판단
//	@Override
//	public boolean equals(Object object) {
//		// 1. 동일 비교 연산  결과 저장 할 변수 선언
//		// 2. 기본 false로 초기화 (false는 지역변수)
//		boolean isEqual = false;
//		
//		// 3. 사용 : 동일한 객체인지 판단
//		// (1) 매개 변수로 넘겨진 Object가 product 타입인지 검사
//		if(object instanceof Product) {
//			//(2) 비교 대상인 this 객체와 
//			//    매개변수의 object의 pcode 필드 값을 비교
//			Product product = (Product)object;
//			
//			if(this.pcode.equals(product.pcode)) {
//				isEqual = true;
//			}
//		}
//		return isEqual;
//	}
//	@Override
//	public int hashCode() {
//		/* -----------------------------------------------
//		 * hash 알고리즘 : 입력이 동일하면 출력도 동일함을
//		 * 				   보장하는 수학 알고리즘
//		 * ==> 출력이 다르면 입력이 다르다는 결론을 보장한다.
//		 * -----------------------------------------------
//		 * 1. 비교하려는 필드가 참조형이면 그 클래스가 
//		 *    재정의 해둔 hashCode()를 호출해서 비교
//		 * 2. 비교하려는 필드가 기본형이면 
//		 *    기본형 데이터를 참조형으로 변경하는 포장클래스
//		 *    객체로 변환후에 hashCode()를 적용
//		 *    
//		 * 3. 비교하려는 필드가 1개 이상이면 
//		 *    1, 2 를 각 필드의 타입에 맞추어 적용하고
//		 *    모든 필드의 결과를 XOR(^) 연산을 통과시켜 
//		 *    그 결과를 리턴한다.
//		 * -----------------------------------------------   
//		 *  
//		 */
//		
//		// pcode만 비교
//		return this.pcode.hashCode();
//		// 만약 모든 필드 비교
////		return pcode.hashCode()^
////			   pname.hashCode()^
////			   new Integer(price).hashCode()^
////			   new Integer(quantity).hashCode();
//	}
//	
//	
//	
//	
//	
//	
}
