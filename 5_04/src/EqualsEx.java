/*���� 6-3 : Point Ŭ������ equals() �ۼ�
  Point Ŭ������ x,y �� ��ǥ�� ������ true�� return�ϴ� equals()�� �ۼ��϶�
 */

class Point_3{
	int x,y;
	public Point_3(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public boolean equals(Object obj) {
		Point_3 p=(Point_3)obj;
		if((x==p.x)&&(y==p.y)) return true;
		else return false;
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Point_3 a=new Point_3(2,3);
		Point_3 b=new Point_3(2,3);
		Point_3 c=new Point_3(3,4); 
		//a,b,c�� ��� �ٸ� ��ü��
		//a,b�� ��� ���빰.. ���ڴ� ����
		if (a==b) System.out.println("a==b"); 
		//==�� ��ü�� ���۷������� �������� ���� �ٸ� ��ü���� �۵� ����
		if(a.equals(b)) System.out.println("a is equal to b");
		if(a.equals(c)) System.out.println("a is equal to c");
		//.equals�� ��ü ���� ���빰..��..�� ���ϱ� ������ a�� b�� ���ٰ� ����
	}

}
