/*예제 8-3 : FlowLayout 배치관리자 활용
 FlowLayout 배치관리자를 사용하여 다음 그림과 같이 5개의 버튼 배치*/

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		
		setTitle("FlowLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();//컨텐트 팬 알아내기
		
		//왼쪽 정렬, 수평 간격 30 pixel, 수직 간격 40 pixel 배치
		//FlowLayout 생성
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("Calculate"));
		
		setSize(300,200); //프레임 크기 300x200 설정
		setVisible(true); //화면에 프레임 출력
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}
