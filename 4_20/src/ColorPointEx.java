class Point {
	private int x,y; //�� ���� �����ϴ� x,y��ǥ
	public void set(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint() { //���� ��ǥ ���
		System.out.println("("+x+","+y+")");
	}
}

//Point�� ��ӹ��� ColorPoint
class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		System.out.print(color);
		showPoint();
	}
}

public class ColorPointEx{ //�÷� ���� ��ǥ ���
	public static void main(String[] args) {
		Point p=new Point(); //Point ��ü ����
		p.set(1, 2); //Point Ŭ������ set() ȣ��
		p.showPoint();
		
		ColorPoint cp=new ColorPoint();
		cp.set(3, 4); //Point Ŭ������ set() ȣ��
		cp.setColor("red"); //ColorPoint�� setColor() ȣ��
		cp.showPoint(); //�÷��� ��ǥ ���
	}
}
