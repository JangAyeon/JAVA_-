/*���� 9-1 :  ���� Ŭ������ Action �̺�Ʈ ������ �����*/

/*
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame{
	public IndepClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn=new JButton("Action");
		btn.addActionListener(new MyActionListener());
		//��ư�� Action �̺�Ʈ ������ ���
		c.add(btn);
		setSize(250,120);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new IndepClassListener();
	}

}

class MyActionListener implements ActionListener{
	//Action �̺�Ʈ ������ ����
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();//�̺�Ʈ �߻��� ���� �޾Ƽ�
		if(b.getText().equals("Action")) //�о�ϱ� Action�̶�� �۾��� �Ȱ�����
			b.setText("�׼�"); //'�׼�'���� �ؽ�Ʈ ������ �ٲ���
		else b.setText("Action"); //�ƴϸ� 'Action'���� �ٲ���
	}
}*/


/*���� 9-2 :  ���� Ŭ������ Action �̺�Ʈ ������ �����*/
/*
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame {


		public IndepClassListener() {
			setTitle("Action �̺�Ʈ ������ ����");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			JButton btn=new JButton("Action");
			MyActionListener al=new MyActionListener();
			btn.addActionListener(al);
			//��ư�� Action �̺�Ʈ ������ ���
			c.add(btn);
			setSize(250,120);
			setVisible(true);
			
		}
		
		private class MyActionListener implements ActionListener{
			//Action �̺�Ʈ ������ ����
			public void actionPerformed(ActionEvent e) {
				JButton b=(JButton)e.getSource();//�̺�Ʈ �߻��� ���� �޾Ƽ�
				if(b.getText().equals("Action")) //�о�ϱ� Action�̶�� �۾��� �Ȱ�����
					b.setText("�׼�"); //'�׼�'���� �ؽ�Ʈ ������ �ٲ���
				else 
					b.setText("Action"); //�ƴϸ� 'Action'���� �ٲ���
					//InnerClassListener�� ����� JFrame�� ����� ȣ��
				
				
			
			IndepClassListener.this.setTitle(b.getText());
					//Ÿ��Ʋ�� ��ư ���ڿ� ���
			}
		}
		
		public static void main(String[] args) {
			new IndepClassListener();
		}

}
*/

/*���� 9-3 :  ���� Ŭ������ Action �̺�Ʈ ������ �����*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame {


	public IndepClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn=new JButton("Action");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b=(JButton)e.getSource();//�̺�Ʈ �߻��� ���� �޾Ƽ�
				if(b.getText().equals("Action")) //�о�ϱ� Action�̶�� �۾��� �Ȱ�����
					b.setText("�׼�"); //'�׼�'���� �ؽ�Ʈ ������ �ٲ���
				else 
					b.setText("Action"); //�ƴϸ� 'Action'���� �ٲ���
					setTitle(b.getText());
				
			}});
		//��ư�� Action �̺�Ʈ ������ ���
		c.add(btn);
		setSize(250,120);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new IndepClassListener();
	}
}



