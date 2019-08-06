package io.basic;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * ǥ�� �Է��� Ű���� �Է��� �޾Ƽ�
 * �Էµ� ������ ���Ϸ� ����ϴ� Ŭ����
 * --------------------------------------------
 * -- �Է� --
 * 1. node stream (Ű���� = System.in : InputStream)
 * 2. filter stream (stream --> reader : InputStreamReader)
 * 3. filter stream (reader --> reader : BufferedReader)
 * 4. 3�� filter stream �� ���� 1�ٴ��� �Է��� �����ϴ�
 *    readLine() �� ���
 * 
 * 
 * -- ��� --
 * 5. node stream (���� - ��������(writer) : FileWriter)
 * 6. filter stream (writer --> writer : PrintWriter)
 * 7. 6�� filter stream �� ���ؼ� 1�ٴ��� ����� �����ϴ�
 *    println() �� ���
 *    
 * -- ���� --
 * 8. �Է¿��� ���������� ���� filter stream �ݱ�
 * 9. ��¿��� ���������� ���� filter stream �ݱ�
 * 
 * @author 304
 *
 */
public class KyeboardInputFileOutput2 {

	public static void main(String[] args) {

		// 1. �Է� : node stream : System.in
//		InputStream in = System.in;
		
		// 2. �Է� : filter stream : stream --> reader
//		InputStreamReader ir = new InputStreamReader(in);
		
		// 3. �Է� : filter stream : reader --> reader
//		BufferedReader br = new BufferedReader(ir);
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));

		// 5. ��� : node stream : file : FileWriter
//		FileWriter fw = new FileWriter("out.txt");
		
		// 6. ��� : filter stream : writer --> writer
//		PrintWriter out = new PrintWriter(fw);
		PrintWriter out = null;
		
		try {
			out = new PrintWriter(new FileWriter("out.txt"));
			
			// 4. �Է� filter stream ���� �б�
			System.out.println("���� �Է��ϼ���. (ctrl + z �Է½� �ߴ�)");
			
			String readData = null;
			while ((readData = br.readLine()) != null) {
				// 7. ��� filter stream �� ����
				out.println(readData);
				//    ȭ�� ���
				System.out.println("���� ������:" + readData);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			// 8, 9 ��ü �ݱ�
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (out != null)
				out.close();
			
		} // end try ~ catch ~ finally
		
	} // end main method
	
} // end class


