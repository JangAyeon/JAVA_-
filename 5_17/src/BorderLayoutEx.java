/*���� 8-4 : BorderLayout ��ġ������ Ȱ��
 BorderLayout ��ġ�����ڸ� ����� ���� �׸��� ���� 5���� ��ư�� ��ġ�ض�*/

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		setTitle("BorderLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane(); //����Ʈ�� �˾Ƴ���
		
		//����Ʈ�ҿ� BorderLayout ��ġ������ ����
		contentPane.setLayout(new BorderLayout(30,20));
		
		contentPane.add(new JButton("Calculation"),BorderLayout.CENTER);
		contentPane.add(new JButton("add"),BorderLayout.NORTH);
		contentPane.add(new JButton("sub"),BorderLayout.SOUTH);
		contentPane.add(new JButton("mul"),BorderLayout.EAST);
		contentPane.add(new JButton("div"),BorderLayout.WEST);
		
		setSize(300,200); //������ ũ�� 300 x 200
		setVisible(true); //�������� ȭ�鿡 ���
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
	

}
