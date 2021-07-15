/* ���� 8-2 : 3���� ��ư ������Ʈ�� ���� ���� ������ �����
 ���� �׸��� ���� ����Ʈ���� ������ ������ ������ �ϰ�, OK, Cancel, Ignore ��ư�� ������ ���� ���α׷��� �ۼ��ض�*/

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	
	public ContentPaneEx() {
		
		setTitle("ContentPane�� JFrame ����"); //�������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â �ɼ� �߰� - �ݴ� ��ư ���� ���� ���α׷��� ����
		
		Container contentPane=getContentPane(); //����Ʈ�� �˾Ƴ��� -- ��� (���� �ٴ���) ����
		contentPane.setBackground(Color.ORANGE); //�������� ��� ����
		contentPane.setLayout(new FlowLayout()); 
		//����Ʈ�ҿ� Flowlayout ��ġ������ �ޱ� -> ��ġ ������ ������ �Ʒ� ��� ��ư 3�� ��ħ
		
		contentPane.add(new JButton("OK"));//OK ��ư �ޱ�
		contentPane.add(new JButton("Cancel")); // Cancel ��ư �ޱ�
		contentPane.add(new JButton("Ignore")); //Ignore ��ư �ޱ�
		
		setSize(300,150); //������ ũ�� 300x150 ����
		setVisible(true); //ȭ�鿡 ������ ���� -> �̰� �־�� ���� 
		
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
		//ContentPaneEx content= new ContentPaneEx();
		
	}

}
