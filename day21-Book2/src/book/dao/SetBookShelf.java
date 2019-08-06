package book.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import book.vo.Book;

/**
 * Set ���� ������� å�� ���� Ŭ����
 * 
 * @author 304
 *
 */
public class SetBookShelf implements BookShelf {

	// 1. �������
	Set<Book> books;
	
	// 2. ������
	// (1) �⺻������
	public SetBookShelf() {
		// books �� HashSet ���� ���� �ʱ�ȭ
		books = new HashSet<>();
	}
	
	// (2) �Ű����� ������
	public SetBookShelf(Set<Book> books) {
		this.books = books;
	}
	
	@Override
	public int add(Book book) {
		int addCnt = 0;
		
		if (books.add(book)) {
			addCnt++;
		}
		
		return addCnt;
	}

	@Override
	public int set(Book book) {
		/*
		 * Set �������� 
		 * set:������ ���� ��
		 * ���� �� ���� �� ������ �� �߰�
		 */
		int setCnt = 0;
		
		if (books.remove(book)) {
			books.add(book);
			setCnt++;
		}
		
		return setCnt;
	}

	@Override
	public int remove(Book book) {
		int rmCnt = 0;
		
		if (books.remove(book)) {
			rmCnt++;
		}
		
		return rmCnt;
	}

	@Override
	public Book get(Book book) {
		Book findBook = null;

		for (Book inBook: books) {
			if (inBook.equals(book)) {
				findBook = inBook;
				break;
			}
		}
		
		return findBook;
	}

	@Override
	public List<Book> getAllBooks() {
		// Set<Book> ===> List<Book> 
		// (1) API �޼ҵ� ����Ͽ� ��ȯ
		List<Book> bookList = 
				Arrays.asList(books.toArray(new Book[] {}));
		
//		List<Book> bookList = new ArrayList<>();
//		for (Book book: books) {
//			bookList.add(book);
//		}
		
		return bookList;
	}

}