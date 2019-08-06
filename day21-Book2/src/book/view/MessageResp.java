package book.view;

public class MessageResp implements Response {

	/**
	 * �������� �Է�, ����, ���� ���� �۾� ��
	 * ���� ���ο� ���� �޽����� �߻����� ��
	 * �� �޽����� ���
	 */
	@Override
	public void response(Object object) {

		String message = (String)object;
		System.out.println(message);
	}

}