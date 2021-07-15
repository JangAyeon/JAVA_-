
/*���� 5-2 : super()�� Ȱ���� colorpoint �ۼ�
 : super()�� �̿��Ͽ� ColorPoint Ŭ������ �����ڿ��� ���� Ŭ���� Point�� �����ڸ� ȣ���ϴ� ����*/

class Point_1{
	private int x,y; //������ �����ϴ�  x,y ��ǥ
	public Point_1() {
		this.x=0;
		this.y=0;
	}
	public Point_1(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint() { //���� ��ǥ ���
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint_1 extends Point_1{
	private String color; //���� ��
	public ColorPoint_1(int x, int y,String color) {
		super(x,y); //Point �������� Point(x,y) ȣ��
		this.color=color;
	}
	public void showColorPoint() {//�÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); //Point Ŭ������ showPoint() ȣ��
	}
}

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint_1 cp=new ColorPoint_1(5,6,"blue");
		cp.showColorPoint();
		
	}

}
