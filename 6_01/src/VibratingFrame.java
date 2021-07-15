/*���� 12-4 : �����ϴ� ������� �������� ���� ���� 
 Runnable�� ���� �����带 �ۼ��Ͽ� �������� ���ϰ� �����ϵ��� ���α׷��� �ۼ��ض�.
 �׸��� ����Ʈ �ҿ� ���콺�� Ŭ���ϸ� ���� �����带 ������� ������ ���ߵ��� �ض� */

import javax.swing.JFrame;
import java.awt.event.*;
import java.util.Random;

public class VibratingFrame extends JFrame implements Runnable{
	
	Thread th;
	
	
	public VibratingFrame() {
		setTitle("�����ϴ� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,200);
		setLocation(300,300);
		setVisible(true);
		
		getContentPane().addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
			if(th.isAlive()) {
				return;}//thread ��������� ���� -> �ƹ� �͵� �ƴϰ� �׳��̸� ����..
			th.interrupt();
			super.mousePressed(e);
			}
		});
		
		th=new Thread(this);//���������� ��ü�� �����
		th.start();
		
	}
	public static void main(String[] args) {
		new VibratingFrame();
	}
	public void run() {
		
		Random r=new Random();//�����Լ� ���
		while(true) {
			try {
				Thread.sleep(20); //sleep�� ������ try - catch�� ���	
			}
			catch(InterruptedException e) {
				return; //�������� �׳� ����
				
			}
			int x=getX()+r.nextInt()%5;//���� X ���� ��ǥ + ����
			int y=getY()+r.nextInt()%5;//���� Y ���� ��ǥ + ����
			setLocation(x,y);//��ġ�� ����
		} 
		
		
	}
}
