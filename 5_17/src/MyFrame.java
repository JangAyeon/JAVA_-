/*예제 8-1 : 300 X 300 크기의 스윙 프레임 만들기*/

import javax.swing.*;

public class MyFrame extends JFrame{
	
	public MyFrame() { //생성자
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300); //프레임 크기 300x300
		setVisible(true); //보이게,,,프레임 출력
	}
	public static void main(String args[]) {
		MyFrame frame=new MyFrame();
	}

}
