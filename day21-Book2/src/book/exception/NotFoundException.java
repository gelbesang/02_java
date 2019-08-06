package book.exception;

import book.vo.Book;

/**
 * ������ ���Ͽ�
 * ����, ����, �Ѱ� ��ȸ �ϴ� ���
 * ��� ������ �������� ���� ��
 * �߻���ų ���ܸ� ������ Ŭ����
 *  
 * @author 304
 *
 */
public class NotFoundException extends Exception {

	// 2. ������
	public NotFoundException() {
		super("���� ������ �������� �ʽ��ϴ�.");
	}
	
	public NotFoundException(String type, Book book)	 {
		super(String.format("%s:[%d]�� ���� ������ �������� �ʽ��ϴ�."
				          , type, book.getSequence()));
	}
}
