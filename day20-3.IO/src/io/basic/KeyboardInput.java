package io.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/** 
 * ǥ�� �Է��� Ű���� �Է��� �޾Ƽ�
 * ǥ�� ����� �����(�ܼ�â) ����ϴ� Ŭ����
 * -------------------------------------------------
 * 1. node stream   (Ű���� = System.in) : inputStream
 * 2. filter stream (stream --> reader : InputStreamReader)
 * 	  1. ����Ʈ Ű���� ��ǲ��Ʈ����
 * 	  2. ����Ʈ ���ڷ� ����
 *    (Ű����� ��� �����Է��̱� ������)
 *    
 * 3. filter stream (reader --> reader : BufferedReader)
 *    2 ����Ʈ ���ڸ� 1�� ������ �о
 *    ��Ʈ������ ���� �� �ִ� ���� �޼ҵ带 ����ϱ� ���ؼ�
 *    
 * 4. 3���� ������� filter stream ��ü�� ����ؼ�
 *    read() �� �о���δ�.
 *    
 * 5. 4���� �о���� ������ ǥ�� ���
 *    (����� = system.out)��ġ�� ���
 *    
 * 6. ������ ���� ��Ʈ������ �ݾƼ� �ڿ� ����
 * 
 * @author Taim
 *
 */
public class KeyboardInput {

	public static void main(String[] args) throws IOException{
	// 1. �Է� ��Ʈ�� (ǥ�� �Է� : Ű����)
		InputStream in = System.in;
		
		// 2. ��� ��Ʈ���� ������ ���� ��Ʈ��
		// InputStream ===> Reader �ٲ��ִ� ���� ��Ʈ�� ����
		InputStreamReader ir = new InputStreamReader(in);
		
		// 3. 2�� ���� ��Ʈ���� ���� ����� ���� '
		//    �ٸ� ���� ��Ʈ������ ����
		BufferedReader br = new BufferedReader(ir);
		
		// 3. 2�� ���� ��Ʈ���� ���� ����� ���� '
				//    �ٸ� ���� ��Ʈ������ ����
//				BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
				
		System.out.println("���� �Է��ϼ���. (crtl + z �Է½� �ߴ� �˴ϴ�.)");
		// 4.  3�� ���� ��Ʈ���� ���� �޼ҵ� ����ؼ� �б�
		String readData = null;	
		while ((readData = br.readLine()) !=null){
			// 5. ���� �����Ͱ� null �� �ƴϸ�
			//    ǥ�� ��¿� ����ϱ�
			System.out.println("���� ������ " + readData);
			
		// 6. �ڿ� ����
			br.close();
			
		}
		
		

	}

}
