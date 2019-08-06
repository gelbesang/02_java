package divider;

import java.util.Scanner;

/**
 * �Է� ���� ���� 0���� ������ ��Ȳ��
 * �߻��� ���ɼ��� �ִ� Ŭ���� Divider ��
 * �׽�Ʈ �Ѵ�.
 * 
 * 
 * @author 304
 *
 */
public class DividerTest {

	public static void main(String[] args) {

		// 1. ����
		Scanner scan;
		int input;
		Divider div;
		
		// 2. �ʱ�ȭ
		div = new Divider();
		scan = new Scanner(System.in);
		
		// �Է� �����ϴ� ���
		System.out.println("������ �Է��ϼ���.");
		input = scan.nextInt();
		
		// 3. ���
		
		int result = div.divide(input);
		System.out.printf("������ ����:%d%n", result);
		
		System.out.println("=���α׷� ����=");
		/* -------------------------
		 * input : 2
		 * ������ ����:50
		 * =���α׷� ����=	
		 * ==================================
		 * input : 0
			Exception in thread "main" java.lang.ArithmeticException: / by zero
				at divider.Divider.divide(Divider.java:30)
				at divider.DividerTest.main(DividerTest.java:32)
         * ���α׷� ���� �޽����� ��µ��� ����
         * ==> ���ܰ� ó������ ���ϰ� ���α׷� �ߴܵ� �� �� ����.	
		 * ------------------------- */
	}

}
/*
package divider;

import java.util.Scanner;

/**
 * �Է� ���� ���� 0���� ������ ��Ȳ��
 * �߻��� ���ɼ��� �ִ� Ŭ���� Divider ��
 * �׽�Ʈ �Ѵ�.
 * 
 * 
 * @author 304
 *
 
public class DividerTest {

	public static void main(String[] args) {

		// 1. ����
		Scanner scan;
		int input;
		Divider div;
		
		// 2. �ʱ�ȭ
		div = new Divider();
		scan = new Scanner(System.in);
		
		// �Է� �����ϴ� ���
		System.out.println("������ �Է��ϼ���.");
		input = scan.nextInt();
		
		// 3. ���
		int result;
		
		try {
			result = div.divide(input);
			System.out.printf("������ ����:%d%n", result);
			
		} catch (DivideZeroException e) {
			System.err.printf("������ ����:%s%n", e);
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("=���α׷� ����=");
		/* -------------------------
		 * input : 2
		 * ������ ����:50
		 * =���α׷� ����=	
		 * ==================================
		 * input : 0
			Exception in thread "main" java.lang.ArithmeticException: / by zero
				at divider.Divider.divide(Divider.java:30)
				at divider.DividerTest.main(DividerTest.java:32)
         * ���α׷� ���� �޽����� ��µ��� ����
         * ==> ���ܰ� ó������ ���ϰ� ���α׷� �ߴܵ� �� �� ����.
         * 
         * ==================================
         * 0 
		   ������ ����:0���� �������� �õ��� �ֽ��ϴ�.
		   0���� �������� �õ��� �ֽ��ϴ�.
				at divider.Divider.divide(Divider.java:33)
				at divider.DividerTest.main(DividerTest.java:35)
		   =���α׷� ����=
	
		 * ------------------------- 
	}

}
*/