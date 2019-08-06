package book.dao;

import java.util.List;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

/**
 * �Ϲ����� å���� ����� �����ϴ� �������̽�
 * 
 * @author 304
 *
 */
public interface BookShelf {
	
	/**
	 * å �ѱ��� å�忡 �߰��ϴ� �޼ҵ�
	 * @param book �߰��� å
	 * @return �߰��� ������ å�� ����
	 * @exception �߰��Ϸ��� å�� ������ �Ϸù�ȣ�� �����ϴ� ���
	 */
	public abstract int add(Book book) throws DuplicateException;
	
	/**
	 * å �ѱ��� ������ �����ϴ� �޼ҵ�
	 * @param book ������ å ����
	 * @return ������ ������ å�� ����
	 * @exception �����Ϸ��� å�� ���� ��� �߻�
	 */
	public abstract int set(Book book) throws NotFoundException;
	
	/**
	 * å �ѱ��� ������ ����(���) �ϴ� �޼ҵ�	 * 
	 * @param book ������ å�� ����
	 * @return ������ ������ å�� ����
	 * @exception �����Ϸ��� å�� ���� ��� �߻�
	 */
	public abstract int remove(Book book) throws NotFoundException;
	
	/**
	 * å �ѱ��� ��ü ������ ���� �޼ҵ�
	 * @param book ��ȸ�� å�� ����
	 * @return ��ȸ�� å�� ����,
	 *         null : ã�� å�� ���� ��� 
	 * @exception �����Ϸ��� å�� ���� ��� �߻�
	 */
	public abstract Book get(Book book) throws NotFoundException;
	
	/**
	 * å�忡 �߰��Ǿ��ִ� ��� å ����� ���� �޼ҵ�
	 * @return
	 */
	public abstract List<Book> getAllBooks();

}