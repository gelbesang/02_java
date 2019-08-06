package book.controller;

import book.dao.ArrayBookShelf;
import book.dao.BookShelf;
import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.view.ListResp;
import book.view.MessageResp;
import book.view.Response;
import book.view.SingleResp;
import book.vo.Book;

/**
 * å��(BookShelf)�� ����ϴ� �ϸŴ����� ��Ÿ���� Ŭ����
 * -----------------------------------------------------
 * ������ �ϸŴ����� 
 * 
 * 1. å�� å�忡 �Űų�(�߰��ϰų�)
 * 2. å�忡�� ã�ƴ޶�� ��Ź���� å�� ������ ���ų�
 * 3. � å�� �����̳� ���������� �����ϰų�
 * 4. �� �̻� �Ǹ����� ���� å�� ��� �ϰ�
 * 5. �� �������� �Ĵ� å ��Ͼȳ� 
 * 
 * �ϴ� ���� �۾��� ����
 * -----------------------------------------------------
 * ���� ���� : �� �Ŵ����� å���� ����ִ���, �������� 
 *             �˰� �־�� �Ѵ�. 
 * -----------------------------------------------------
 * ==================================================
 * 1. ĸ��ȭ ���� : ��������� private
 *                  ������, �޼ҵ�� public
 *                  
 * ==================================================
 * @author 304
 *
 */
public class BookManager {

	// 1. ������� �����
	//    �Ϲ����� ��� å���� �ٷ� �� �ֵ���
	//    �������̽� Ÿ���� å�� ������ �����Ͽ� ����
	private BookShelf bookShelf;
	
	// �Ŵ����� � �۾� �Ŀ� ��� �����ؾ� ������ ��Ÿ���� Ÿ��
	private Response response;
	
	// 2. ������ �����
	// (1) �⺻ ������ ���
	public BookManager() {
		bookShelf = new ArrayBookShelf();
	}
	
	// (2) �Ű����� ������ �ۼ�
	public BookManager(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}
	
	// 3. �޼ҵ� ����
	// (1) �Ŵ����� å �ѱ��� å�忡 ��������
	//     ���� ���� �� �ִ�.
	public void add(Book book) {
		int addCnt;
		String message = null;
		
		try {
			addCnt = this.bookShelf.add(book);
			
			message = String.format(book.toString() 
					+ "%d ���� �߰��Ǿ����ϴ�.", addCnt);
			
		} catch (DuplicateException e) {
			message = e.getMessage();
			// catch ����� �ۼ��� ��
			// �Ϲ������� e.printStackTrace() �� ���� ���� �����̳�
			// ���Ȼ��� ������ ���α׷��� ����Ҷ���
			// �����ϵ��� �ǰ�޴� �ڵ��̴�.
			e.printStackTrace();
			
		} finally {
			response = new MessageResp();
			response.response(message);
		}
		
	}
	
	/**
	 * å �ѱ��� ���(����)��
	 * ------------------------------------------------------------------------
	 * å�� �����Ϸ� �� ��, �Ŵ����� ������ ������ ���� ������ ���� �ִ�.
	 * isExists(book) �� ��� å�� ������ ������ �����̰�
	 *                        å�� ������ ������ ������ ���̴�.
	 * �� �ΰ��� ��� ��� ����/���п� ���� �޽����� �߻��� ���̹Ƿ�
	 * �Ŵ����� ������ ����� Response �� ���� �ν��Ͻ��� String �޽�����
	 * ó���� �� �ִ� MessageResp Ÿ������ �����Ͽ� ����ϸ� �ȴ�.
	 * -------------------------------------------------------------------------                        
	 * @param book
	 */
	public void remove(Book book) {
		int rmCnt;
		String message = null;
		
		try {
			rmCnt = this.bookShelf.remove(book);
			message = String.format(book.toString() 
					+ "%d ���� �����Ǿ����ϴ�.", rmCnt);
			
		} catch (NotFoundException e) {
			message = e.getMessage();
			e.printStackTrace();

		} finally {
			response = new MessageResp();
			response.response(message);
		}
		
	}
	
	/**
	 * �Ŵ����� å�忡�� ã�ƴ޶�� ���� ��û��
	 * å �Ѱ��� ������ �� �� �ִ�.
	 * �� �� å�� �������� å�� ������ �˷��ִ� ������ �Ѵ�.
	 * 
	 * ���� �Ŵ����� ���� ������ �� ���̹Ƿ� 
	 * ����Ÿ���� Book --> void �� �����Ѵ�.
	 * -------------------------------------------------------------------
	 * ã�� å�� ������ ��, �Ŵ����� ã�⿡ ������ ���� �ְ� ������ ���� �ִ�.
	 * findBook(book) ��� å�� ������ �ش� å�� ������ ���̰�
	 *                å�� ������ �������⿡ ������ ���̴�.
	 * �� �ΰ��� ��� ã�� ������ ���� å 1���� ���� ����� �ϸ� �ǰ�
	 * ã�� ������ ��� ���� �޽����� �߻��� ���̴�.
	 * ���� ������ ��쿡�� SingleResp Ÿ������ �����ϰ�
	 * ������ ��쿡�� MesssageResp Ÿ������ ������ �� �ֵ��� ���� 
	 * Response �� �޸� �����Ͽ� ����ϸ� �ȴ�.                         
	 * -------------------------------------------------------------------
	 * @param book
	 */
	public void get(Book book) {
		Book findBook;
		try {
			findBook = this.bookShelf.get(book);
			response = new SingleResp();
			response.response(findBook);
			
		} catch (NotFoundException e) {
			response = new MessageResp();
			response.response(e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	 * �Ŵ����� å�忡 ���� �Ǹ� ���� �� å�� ������ ������ �� �ִ�.
	 * ------------------------------------------------------------------
	 * å�� �����Ϸ� �� ��, �Ŵ����� ������ ������ ���� ������ ���� �ִ�.
	 * isExists(book) �� ��� å�� ������ ������ �����̰�
	 *                        å�� ������ ������ ������ ���̴�.
	 * �� �ΰ��� ��� ��� ����/���п� ���� �޽����� �߻��� ���̹Ƿ�
	 * �Ŵ����� ������ ����� Response �� ���� �ν��Ͻ��� String �޽�����
	 * ó���� �� �ִ� MessageResp Ÿ������ �����Ͽ� ����ϸ� �ȴ�.
	 * @param book
	 */
	public void set(Book book) {
		int setCnt;
		String message = null;
		
		try {
			setCnt = this.bookShelf.set(book);
			message = String.format(book.toString() 
					+ " %d ���� �����Ͽ����ϴ�.", setCnt);
			
		} catch (NotFoundException e) {
			message = e.getMessage();
			e.printStackTrace();
			
		} finally {
			response = new MessageResp(); 
			response.response(message);
		}
		
	}
	
	// (5) �Ŵ����� �������� �Ǹŵǰ� �ִ� å�� �����
	//     ������ �� �ִ�. ��ȸ�� �� �ִ�.
	public void getAllBooks() {
		response = new ListResp();
		response.response(bookShelf.getAllBooks());
	}
	
}


