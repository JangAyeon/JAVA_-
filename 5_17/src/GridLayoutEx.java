import java.awt.*;

import javax.swing.*;

/*���� 8-5 : GridLayout ��ġ �����ڸ� ����ϴ� ��
 GridLayout�� Ȱ���� ���� �׸��� ���� �� �ٿ� 10���� ��ư�� ������ ũ��� ��ġ�ϴ� ���� ���α׷� �ۼ�*/
public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		super("GridLayout����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		//1x10�� GridLayout ��ġ������
		contentPane.setLayout(new GridLayout(1,10));
		for (int i=0;i<10;i++) { //10���� ��ư ���� 
			String text=Integer.toString(i); //i�� ���ڿ��� ��ȯ
			JButton button=new JButton(text);
			contentPane.add(button); //����Ʈ�ҿ� ��ư ����
			
		}
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
