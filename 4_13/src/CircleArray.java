/*Circle ��ü 5���� ������ �迭�� �����ϰ�, 
 Circle ��ü�� �������� 0���� 4���� ���� ������ ��,
 ������ ����϶�*/

class Circle{
	int radius;
	public Circle(int radius) {
		this.radius=radius;//this ����
	}
	public double getArea() {
		return 3.14 * radius * radius;
	}
}
public class CircleArray {
	
	public static void main(String[] args) {
		Circle[] c; //�迭�� ���� ���۷��� ���� ����
		c=new Circle[5]; //���۷��� �迭 ����
		
		for (int i=0;i<c.length;i++) { //��ü ����
			c[i]=new Circle(i);
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.print((int)(c[i].getArea())+" ");
		}
	}

}
