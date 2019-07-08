package ternary;

import java.util.Scanner;

/**
 * ���� ������ (���ǽ� ? ��:1 , ��:2)�� �׽�Ʈ�ϴ� Ŭ����
 * -----------------------------------------------------
 * ���ǽ� : �������� �׻� true/false�� 
 * 			boolean Ÿ���� �����ͷ� ���;���
 * �� 1   : ���ǽ��� ����� true �� �� ���õ�
 * �� 2   : ���ǽ��� ����� false �� �� ���õ�.
 * ----------------------------------------------------- 
 * ��1, ��2 �� ������ Ÿ���� ��ġ�ؾ��Ѵ�.
 * 
 * ������ ���� ����� �Ҷ� Ȱ���غ���.
 * 
 * @author Administrator
 *
 */

public class TernaryTest {

	
	
	public static void main(String[] args) {
		// 1. ����, 2. �ʱ�ȭ
		int x = 10;
		int y = -10;
		
		int absX = (x >= 0) ? x : -x;
		int absY = (y >= 0) ? x : -y;

		// 3. ��� : ���
		System.out.printf("x= %d �� ��, x�� ������ %d%n", x, absX);
		System.out.printf("x= %d �� ��, x�� ������ %d%n", x, absX);
		
		// ��ĳ�ʸ� ��� �Ͽ� �Է¹��� ������ ���� 
		// ������ ���غ���
		// 1. ��ĳ�� �� ���� ���� 
		Scanner scan; // ctrl + shift + o
		int z;
		int absZ;
		
		// 2. ��ĳ�� �� ���� �ʱ�ȭ
		scan = new Scanner(System.in);
		
		// ������ �Է����� �˷��ִ� �޽��� ���
		System.out.println("������ �Է��ϼ���");
		z = scan.nextInt();
		
		absZ= (z >= 0) ? z : -z;
		System.out.printf("z=%d �� ��, z�� ������ %d%n", z, absZ);
		
		
		
		
		
		
		
		
		
	}

}
