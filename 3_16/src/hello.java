
public class hello { // public : ����
	//class �����
	
	public static int sum(int n, int m) { 
		//�޼ҵ�
		// ���� �Լ�
		// �Լ� �̸� : sum, ���� : ������ n�� m, int�� ���𰡰� ��µ�
		// public : ����, static : ����/������ �޸� �Ҵ�
		
		return n+m;
		
	}

	public static void main(String[] args) {
		//�޼ҵ�
		// ��ȯ ���� ���� ���� �Լ�, ������ args�� ���ڷ� ��
		// public : ����, static : �ڹٰ� �޸𸮸� ����/���������� �Ҵ� 
		
		int i=20;
		int s;
		char a;
		
		s=sum(i,10); // �����Լ� ȣ�� // 20+10=30
		a='?';
		System.out.println(a); // ? ���
		System.out.println("Hello"); // Hello ���
		System.out.println(s); // ���� s�� ���
	
	
	}

}
