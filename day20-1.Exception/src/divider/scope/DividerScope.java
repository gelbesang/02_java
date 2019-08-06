package divider.scope;

/**
 * level1() -> level2() -> level3() 
 * �� ������ �޼ҵ� ȣ���� �Ͼ�� Ŭ����
 * -----------------------------------------
 * level3() �޼ҵ� �ȿ� 0���� ������ ��Ȳ�� 
 * �߻��� �� �ִ� ������ ����
 * -----------------------------------------
 * level3() ���� �߻��� ���ܰ� �޼ҵ� ȣ���� 
 * �������� ���ĵǴ� ���� Ȯ��
 * 
 * 
 * @author 304
 *
 */
public class DividerScope {

	public void level3(int input) throws DivideZeroException {
		// 1. ���� : �������� ������ Divider ��ü ���� ���� ����
		Divider div;
				
		// 2. �ʱ�ȭ
		div = new Divider();
		
		// 3. ���
		System.out.println("=== level3 �� ���۵Ǿ����ϴ�. ===");
		
		div.divide(input);
		
		System.out.println("=== level3 �� ����Ǿ����ϴ�. ===");
	}
	
	public void level2() throws DivideZeroException {
		System.out.println("=== level2 �� ���۵Ǿ����ϴ�. ===");
		
		// 0���� ������ ��Ȳ�� �߻��ϵ��� �Է°��� 0
		level3(0);
		
		System.out.println("=== level2 �� ����Ǿ����ϴ�. ===");
	}
	
	public void level1() throws DivideZeroException {
		System.out.println("=== level1 �� ���۵Ǿ����ϴ�. ===");
		
//		try {
			level2();
//		} catch (DivideZeroException e) {
//			System.err.println("�����߻�!:" + e);
//			e.printStackTrace();
//		}
		
		System.out.println("=== level1 �� ����Ǿ����ϴ�. ===");
	}
	
}



