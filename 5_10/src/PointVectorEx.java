/*���� 7-2 : Point Ŭ������ ��ü�鸸 �����ϴ� ���� �����
 �� (x,y)�� ǥ���ϴ� Point Ŭ������ ��ü�� �ٷ�� ������ Ȱ���� ������*/

import java.util.Vector;

class Point{
	private int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "("+x+","+y+")";//(x,y) ���
	}
	
	
}
public class PointVectorEx {
	public static void main(String[] args) {
		
		Vector <Point> v= new Vector<Point>();
		
		//3���� Point ��ü Ÿ��
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		//�ε��� 1�� Point(-5,20) ��ü ����
		v.remove(1);
		
		//���Ϳ� �ִ� Point ��ü ��� �˻��Ͽ� ���
		for(int i=0;i<v.size();i++) {
			Point p=v.get(i); //������ i��° Point ��ü ��� �˻��Ͽ� ���
			System.out.println(p); //p.toString()�� �̿��Ͽ� ��ü p ���
		}
	}
}
