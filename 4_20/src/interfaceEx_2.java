
/*���� 5-7 : �������̽� ���� & ���
 PhoneInterface �������̽��� �����ϰ� flash() �޼ҵ带 �߰��� SamsungPhone Ŭ������ �ۼ�*/

interface PhoneInterface_1{ //�������̽� ����
	final int TIMEOUT=1000; //��� �ʵ� ����
	void sendCall(); //�߻�
	void receiveCall(); 
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class Calc_1{
	public int calculator(int x, int y) {
		return x+y;
	}
	
}

class SamsungPhone_1 extends Calc_1 implements PhoneInterface_1{ 
	public void sendCall() {
		System.out.println("�츮����");
	}
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
	public void schedule() {
		System.out.println("���������մϴ�.");
	}
	
	
}


public class interfaceEx_2 {
	public static void main(String[] args) {
		SamsungPhone_1 phone=new SamsungPhone_1();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		System.out.println("3�� 5�� ���ϸ� "+phone.calculator(3, 5));
		phone.schedule();
	}

}