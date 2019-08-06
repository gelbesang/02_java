package io.data;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ��ü�� �����Ͱ� ��� ������ �о
 * ������ ������ �Է� �ް� 
 * �� ������ ��ü�� ����
 * -------------------------------------
 * -- �Է� --
 * 1. node stream (���� : FileInputStream)
 * 2. filter stream (������ ���� �Է� : Data InputStream)
 * 3. read �۾� : filter stream �޼ҵ� ���
 *    readInt(), readChar(), readUTF() ...
 *    
 * 
 * -- ��� --
 * 4. read �� ���ؼ� ���� ������ Book ��ü ����
 * 5. 4���� ������� Book ��ü ǥ�� ���
 * 
 * -- ���� --
 * 6.  �Է� filter stream �ݱ�
 * 
 * 
 * 
 * @author Taim
 *
 */
public class ReadBookData {

	public static void main(String[] args) throws IOException {
		// 1. �Է� node stream : FileInputStream
		FileInputStream fis = 
				new FileInputStream("book.data");
		
		// 2. �Է� filter stream : Data InputStream
		DataInputStream in = new DataInputStream(fis);
		
		// 3. read �۾� 
		// (1) Book ��ü ������ �ʿ��� ���� �о ������ ���
		int sequence = in.readInt();
		String isbn = in.readUTF();
		String title = in.readUTF();
		String author = in.readUTF();
		String company = in.readUTF();
		int totalPage = in.readInt();
		int price = in.readInt();
		int quantity = in.readInt();
		
		// (2) ��ü�� ����
		Book vegiterian = new Book(sequence, isbn, title, author, company, totalPage, price, quantity);
		
		// 4. ǥ�� ��� 
		System.out.println(vegiterian);
		
		// 5. �Է� filter stream �ݱ�
		in.close();
		
				
		
		
		
		
		
		
		
	}

}
