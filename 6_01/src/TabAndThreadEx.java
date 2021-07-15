/*예제 12 -6 : wait(),notify()를 이용한 바 채우기*/

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.event.*;


class MyLabel extends JLabel {
	int barSize=0;//바 사이즈
	int maxBarSize;
	
	public MyLabel(int maxBarSize) {
		this.maxBarSize=maxBarSize;
	}
	public void paintComponent(Graphics g) {//그래픽이 왔다갔다하는 ...
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width=(int)(((double)(this.getWidth()))/maxBarSize*barSize);
		//getwidth를 double로 받아서 계산하고 그 값을 int로
		if(width==0) {return;}
		g.fillRect(0,0,width,this.getHeight());
		//계산한 width랑 현재의 높이 받아서 직사각형 채우기
	}
	
	synchronized void fill() {
		if(barSize==maxBarSize) {
			try {
				wait();
				//time을 조정하는 코드는 try-catch 사용
				}
			catch (InterruptedException e) {return;		}
		}
		barSize++;
		repaint();
		notify();//스레드 깨우기
	}
	synchronized void consume() {
		if(barSize==0) {
			try {
				wait();
			}
			catch(InterruptedException e){
				return;
			}
		}
		barSize--;
		repaint();
		notify();
	}
}


class ConsumerThread extends Thread{
	MyLabel bar;
	public ConsumerThread(MyLabel bar) {
		this.bar=bar;
	}
	public void run() {
		while(true) {
			try {
				sleep(100);
				bar.consume();//바를 조금씩 줄이기
			}
			catch(InterruptedException e) {
				return;//나가기
			}
		}
	}
}


public class TabAndThreadEx extends JFrame {
	
	//만들었던 바 넣기
	MyLabel bar=new MyLabel(100);
	
	public TabAndThreadEx(){
		super("마지막 실습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setLocation(20,50);
		bar.setSize(300,20);
		c.add(bar);
		
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				bar.fill();
				
			}
		});
		
		setSize(350,200);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
		ConsumerThread th=new ConsumerThread(bar);
		th.start();
	}
	public static void main(String[] args) {
		new TabAndThreadEx();
	}

}
