package product;
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
	String pcode;
	String pname;
	int	price;
	int quantity;
	
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
	
	
	
	
	
	
	
}
