package control.ifstmt;

import java.util.Scanner;

/**
 * �ϳ��� ������ �Է� �޾Ƽ�
 * ��������, ������� �Ǵ��ϴ� Ŭ����
 * 
 * ��, ���⼭�� 0�� ���� �Ǵ��� ���� �ʴ���.
 * 
 * �Է¹��� ���� input�� �����Ͽ� Scanner�� �Է¹ް� 
 * if ~ else �������� ��ȣ�� �Ǻ��� ��
 * �Ǻ� ����� �����ϴ� ���� String result �� �����Ͽ�
 * 
 * "�Է� �� 100 �� ��� �Դϴ�."
 * "�Է� �� -1 �� ���� �Դϴ�." ��� ������ ����Ͻÿ�
 * @author Administrator
 *
 */
public class PositiveNegative {

	public static void main(String[] args) {
		// 1. ����
		int input;
		String result;
		Scanner scan; //import
		
		// 2. �ʱ�ȭ 
		scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.(�� 0 ����)");
		input = scan.nextInt();
		
		// 3. ��� 
		if(input > 0) {
			   result = "���";
		}else {
			   result = "����";
		}
		
		System.out.printf("�Է� �� %d �� %s �Դϴ�.%n", input, result);
		System.out.println("�Է� �� " + input + "�� \n" + result + "�Դϴ�.");
		

	}

}
