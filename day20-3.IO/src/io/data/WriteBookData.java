package io.data;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import io.object.Book;

/**
 * ��ü ���� �� ��ü ������ �ʵ�(��� ����)�� ���
 * -----------------------------------------------
 * -- �Է� --
 * 1. Book ��ü ����
 * 
 * 
 * -- ��� --
 * 2. node stream (���� : FileOutputStream)
 * 3. filter stream (data ���� ��� : DataOutSteam )
 * 4. write �۾� : filter stream �� �޼ҵ� ���
 *    writeChar(), writeInt() writeDouble(),writeUTF() ...
 * 
 * -- ���� --
 * 
 * 
 * @author Taim
 *
 */
public class WriteBookData {

	public static void main(String[] args) throws IOException {
		// 1. Book ��ü ���� (�Է¿�)
		Book vegetarian = 
				new Book(1, "9788936433598", "ä��������"
						  , "�Ѱ�", "â��", 247, 10800, 10);
		
		// 2. ��� node stream
		FileOutputStream fos = new FileOutputStream("book.data");
		
		// 3. ��� filter stream 
		DataOutputStream out = new DataOutputStream(fos);
		
		// 4. write �۾� : filter stream �� �޼ҵ� ���
		out.writeInt(vegetarian.getSequence());
		out.writeUTF(vegetarian.getIsbn());
		out.writeUTF(vegetarian.getTitle());
		out.writeUTF(vegetarian.getAuthor());
		out.writeUTF(vegetarian.getCompany());
		out.writeInt(vegetarian.getTotalPage());
		out.writeInt(vegetarian.getPrice());
		out.writeInt(vegetarian.getQuantity());
		
		System.out.println(" book.data ������ ���� �Ǿ����ϴ�.");
		
		// 5. ��� filter stream �ݱ�
		out.close();
		
	}

}
