package ch03;
/*
 * ��¥ : 2021/12/31
 * �̸� : ������
 * ���� : ScopeEx.Java
 */
public class P45_ScopeEx { // 1. Ŭ���� ��

	private static String email;
	int no; // 1-1. Ŭ���� �� ������ ��밡���� ����
	
	public static void main(String[] args) {  // 2. main �޼��� ��
			
		String name; // 2. main �޼��� �� ������ ��� ������ ����
	
		if (true) {
			// �޼��� �� �ȿ��� �����Ѻ��� ��밡��
			name = "ȫ�浿";
		
			// it�� ���ȿ��� ���� ����
			String email = "hong@test.com";			
		}
	
		// if�� �� �ۿ��� email ������ ����ϸ� ���� �߻�
		email = "hong@test.com";
	}
}
