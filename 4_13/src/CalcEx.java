/*���� �Լ��� �ۼ��ϰ��� �ϴ� abs, max, min�� 3�� �Լ��� static �żҵ带 �ۼ��ϰ� ȣ���ϴ� ���*/

class Calc{
	public static int abs(int a) {return a>0? a:-a;}
	//public ����, static���� �����Ǿ� ������� �ʰ� main���� �θ� �� ���� = �������� ����
	public static int max(int a, int b) {return (a>b)?a:b;}
	public static int min(int a,int b) {return (a>b)?b:a;}
}
public class CalcEx {
	
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10,8));
		System.out.println(Calc.min(-3, -8));
	}

}
