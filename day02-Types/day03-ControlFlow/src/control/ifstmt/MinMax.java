package control.ifstmt;

import java.util.Scanner;

/**
 * �� ������ �Է� �޾�
 * �� �� ū ��, ���� ���� �������� Ŭ���� 
 * 
 * 
 * 
 */
public class MinMax {

	public static void main(String[] args) {
		// 1. ����
		// �Է� ���� ���� ����
		int x, y;
		// ū ��, ���� ���� ���� �� ���� ����
		int min, max;
		// �Է��� ���� ��ĳ�� ����
		Scanner scan; // ctrl + shift + o : import �ʿ���
		
		// 2. �ʱ�ȭ scan = new Scanner(System.in)
		scan = new Scanner(System.in);
		System.out.println("�� ������ �Է� (space bar�� �и�) ");
		
		// ��ĳ�� ����Ͽ� x, y �� ������ �Է�
		x = scan.nextInt();
		y = scan.nextInt();
		
		// 3. ��� : if ~ else  �������� ū ��, ���� �� �Ǻ�
		if(x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}
		
		// ���
		System.out.printf("�Է� �� �� ���� : %d, $d%n", x, y);
		System.out.printf("���� �� : %d%n", min);
		System.out.printf("ū �� : %d%n", max);
		
		
		
		
		
	}

}
