/* 예제 8-2 : 3개의 버튼 컴포넌트를 가진 스윙 프레임 만들기
 다음 그림과 같이 콘텐트팬의 배경색을 오렌지 색으로 하고, OK, Cancel, Ignore 버튼을 부착한 스윙 프로그램을 작성해라*/

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	
	public ContentPaneEx() {
		
		setTitle("ContentPane과 JFrame 예제"); //프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창 옵션 추가 - 닫는 버튼 통해 스윙 프로그램도 종료
		
		Container contentPane=getContentPane(); //컨텐트팬 알아내기 -- 배경 (제일 바닥판) 설정
		contentPane.setBackground(Color.ORANGE); //오렌지색 배경 설정
		contentPane.setLayout(new FlowLayout()); 
		//컨텐트팬에 Flowlayout 배치관리자 달기 -> 배치 관리자 없으면 아래 모든 버튼 3개 겹침
		
		contentPane.add(new JButton("OK"));//OK 버튼 달기
		contentPane.add(new JButton("Cancel")); // Cancel 버튼 달기
		contentPane.add(new JButton("Ignore")); //Ignore 버튼 달기
		
		setSize(300,150); //프레임 크기 300x150 설정
		setVisible(true); //화면에 프레임 설정 -> 이게 있어야 보임 
		
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
		//ContentPaneEx content= new ContentPaneEx();
		
	}

}
