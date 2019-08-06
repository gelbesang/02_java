package book.view;

import java.util.List;

import book.vo.Book;

public class ListResp implements Response {

	/**
	 * �Էµ� �����Ͱ� ��ü å ���(�迭)�� ��
	 * ��ü ����� ��� 
	 */
	@Override
	public void response(Object object) {

		List<Book> books = (List<Book>) object;
		for (Book book: books) {
			System.out.println(book);
		}
	}

}