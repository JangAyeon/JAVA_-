/*���� 8-6 : ��ġ������ ���� �����̳ʿ� ������Ʈ�� ������ġ�� ���� ũ��� ����
 ���� �׸��� ���� ����Ʈ�ҿ� ��ġ�����ڸ� �����ϰ� 9���� ��ư�� �ϳ��� ���ڿ��� ����ϴ� ���α׷��� �ۼ�
*/

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		setTitle("��ġ������ ���� ���� ��ġ�� ��ġ�ϴ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		contentPane.setLayout(null); //����Ʈ���� ��ġ������ ����
		
		JLabel la=new JLabel("Hello, Press Button");
		la.setLocation(130,50); //la�� (130,50) ��ġ�� ����
		la.setSize(200,20); //la�� 200x20 ũ��� ����
		contentPane.add(la); //la�� ����Ʈ �ҿ� ����
		
		//9���� ��ư ������Ʈ�� �����ϰ� ������ ũ��� ����
		//��ġ�� ���� ��ġ�� ����
		
		for(int i=1;i<=9;i++) {
			JButton b= new JButton(Integer.toString(i));
			b.setLocation(i*15,i*15); //��ư�� ��ġ ����
			b.setSize(50,20);//��ư�� ũ��� �����ϰ� 50x20
			contentPane.add(b);//��ư�� ����Ʈ�ҿ� ����
		}
		setSize(300,200);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new NullContainerEx();
	}
}
