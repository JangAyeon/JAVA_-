/*���� 6-1: Object Ŭ������ ��ü �Ӽ� �˾Ƴ���
  Object Ŭ������ �̿��Ͽ� ��ü�� Ŭ������, �ؽ��ڵ� ��, ��ü�� ���ڿ��� ���*/

class Point_2{
	private int x,y;
	public Point_2(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
public class ObjectPropertyEx {
	public static void main(String[] args) {
		Point_2 p=new Point_2(2,3);
		System.out.println(p.getClass().getName()); //Ŭ���� �̸�
		System.out.println(p.hashCode()); //�ؽ� �ڵ��� ��
		System.out.println(p.toString()); //��ü�� ���ڿ�
	}

}
