package book.test;

import java.util.ArrayList;
import java.util.List;

import book.BookStore;
import book.controller.BookManager;
import book.dao.BookShelf;
import book.dao.ListBookShelf;
import book.vo.Book;

/**
 * �������� �� �� �ִ� ���� ��ɵ�
 * åã��, å����, �Ű��߰�, å ��� 
 * ���� ����� �׽�Ʈ�ϴ� Ŭ����
 * 
 * @author 304
 */
public class BookStoreTest {

	public static void main(String[] args) {
		
		// 1. �Ŵ������� ������ å��ȿ� �� �迭
//		Book[] books = new Book[0];
		List<Book> books = new ArrayList<Book>();	
//		Set<Book> books = new HashSet<>();
//		Map<Integer, Book> books = new HashMap<>();
		
		// 2. �迭�� �����Ǵ� å���� �����.
//		BookShelf bookShelf = new ArrayBookShelf(books);
		BookShelf bookShelf = new ListBookShelf(books);
//		BookShelf bookShelf = new SetBookShelf(books);
//		BookShelf bookShelf = new MapBookShelf(books);
		
		// 3. �迭�� ������ å���� ������ �Ŵ����� ���
		BookManager manager = new BookManager(bookShelf);
		
		// 4. å���� ������ �Ŵ����� �Բ� ������ ���� 
		BookStore kyobo = new BookStore(manager);
		
		// --------------------------------------------
		// 1. ������ �Ű��� ����
		System.out.println(" 1. ===== �Ű� ���� å ���� =====");
		Book vegetarian = 
				new Book(1, "9788936433598", "ä��������"
						  , "�Ѱ�", "â��", 247, 10800, 10);
		
		Book littlePrince = 
				new Book(2, "9791159039690", "�����(���Ǻ�)"
						  , "�������丮", "�����丮", 150, 8820, 5);
		
		Book noDaap = 
				new Book(3, "9791190182645", "�� �λ��� ���� �����"
						  , "����", "������Ͽ콺", 192, 10800, 3);
		
		Book dduk = 
				new Book(4, "9791196394509", "�װ� ������ �����̴� �԰� �;�"
						  , "�鼼��", "��", 208, 12420, 2); 
		
		Book ax = 
				new Book(5, "9788956055466", "å�� ������"
						  , "�ڿ���", "���Ͽ콺", 348, 14400, 2);
		
		
		// 2. ������ ������ �Ű� �԰�
		System.out.println(" 2. ===== �Ű� �԰� =====");
		kyobo.add(vegetarian);
		kyobo.add(littlePrince);
		kyobo.add(noDaap);
		kyobo.add(dduk);
		kyobo.add(ax);
		
		// �ߺ������� �Է� �õ�
		kyobo.add(ax);
		
		// 3. �԰�� �Ű��� ��� Ȯ��
		System.out.println(" 3. ===== �Ű� Ȯ�� =====");
		kyobo.getAllBooks();
		
		// 4. ä�������� ��������:set
		System.out.println(" 4. ===== ä�������� ���� ���� =====");
		// (1) �������ε� ä�������� å ������ ���� ����
		Book vegetarian2 = 
				new Book(10, "9788936433598", "ä��������"
						  , "�Ѱ�", "â��", 247, 10000, 7);
		
		// (2) ����� å ������ ���� å ��ü�� �Ѱܼ� ����ó��
		kyobo.set(vegetarian2);
		
		// 5. ä������ ���� ���� ���� ��� Ȯ��:��
		System.out.println(" 5. ===== ä�������� ���� Ȯ�� =====");
		// (1) �ش� å�� ������ ��ȣ�� �˸� ��ȸ����
		//     ������ ��ȣ�� ����ִ� Book ��ü�� ����
		Book seqBook = new Book(10);
		kyobo.get(seqBook);
		
		// 6. å�� ������ ���:remove
		System.out.println(" 6. ===== å�� ������ ���� =====");
		// (1) ����� å�� ������ ��ȣ�� �˸� ��Ⱑ��
		//     ������ ��ȣ�� ����ִ� Book ��ü�� ����
		Book rmBook = new Book(50);
		kyobo.remove(rmBook);
		
		// 7. ��� Ȯ���� ���� ��ü ��� �� ��ȸ:getAllBooks
		System.out.println(" 7. ===== å�� ������ ���� �� ��ü ��� Ȯ�� =====");
		kyobo.getAllBooks();
	}

}
