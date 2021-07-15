
/*���� 5-6 : �������̽� ����
 PhoneInterface �������̽��� �����ϰ� flash() �޼ҵ带 �߰��� SamsungPhone Ŭ������ �ۼ�*/

interface PhoneInterface{ //�������̽� ����
	final int TIMEOUT=1000; //��� �ʵ� ����
	void sendCall(); //�߻�
	void receiveCall(); 
	default void printLogo() {
		System.out.println("** Phone **");
	}
}


class SamsungPhone implements PhoneInterface{ //�������̽� ����
	//PhoneInterface�� ��� �޼ҵ� ����
	public void sendCall() {
		System.out.println("�츮������");
	}
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone=new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}

}
