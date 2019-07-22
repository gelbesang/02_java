package book;

/**
 * 책을 판매하는 서점 서점을 정의하는 클래스
 * 서점에서 도서 판매를 이ㅜ해서 최소 1명의 
 * 매니저는 있어야 한다.
 * 
 * 
 * @author Administrator
 *
 */
public class BookStore {
	
	// 1. 멤버 변수 : 북매니저
	BookManager manager;
	
	// 2. 생성자
	// (1) 기본생성자 명시
	BookStore(){
		manager = new BookManager();
	}
	
	
	// (2) 매개변수 생성자 중복 정의 
	BookStore(BookManager maganer){
		this.manager = maganer;
	}
	
	// 3. 메소드 선언
	// (1) 서점에 신간이 들어 왔을 때 
	// 매니저에게 신간 정리 (책장에 꽂는 것 등을 부탁)
	public void add(book book) {
		manager.add(book);
	}
	
	
	// (2) 서점에서 폐기 할 도서가 생겼을 때
	// 매니저에게 폐기 부탁
	public void remove(book book) {
		manager.remove(book);
	}
		
	// (3) 서점에서 판매 도서의 가격 등 변동이 있을 때
	// 매니저에게 부탁해서 가격 태그 등 책 정보 수정을 함	
	public void set(book book) {
		manager.set(book);
	}
	// (4) 서점에 온 고객이 책을 찾을 때
	// 매니저에게 찾아달라고 부탁함
	public book get(book book) {
		return manager.get(book);
	}
	// (5) 우리 서점에서 판매하는 모든 책의 목록을 
	// 매니저에게 조회해 달라고 부탁함
	public book[] getAllBooks() {
		return manager.getAllBooks();
	}
	
	
	
}
