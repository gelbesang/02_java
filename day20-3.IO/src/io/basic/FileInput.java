package io.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * ���Ϸ� �Է¹޾Ƽ� (���ϳ����� �о)
 * ǥ�� ���(�����, �ܼ�â)�� �ϴ� Ŭ����
 * -----------------------------------------
 * -- �Է� --
 * 1. node stream   (����(���� ����:reader) : FileReader)
 * 2. filter stream (reader --> reader : BufferedReader)
 * 3. filter stream �� �޼ҵ� readLine()�� ���
 * 
 * -- ��� --
 * 4. node stream (ǥ�� ��� : System.out : PintStream)
 * 5. 1�پ� ��� : println()
 * 
 * 
 * -- ���� --
 * 6. �Է� filter stream �ݱ�
 * 
 * 
 * @author Taim
 *
 */

public class FileInput {

	public static void main(String[] args) throws IOException {
		// 1. �Է� node stream : FileReader
		FileReader fr = new  FileReader("out.txt");
		
		// 2. �Է� fileter stream : BufferedReader
		BufferedReader br =  new BufferedReader(fr);
		
		// 3. �Է� filter stream�� �ٴ��� �Է� �޼ҵ� ���
		//    readLine()
		String input = null;
		
		while((input = br.readLine()) !=null) {
			// 4,5
			System.out.println("���Ͽ��� ���� �� ���� ������");
		}
		
		// 6. 6. �Է¿��� filter stream �ݱ�
				br.close();
				}
}
