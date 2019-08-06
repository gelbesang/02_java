package io.object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * book.obj ������ �о
 * ���� �� ��ü�� ������
 * ǥ�� ������� Ȯ���ϴ� Ŭ����
 * ---------------------------------
 * -- �Է� --
 * 1. node stream (���� : FileInputStream)
 * 2. filster stream (��ü �Է� : ObjectInputStream)
 * 3. read �۾� : filter stream �� �޼ҵ� ��� 
 * 	  readObject();
 * 
 * -- ��� --
 * 4. ǥ�� ��� (�ܼ� : System.out)
 * 
 * -- ���� --
 * 5. �Է� filter stream �ݱ�
 * 
 * @author Taim
 *
 */
public class ReadBookObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 1. �Է� node stream : FileInputStream
		FileInputStream fis = new FileInputStream("book.obj");
		
		// 2. �Է� filter stream : ObjectInputStream 
		ObjectInputStream in = new ObjectInputStream(fis);
		
		// 3. read �۾� : readObject()
		Book vegetarian = (Book) in.readObject();
		
		// 4. ���� ������ ������ Book ��ü ǥ�� ���
		System.out.println(vegetarian);
		
		// 5. �Է� filter stream �ݱ�
		in.close();
		
		
		
		
		
		
		

	}

}
