/*예제 8-4 : BorderLayout 배치관리자 활용
 BorderLayout 배치관리자를 사용해 다음 그림과 같이 5개의 버튼을 배치해라*/

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		setTitle("BorderLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane(); //컨탠트팬 알아내기
		
		//컨텐트팬에 BorderLayout 배치관리자 설정
		contentPane.setLayout(new BorderLayout(30,20));
		
		contentPane.add(new JButton("Calculation"),BorderLayout.CENTER);
		contentPane.add(new JButton("add"),BorderLayout.NORTH);
		contentPane.add(new JButton("sub"),BorderLayout.SOUTH);
		contentPane.add(new JButton("mul"),BorderLayout.EAST);
		contentPane.add(new JButton("div"),BorderLayout.WEST);
		
		setSize(300,200); //프레임 크기 300 x 200
		setVisible(true); //프레임을 화면에 출력
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
	

}
