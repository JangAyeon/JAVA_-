//�� ������ ������ �Է¹ް� ��ð�, ���, �� �������� ���Ͽ� ����ϴ� ���α׷�


import java.util.Scanner;


public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner scanner; //��ĳ�� ���� int x
		scanner=new Scanner(System.in); //��ĳ�� �Է� ����
		System.out.print("������ �Է��ϼ���:");
		int time= scanner.nextInt();//���� �Է� �ޱ�
		int second=time%60;
		int minute=(time/60)%60;
		int hour=(time/60)/60;
		
		System.out.print(time+"�ʴ�");
		System.out.print(hour+"�ð�, ");
		System.out.print(minute+"��, ");
		System.out.println(second+"���Դϴ�.");
		scanner.close();
	}
}
