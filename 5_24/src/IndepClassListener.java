/*예제 9-1 :  독립 클래스로 Action 이벤트 리스너 만들기*/

/*
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame{
	public IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn=new JButton("Action");
		btn.addActionListener(new MyActionListener());
		//버튼에 Action 이벤트 리스너 등록
		c.add(btn);
		setSize(250,120);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new IndepClassListener();
	}

}

class MyActionListener implements ActionListener{
	//Action 이벤트 리스너 구현
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();//이벤트 발생한 것을 받아서
		if(b.getText().equals("Action")) //읽어보니까 Action이라는 글씨와 똑같으면
			b.setText("액션"); //'액션'으로 텍스트 세팅을 바꿔줌
		else b.setText("Action"); //아니면 'Action'으로 바꿔줌
	}
}*/


/*예제 9-2 :  내부 클래스로 Action 이벤트 리스너 만들기*/
/*
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame {


		public IndepClassListener() {
			setTitle("Action 이벤트 리스너 예제");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			JButton btn=new JButton("Action");
			MyActionListener al=new MyActionListener();
			btn.addActionListener(al);
			//버튼에 Action 이벤트 리스너 등록
			c.add(btn);
			setSize(250,120);
			setVisible(true);
			
		}
		
		private class MyActionListener implements ActionListener{
			//Action 이벤트 리스너 구현
			public void actionPerformed(ActionEvent e) {
				JButton b=(JButton)e.getSource();//이벤트 발생한 것을 받아서
				if(b.getText().equals("Action")) //읽어보니까 Action이라는 글씨와 똑같으면
					b.setText("액션"); //'액션'으로 텍스트 세팅을 바꿔줌
				else 
					b.setText("Action"); //아니면 'Action'으로 바꿔줌
					//InnerClassListener의 멤버나 JFrame의 멤버를 호출
				
				
			
			IndepClassListener.this.setTitle(b.getText());
					//타이틀에 버튼 문자열 출력
			}
		}
		
		public static void main(String[] args) {
			new IndepClassListener();
		}

}
*/

/*예제 9-3 :  무명 클래스로 Action 이벤트 리스너 만들기*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame {


	public IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn=new JButton("Action");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b=(JButton)e.getSource();//이벤트 발생한 것을 받아서
				if(b.getText().equals("Action")) //읽어보니까 Action이라는 글씨와 똑같으면
					b.setText("액션"); //'액션'으로 텍스트 세팅을 바꿔줌
				else 
					b.setText("Action"); //아니면 'Action'으로 바꿔줌
					setTitle(b.getText());
				
			}});
		//버튼에 Action 이벤트 리스너 등록
		c.add(btn);
		setSize(250,120);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new IndepClassListener();
	}
}



