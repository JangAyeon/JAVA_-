/*���� 6-2 : Point Ŭ������ toString()�ۼ�
 Point Ŭ������ Point ��ü�� ���ڿ���  �����ϴ� toString() �޼ҵ� �ۼ�*/

class Point{
	private int x,y;
	public Point (int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() { //Point ��ü�� ���ڿ���
		return "Point("+x+","+y+")";
	}
}


public class ToStringEx {
	public static void main(String[] args) {
		Point a=new Point(2,3);
		System.out.println(a.toString());
		System.out.println(a);//a�� a.to String()���� �ڵ���ȯ��
		}

}
