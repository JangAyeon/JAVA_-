/*���� �ڵ��� �� Ŭ���� Sample�� AccessEx Ŭ������ ������ ��Ű���� ����ȴ�. ������ ������ ã�Ƴ��� ������ �����϶�*/
class Sample { //default Ŭ����
	public int a;
	private int b;
	int c; //default ����

}

public class AccessEx{
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a=10; //ȣ���
		aClass.b=10; //private�̶� ���� class�������� ȣ�� ����
		aClass.c=10; //ȣ�� ����
		
	}
}