package book.exception;

import book.vo.Book;

/**
 * å ������ �ű� �Է��� ��,
 * å ������ �ߺ��� ��� 
 * �߻���ų ���� ���� Ŭ����
 * 
 * @author 304
 *
 */
public class DuplicateException extends Exception {

	// 2. ������
	public DuplicateException() {
		super("���� ������ �ߺ��Ǿ����ϴ�.");
	}
	
	public DuplicateException(String type, Book book) {
		super(String.format("%s:[%d]�� ���� ������ �ߺ��Ǿ����ϴ�."
				          , type, book.getSequence()));
	}
	
	
}