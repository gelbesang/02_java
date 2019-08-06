package io.object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Book ��ü�� �����ϰ�, 
 * ��ü ���� ��� �Ͽ�
 * book.obj ������ ����
 * ----------------------------------------
 * -- �Է� --
 * 1. Book ��ü ����
 * 
 * 
 * -- ��� --
 * 2. node stream (���� : FileOutputStream)
 * 3. filter stream (��ü ��� : ObjectOutputStream) 
 * 4. write �۾� : filter stream�� �޼ҵ� ���
 *  
 * -- ���� --
 * 5. ��� filter stream �ݱ�
 * 
 * 
 * @author Taim
 *
 */
public class WriteBookObject {

	public static void main(String[] args) throws IOException {
		// 1. �Է¿� Book ��ü ����, �ʱ�ȭ
		Book vegetarian = 
				new Book(1, "9788936433598", "ä��������"
						  , "�Ѱ�", "â��", 247, 10800, 10);
		
		// 2. ��� node stream
		FileOutputStream fos = new FileOutputStream("book.obj");
		
		// 3. ��� filter stream
		ObjectOutputStream out  = new ObjectOutputStream(fos);
		
		// 4. write  �۾� : writeObject()
		out.writeObject(vegetarian);
		
		System.out.printf("== å ���� [%s] ��ü ��� �Ϸ�==", vegetarian.getTitle());
		
		// 5. ��� filter stream �ݱ�
		out.close();
		
		

	}

}
