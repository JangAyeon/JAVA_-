import java.awt.*;

import javax.swing.*;

/*예제 8-5 : GridLayout 배치 관리자를 사용하는 예
 GridLayout을 활용해 다음 그림과 같이 한 줄에 10개의 버튼을 동일한 크기로 배치하는 스윙 프로그램 작성*/
public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		super("GridLayout예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		//1x10의 GridLayout 배치관리자
		contentPane.setLayout(new GridLayout(1,10));
		for (int i=0;i<10;i++) { //10개의 버튼 부착 
			String text=Integer.toString(i); //i를 문자열로 변환
			JButton button=new JButton(text);
			contentPane.add(button); //컨텐트팬에 버튼 부착
			
		}
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
