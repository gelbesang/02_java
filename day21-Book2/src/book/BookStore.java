package book;

import book.controller.BookManager;
import book.vo.Book;

/**
 * å�� �Ǹ��ϴ� ������ �����ϴ� Ŭ����
 * �������� ���� �ǸŸ� ���ؼ� �ּ� 1���� 
 * �Ŵ����� �־�� �Ѵ�.
 * ==================================================
 * 1. ĸ��ȭ ���� : ��������� private
 *                  ������, �޼ҵ�� public
 *                  
 * ==================================================
 * @author 304
 *
 */
public class BookStore {

	// 1. ��� ���� : �ϸŴ���
	private BookManager manager;
	
	// 2. ������ 
	// (1) �⺻������ ���
	public BookStore() {
		manager = new BookManager();
	}
	
	// (2) �Ű����� ������ �ߺ� ����
	public BookStore(BookManager manager) {
		this.manager = manager;
	}
	
	// 3. �޼ҵ� ����
	//  (1) ������ �Ű��� ������ ��
	//  �Ŵ������� �Ű� ����(å�忡 �Ŵ� �� ���� ��Ź)
	public void add(Book book) {
		manager.add(book);
	}
	
	
	// (2) �������� ����� ������ ������ ��
	// �Ŵ������� ��� ��Ź
	public void remove(Book book) {
		manager.remove(book);
	}
	
	// (3) �������� �Ǹ� ������ ���� �� ������ ���� ��
	// �Ŵ������� ���� �±� �� å ���� ������ ��Ź��
	public void set(Book book) {
		manager.set(book);
	}
	
	// (4) ������ �� ���� å�� ã�� ��
	// �Ŵ������� ã�ƴ޶�� ��Ź��
	public void get(Book book) {
		manager.get(book);
	}
	
	// (5) �츮 �������� �Ǹ��ϴ� ��� å�� �����
	// �Ŵ������� ��ȸ�ش޶�� ��Ź��.
	public void getAllBooks() {
		manager.getAllBooks();
	}
	
}


