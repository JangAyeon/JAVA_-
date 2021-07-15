/*예제 12-2 : Runnable 인터페이스를 이용하여 1초 단위로 출력하는 타이머 스레드 만들기*/

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable{
	private JLabel timerLabel;
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel=timerLabel;
	}
	//스레드 코드, run()이 종료하면 스레드 종료
	public void run() {
		int n=0;//타이머 카운트 값
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);//1초 동안 잠을 잠
			}
			catch(InterruptedException e) {return;}
		}
		
	}
}
public class RunnableTimerEx extends JFrame {
	
	public RunnableTimerEx() {
		setTitle("Runnable을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		//타이머 값을 출력할 레이블 생성
		JLabel timerLabel=new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		c.add(timerLabel);//레이블을 컨텐트팬에 부착
		
		TimerRunnable runnable=new TimerRunnable(timerLabel);
		Thread th=new Thread(runnable);//스레드 객체 생성
		setSize(250,150);
		setVisible(true);
		th.start();//타이머 스레드가 실행을 시작하게 함
		
	}
	
	public static void main(String[] args) {
		new RunnableTimerEx();
	}
	

}
