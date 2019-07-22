package book;
/**
 * 책 한 권의 정보를 담는 클래스
 * --------------------------------
 * 일련번호  : sequence	 : int
 * isbn	     : isbn		 : String
 * 제목 	 : title 	 : String
 * 저자 	 : author 	 : String
 * 출판사    : company 	 : String
 * 페이지 수 : totalPage : int
 * 가격 	 : price 	 : int
 * 재고      : quantity  : int
 * --------------------------------
 * 생성자 중복 정의(기본 생성자 명시, 매개변수 생성자 중복정의)
 * --------------------------------
 * 메소드 :
 * -- 기능 메소드
 * void print() : 책의 정보를 출력하는 메소드
 * void buy(int amount)  : amount 만큼 책의 재고를 늘리는 메소드
 * void sell(int amount) : amount 만큼 책의 재고를 줄이는 메소드
 * 
 * -- 각 필드를 설정하는 메소드 
 * -- 자바 빈즈(Java Beans) 규격에 의한 접근자/ 수정자 메소드
 * -- getter / setter 
 * 
 * getter 작성시 메소드 이름 규격
 * == > get으로 시작하고 멤버 변수 필드의 첫글자를 대문자로 조합 
 * 		매개변수는 없음.
 * 		리턴 타입이 해당 멤버 변수 필드의 타입과 맞춤.
 * 
 * 예) sequence 필드의 getter 는 다음의 규격을 갖는다.
 * int getSequnece(){
 * 		return this.requence;
 * }
 * 
 * setter 작성시 메소드 이름 규격
 * == > set으로 시작하고 멤버 변수 필드의 첫 글자를 대문자로 조합 
 * 		매개변수는 해당 멤버변수 필드와 같은 타입과 변수로 받는다.
 *		리턴 값이 없이 작성
 * void setSequence(int sequence) {
 * 		this.sequence =sequence;
 * }
 * 
 *  만약에 멤버 변수 필드가 boolean 타입이라면 getter의 이름은 get으로 시작하지 않고 is로 시작한다
 *  
 *
 * 
 * 
 * @author Administrator
 *
 */
public class book {
	// 1. 멤버변수 선언
	int sequence;
	String isbn;
	String title;
	String author;
	String company;
	int	totalPage;
	int price;
	int quantity;
	 //sequence의 getter
	 public int getSequence() {
		 return sequence;
	 }
	 
	 //sequence의 setter
	 public void setSequence(int sequence) {
		 this.sequence = sequence;
	 }
	 
	 // isbn 멤버변수 필드에 대한 getter
	 public  String getIsbn() {
		 return isbn;}
	 // isbn 멤버변수 필드에 대한 setter
	 public void setIsbn(String isbn) {
		 this.isbn = isbn;
	 }
	 public String gettitle() {
		 return title;
	 }
	 public void setTitle(String title) {
		 this.title = title;
	 }
	 
	 
	 
	 
	 // 2. 생성자 선언부
	 // (1) 기본 생성자
	 book(){
	
	 }
	 book(int sequence){
		 this();
		 this.sequence = sequence;
	 }
	 book(int sequence, String isbn){
		 this(sequence);
		 this.isbn = isbn;
	 }
	 book(int sequence, String isbn, String title){
		 this(sequence, isbn);
		 this.title = title;
	 }
	 book(int sequence, String isbn, String title, String author){
		 this(sequence, isbn, title);
		 this.author = author;
	 }
	 book(int sequence, String isbn, String title, String author, String company){
		 this(sequence, isbn, title,author);
		 this.company = company;
	 }
	 book(int sequence, String isbn, String title, String author, String company, int totalPage){
		 this(sequence, isbn, title, author, company);
		 this.totalPage = totalPage;
	 }
	 book(int sequence, String isbn, String title, String author, String company, int totalPage, int price){
		 this(sequence, isbn, title, author, company, price);
		 this.price = price;
	 }
	 book(int sequence, String isbn, String title, String author, String company, int totalPage, int price, int quantity){
		 this(sequence, isbn, title, author, company, price);
		 this.quantity = quantity;
	 }

	public void print() {
		String message = "책 정보 [일련번호 : %d, ISBN:%s, 제목:%s,저자:%s, 출판사%s, 페이지%d, 가격%d, 재고:%d]%n";
		System.out.printf(message,sequence,isbn, title,author,company,totalPage,price,quantity);
		
	}
	 
}




