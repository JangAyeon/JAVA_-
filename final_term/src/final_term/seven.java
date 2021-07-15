package final_term;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class seven extends JFrame{
	
	public seven(){
		this.setTitle("8번 문제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
				
		Container c = getContentPane();
		
		c.setLayout(null);
		
		JLabel label=new JLabel("기말고사");
		label.setSize(80, 20);
		label.setLocation(100, 80);
		
		label.addMouseListener(new MyMouseAdapter());
		
		c.add(label);
		
		this.setSize(320,200);
		this.setVisible(true);

		
	}
	class MyMouseAdapter extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			JLabel label=(JLabel)e.getSource();
			label.setText("8번 문제");
		}
	}
	
	public static void main(String[] args) {
		new seven();
	}

}