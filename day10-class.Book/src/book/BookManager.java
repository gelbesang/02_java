package book;

/**
 * 책장(BookShelft)을 사용하는 북매니저를
 * 나타내는 클래스
 * ----------------------------------
 * 서점의 북매니저는
 * 
 * 1. 책을 책장에 꼽거나(추가하거나) 
 * 2. 책장에서 찾아달라고 부탁받은 책을 가지고 오거나
 * 3. 어떤 책의 수량이나 가격 정보를 수정하거나
 * 4. 더 이상 판매하지 않을 책을 폐기 하는
 * 5. 이 서점에서 파는 책 목록을 안내
 * 
 * 하는 등의 작업을 진행
 * ----------------------------------
 * 전제 조건 : 북매니저는 책장이 어디있는지, 무엇인지
 * 		        알고 있어야 한다.
 * ----------------------------------
 *
 * @author Administrator
 *
 */
public class BookManager {
	
	//1. 멤버변수 선언부
	BookShelf bookShelf;
	
	// 2. 생성자 선언부
	// (1) 기본 생성자 명시
	BookManager(){
		bookShelf = new BookShelf();
	}
	
	// (2) 매개 변수 생성자 작성
	BookManager(BookShelf bookShelf){
		this.bookShelf = bookShelf;
		
	}
	
	// (3) 메소드 선언
	// (1) 매니저는 책 한권을 책장에 가져가서 꽂을 수 있다.
	
	public void add(book book) {
		this.bookShelf.add(book);
	}
	
	//(2) 매니저는 책장에 가서 더 이상 팔지 않을 
	//    폐기 할 책을 제거 할 수 있다.
	
	public void remove(book book) {
		this.bookShelf.remove(book);
	}
	
	// (3) 매니저는 책장에서 찾아달라고 고객이 요청한 
	//	       고객이 요청 한 책 한개를 가지고  올 수 있다.
	public book get(book book) {
		return this.bookShelf.get(book);
	}
	
	// (4) 매니저는 책장에 가서 판매 가격 등
	//     책의 정보를 수정 할 수 있다.
	public void set(book book) {
		this.bookShelf.set(book);
	}
	
	// (5) 매니저는 서점에서 판매되고 있는 책의 목록을 조회 할수 있다.
	public book[] getAllBooks() {
		return bookShelf.getAllBooks();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
