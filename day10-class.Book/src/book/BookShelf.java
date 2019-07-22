package book;

/**
 * Book 여러개가 꼽혀 있어 책 객체 여러개를 한번에 저장하고 관리 할 수 있는 클래스
 * 
 * @author Administrator
 *
 */
public class BookShelf {

	// 멤버변수
	book[] books; //데이터 테이블로 갈아 끼우는 부분

	BookShelf() {
		books = new book[0];
	}

	BookShelf(book[] books) {
		this.books = books;
	}

	// 책장에 책을 추가 : add : void : 매개변수로 book 1개를 받는다.
	public void add(book book) {
		// 현재 books 보다 길이가 1 큰 배열을 새로 만든다.
		// newBooks
		book[] newBooks = new book[books.length + 1];

		// books 의 모든 책 내용을 새로 생성한 1칸 큰 배열의
		// 앞쪽부터 복사해서 채워넣고
		for (int idx = 0; idx < books.length; idx++) {
			newBooks[idx] = books[idx];
		}
		// 매개변수로 넘겨진 book은 마지막 새로 생긴 칸에 저장
		newBooks[newBooks.length - 1] = book;
		// 이 클래스의 books 멤버 변수에 새로 만든 newBooks가 저장
		this.books = newBooks;
	}

	// 책장에서 책을 제거 : void : remove(book book)
	public void remove(book book) {
		// book 객체의 sequence가 같으면 같은 책으로 판단해서 삭제	
		// 폐기 안하고 남는 책을 유지할 새 배열
		book[] newbooks;
		// 1 . 폐기 할 책이 위치하는 인덱스를 찾기
				int index = findBookIndex(book);
		// 2. 폐기 할 책의 인덱스가 -1 보다 크면
		//    폐기 할 책이 있다는 의미로 판단하고 삭제 로직 진입
	if (index > -1) {
		// 3. 폐기 안할 책을 유지할 새 배열을 지금 배열 -1 크기로 생성
	newbooks =new book[books.length -1];
		// 4. 폐기할 인덱스가 배열 중간일 때 
	if (index < books.length - 1) {
		// (1) 삭제 할 책 앞쪽의 책정보는 같은 인덱스로 복사
		for(int idx = 0; idx < index; idx++) {
			newbooks[idx] = books[idx];
		// (2) 삭제 할 책 뒤쪽의 남는 책 정보는 현재 인덱스 -1 으로 
		}
			for(int idx = index; idx < newbooks.length; idx++) {
				newbooks[idx] = books[idx + 1];
		}}else {
		// 5. 폐기 할 인덱스가 매열 끝일 때 
		//    폐기 할 인덱스 앞쪽 까지만 새 배열에 복사
		for (int idx = 0; idx < books.length - 1; idx++) {
			newbooks[idx] = books[idx];
		}
		// 6. 남는 책이 복사 된 새 배열을 
		//    this.book에 새로저장 
		this.books = newbooks;
		
	} // end outer if
	
	}
	}

	// 책 정보 수정 : void : set(Book book)
	public void set(book book) {
		// 수정할 book 이 books 배열
		// 몇번째 인덱스에 있는지 찾는다.
		int index = findBookIndex(book);

		if (index > -1) {
			books[index] = book;
		}
	}

	// 책 한권 얻기 : Book : get(Book book)
	public book get(book book) {
		// 입력된 book의 sequence 값과
		// 내부 배열에 저장된 책들중 일치하는 sequence 를 가진
		// 책 1권의 정보를 리턴
		return findBook(book);
	}

	private book findBook(book book) {
		book findBook = null;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].getSequence() == book.getSequence()) {
				// 같은 책 찾았다.
				findBook = books[idx];
				break;
			}
		}
		return findBook;
	}

	private int findBookIndex(book book) {
		int index = -1;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].getSequence() == book.getSequence()) {
				// 같은 책 찾았다.
				index = idx;
				break;
			}
		}
		return index;
	}

	// 전체 책 목록을 얻기 : getAllBooks()
	public book[]getAllBooks(){
		return this.books;
	}

	// 접근자
	public book[] getBooks() {
		return books;
	}

	// 수정자
	public void setBooks(book[] books) {
		this.books = books;
	}

}
