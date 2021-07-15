/*예제 12-4 : 진동하는 스레드와 스레드의 강제 종료 
 Runnable을 받은 스레드를 작성하여 프레임이 심하게 진동하도록 프로그램을 작성해라.
 그리고 컨텐트 팬에 마우스를 클릭하면 진동 스레드를 종료시켜 진동이 멈추도록 해라 */

import javax.swing.JFrame;
import java.awt.event.*;
import java.util.Random;

public class VibratingFrame extends JFrame implements Runnable{
	
	Thread th;
	
	
	public VibratingFrame() {
		setTitle("진동하는 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,200);
		setLocation(300,300);
		setVisible(true);
		
		getContentPane().addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
			if(th.isAlive()) {
				return;}//thread 살아있으면 리턴 -> 아무 것도 아니고 그냥이면 종료..
			th.interrupt();
			super.mousePressed(e);
			}
		});
		
		th=new Thread(this);//진동스레드 객체를 만들고
		th.start();
		
	}
	public static void main(String[] args) {
		new VibratingFrame();
	}
	public void run() {
		
		Random r=new Random();//랜덤함수 사용
		while(true) {
			try {
				Thread.sleep(20); //sleep은 무조건 try - catch문 사용	
			}
			catch(InterruptedException e) {
				return; //에러나면 그냥 나갈
				
			}
			int x=getX()+r.nextInt()%5;//현재 X 기준 좌표 + 변위
			int y=getY()+r.nextInt()%5;//현재 Y 기준 좌표 + 변위
			setLocation(x,y);//위치로 설정
		} 
		
		
	}
}
