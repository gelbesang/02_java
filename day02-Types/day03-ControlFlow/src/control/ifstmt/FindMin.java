package control.ifstmt;

import java.util.Scanner;

/**
 * �� ���� �� ���� ���� �������� Ŭ����
 * �� ������ Scanner �� �Է� �޴´�.
 * 
 * @author Administrator
 *
 */
public class FindMin {

	public static void main(String[] args) {
		// 1. ���� : �Է¹��� ����, ���� ���� ���� �� ����
		int x;
		int y;
		int min = 0;
		
		Scanner scan; // ctrl+ shift + o : import 
		
		// 2. �ʱ�ȭ 
		scan = new Scanner(System.in);
		
		// �Է��� �˸��� �ȳ� �޼���
		System.out.println("�� ������ �Է� space bar �� �и�");
		// ��ĳ�� ����� ���� �Է�(�ʱ�ȭ)
		x = scan.nextInt();
		y = scan.nextInt();
		
		// 3.  ��� : �Է� �� �� ���� �� (if)
		if(x < y) {
			min = x;
			System.out.printf("�Է� �� �� �� x = %d, y = %d �� "
					        + "���� ���� %d%n", x, y, min);
		}
		
		if(y < x) {
			min = y;
			System.out.printf("�Է� �� �� �� x = %d, y = %d �� "
							+ "���� ���� %d%n", x, y, min);
		}
		
		if(x == y) {
			System.out.printf("�Է� �� �� �� x = %d, y= %d �� ���� �մϴ�.%n", x, y);
		}
	}

}
