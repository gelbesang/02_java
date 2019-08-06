package book.dao;

import java.util.Arrays;
import java.util.List;

import book.vo.Book;

/**
 * Book �������� �����־�
 * å ��ü �������� �ѹ��� �����ϰ� 
 * ������ �� �ִ� Ŭ����
 * 
 * ==================================================
 * 1. ĸ��ȭ ���� : ��������� private
 *                  ������, �޼ҵ�� public
 *                  
 * ==================================================
 * @author 304
 *
 */
public class ArrayBookShelf implements BookShelf {

	// �������
	private Book[] books;
	
	public ArrayBookShelf() {
		books = new Book[0];
	}
	
	public ArrayBookShelf(Book[] books) {
		this.books = books;
	}
	
	// å�忡 å�� �߰� : add : void : �Ű������� Book 1���� �޴´�.
	/**
	 * 1. ������ int Ÿ������ ���� �߰� ������ �Ǽ��� ����
	 * 
	 * 2. �Ű������� �Էµ� book ��ü�� 
	 *    �̹� ��Ͽ� �����ϴ��� ���θ� 
	 * 
	 *    isExists(book) �޼ҵ带 ����Ͽ� �Ǵ��ϰ�
	 *    isExists(book) �� ����� false �� ����
	 *    ������ �߰������� �۵��ϵ��� ����
	 * 
	 * @param book
	 * @return 0 : �̹� ���� seq ��ȣ�� å�� �־
	 *             �߰� ����
	 *         1 : �� å ���� 1���� ���������� �߰��� ���
	 */
	public int add(Book book) {
		// 1. ���� �� ���庯�� ����, �ʱ�ȭ
		int addCount = 0;
		
		// 3. ��������
		// �߰��Ϸ��� å�� �����ϴ��� �Ǵ�
		if (!isExists(book)) {
		
			// �̹� �����ϴ� �迭 + 1ũ��� ����
			this.books = Arrays.copyOf(books, books.length + 1);
			
			// 1 �þ �迭 ������ �ڸ��� �� book
			// (�Ű������� �Ѿ�� ��) ����
			this.books[books.length - 1] = book;
			
			addCount++;
		}
		
		// 2. ���� �� ���� ���� ���� ���� 
		return addCount;
	}
	
	// å�忡�� å�� ���� : void : remove(Book book)
	/**
	 * �����ϱ� ���� ��Ͽ� book ��ü�� �����ϴ��� ����
	 * isExists(book) ���� �Ǵ�
	 * 
	 * ����� true �� ���� �������� ����    1����
	 * ����� false �̸� �������� ���� ���� 0����
	 * @param book
	 */
	public int remove(Book book) {
		// book ��ü�� sequence �� ������ ���� å���� �Ǵ��ؼ�
		// ����
		// ��� ���ϰ� ���� å�� ������ �� �迭
		int rmCnt = 0;		
		Book[] newBooks;
		
		// ������ å�� �����ϸ�
		if (isExists(book)) {
			
			// 1. ����� å�� ��ġ�ϴ� �ε����� ã��
			int index = findBookIndex(book);
			
			// 2. ����� å�� �ε����� -1���� ũ��
			//    ����� å�� �ִٴ� �ǹ̷� �Ǵ��ϰ� �������� ����
			if (index > -1) {
				// 3. ��� ���� å�� ������ 
				//    �� �迭�� ���� �迭 ũ�� - 1 ũ��� ����
				newBooks = new Book[books.length - 1];
				
				//  (1) ������ å ������ å������ ���� �ε����� ����
				for (int idx = 0; idx < index; idx++) {
					newBooks[idx] = books[idx];
				}
				
				//  (2) ������ å ������ ���� å������ ���� �ε��� - 1 ��ġ�� ����
				for (int idx = index; idx < newBooks.length; idx++) {
					newBooks[idx] = books[idx + 1];
				}
				
				// 6. ���� å�� ����� �� �迭��
				//    this.book �� ���� ����
				this.books = newBooks;
				rmCnt++;
			} // end outer if
		}
		
		return rmCnt;
	}
	
	// å ���� ���� : void : set(Book book)
	/**
	 * �����ϱ� ���� ������ book ��ü��
	 * ��Ͽ� �̹� �����ϴ��� ���θ�
	 * isExists(book) ���� ����� �Ǵ��ؼ�
	 * 
	 * true �̸� �����ϰ� 1����
	 * false �̸� ������������ �ʰ� 0����
	 * @param book
	 */
	public int set(Book book) {
		int setCnt = 0;
		if (isExists(book)) {
			// ������ book �� books �迭 
			// ���° �ε����� �ִ��� ã�´�.
			books[findBookIndex(book)] = book;
			setCnt++;
		}
		return setCnt;
	}
	
	// å �ѱ� ��� : Book : get(Book book)
	public Book get(Book book) {
		// �Էµ� book�� sequence ����
		// ���� �迭�� ����� å���� ��ġ�ϴ� sequence �� ����
		// å 1���� ������ ����
		return findBook(book);
	}
	
	// ��ü å ����� ��� : getAllBooks()
	public List<Book> getAllBooks() {
		// Arrays Ŭ���� �ȿ� �ִ� static �޼ҵ� ����Ͽ�
		// Book[] �� List<Book> �� �����Ͽ� ����
		// �ֳ��ϸ� BookShelf �������̽� ��������
		// ����Ÿ�� ���߱� ���ؼ�
		return Arrays.asList(this.books);
	}
	
	// ������
	public Book[] getBooks() {
		return books;
	}
	
	// ������
	public void setBooks(Book[] books) {
		this.books = books;
	}

	// ---------------------------------------
	/**
	 * �Ű����� ���޵� å ������
	 * ��ġ�ϴ� �Ϸù�ȣ�� ���� å(å �迭: books �� �ִ�)��
	 * ã�Ƽ� �迭�� �ȿ� ����ִ� å�� ����
	 * ---------------------------------------
	 * ���� å�� ã�� ������ 
	 * sequence �� ���� �񱳿���
	 * book ��ü �񱳷� ����
	 * ---------------------------------------
	 * @param book
	 * @return
	 */
	private Book findBook(Book book) {
		Book findBook = null;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].equals(book)) {
				// ���� å ã�Ҵ�.
				findBook = books[idx];
				break;
			}
		}
		return findBook;
	}
	
	/**
	 * ���� å�� ã�� ������ 
	 * sequence �� ���� �񱳿���
	 * book ��ü �񱳷� ����
	 * 
	 * @param book
	 * @return
	 */
	private int findBookIndex(Book book) {
		int index = -1;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].equals(book)) {
				// ���� å ã�Ҵ�.
				index = idx;
				break;
			}
		}
		return index;
	}

	/**
	 * �Ű������� ���޵� book(å)�� 
	 * ���(�迭)�� �����ϴ��� ���θ� �˻��ؼ�
	 *  
	 * �����ϸ� true
	 * �������� ������ false 
	 * �� �����ϴ� private �޼ҵ�
	 * 
	 * @param book
	 * @return true : ã�� å�� ��Ͽ� ����, 
	 *         false : ã�� å�� ��Ͽ� ���� ��
	 */
	private boolean isExists(Book book) {
		// ���� ���� �ִ� �޼ҵ��� ���
		// ���� ���� ������ ������ ����, �ʱ�ȭ
		boolean exists = false;
		
		for (Book findBook: books) {
			if (findBook.equals(book)) {
				// �޼ҵ� ���� �߰�������
				// ���� ���� �����ϴ� ������ ���� ������ ����
				exists = true;
				break;
			}
		}
		// ���� ������ �޼ҵ� ���� ���� 
		// 1���� �ϴ� ���� ���̼���.
		return exists;
	}
	
	
}

