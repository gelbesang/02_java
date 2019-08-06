package divider.scope;

/**
 * int �� �ϳ��� �Է¹޾Ƽ�
 * ������ ������ ����ϴ� �޼ҵ�(divide)�� ���� Ŭ����
 * ---------------------------------------------------
 * �� �޼ҵ�� �Է� ���� 1, 0�� ����
 * 0���� ������ ��Ȳ�� �߻��ϴ� ������ ó���Ѵ�.
 * �Է� ���� 1, 0�� �ƴ� ���� 
 * �������� ���� ������ ������ �� �ִ�.
 * ---------------------------------------------------
 * 0���� ������ ��Ȳ�� �߻��ϴ� ����
 * ������ ���� ��
 * DivideZeroException ���ܸ� ����Ͽ�
 * �ε巴�� ó���ϰ� �Ѿ �� �ֵ��� ����.
 * 
 * @author 304
 *
 */
public class Divider {

	// 2. ������ ����
	// �⺻ ������ ���
	public Divider() {
		
	}
	
	// 3. �޼ҵ� ����
	public int divide(int x) throws DivideZeroException {
		
		switch (x) {
		case 0: case 1:
			throw new DivideZeroException();
		
		default :
			break;
				
		}
		
		int result = 100 / (x * (x -1));
		return result;
	}
}
