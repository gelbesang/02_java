package book.resp;

import book.Book;

public class SingleResp implements Response {

	/**
	 * �Էµ� �Ѱ��� ������(object) ��
	 * Book �ѱ��� ������ �� �װ��� ���
	 */
	@Override
	public void response(Object object) {
		Book book = (Book)object;
		System.out.println(book);
	}

}