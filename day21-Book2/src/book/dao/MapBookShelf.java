package book.dao;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import book.vo.Book;

/**
 * Map ������ ������ å�� Ŭ����
 * 
 * key   : Book.sequence �ʵ�� ���
 * value : Book �ν��Ͻ� ��ü
 * 
 * @author 304
 *
 */
public class MapBookShelf implements BookShelf {
	
	// 1. �������
	private Map<Integer, Book> books;

	// 2. ������
	// (1) �⺻������
	public MapBookShelf() {
		books = new HashMap<>(); 
	}
	
	// (2) �Ű����� ������
	public MapBookShelf(Map<Integer, Book> books) {
		this.books = books; 
	}
	
	@Override
	public int add(Book book) {
		int addCnt = 0;
		
		// Ű�� �������� �ʴ� ��츸 �ű� �߰�
		if (!isExists(book)) {
			books.put(book.getSequence(), book);
			addCnt++;
		}
		
		return addCnt;
	}

	@Override
	public int set(Book book) {
		int setCnt = 0;
		
		// ������ å�� Ű�� �����ϴ� ��츸
		if (isExists(book)) {
			books.put(book.getSequence(), book);
			setCnt++;
		}
		
		return setCnt;
	}

	@Override
	public int remove(Book book) {
		int rmCnt = 0;
		
		// ������ å�� Ű�� �����ϴ� ��츸
		if (isExists(book)) {
			books.remove(book.getSequence());
			rmCnt++;
		}
		
		return rmCnt;
	}

	@Override
	public Book get(Book book) {
		Book found = null;
		
		if (isExists(book))	{
			found = books.get(book.getSequence());
		}
		
		return found;
	}

	@Override
	public List<Book> getAllBooks() {
		// Map ���� ���鸸 ���ؼ� Collection �� Generic ��
		// ����� ���·� ������ִ� valuse() �޼ҵ尡 �����Ƿ�
		// �� �޼ҵ带 �����Ͽ� Map �� ���鸸 ����
		Collection<Book> collection = books.values();
		
		// Collection �������̽����� �÷����� �迭�� ������ִ�
		// toArray() �޼ҵ尡 ����
		// �� ��, �Ű������� ���� �迭�� Ÿ���� �����ؼ� �־��ָ�
		// Object[] �� �ƴ� Ư�� Ÿ���� �迭�� ���Ϲ��� �� ����.
		Book[] books = collection.toArray(new Book[] {});
		
		// �׷��� ������� �迭�� ����Ʈ�� ����
		return Arrays.asList(books);
	}
	
	// �ʿ�� private �޼ҵ� �߰�
	/**
	 * Map �������̽��� ������ �ִ� 
	 * containsKey() �޼ҵ带 ����Ͽ�
	 * Ű�� �ѱ�� �� Ű�� ������ true, 
	 * �ƴϸ� false �� ���Ϲ޾�
	 * Ű ���� ���θ� ���Ǵ� �޼ҵ�
	 * 
	 * @param book
	 * @return
	 */
	private boolean isExists(Book book) {
		return books.containsKey(book.getSequence());
	}

}