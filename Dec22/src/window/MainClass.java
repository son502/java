package window;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainClass implements ActionListener{
	
	static JLabel me;
	static JButton b1,b2,b3,b4;
	
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setTitle("���� �׷��� ���α׷�");
		f.setSize(300,300);
		
		me=new JLabel("<<<<<������ �׷���>>>>>");
		b1=new JButton("<<<<<����>>>>>");
		b2=new JButton("<<<<<�̹���>>>>>");
		b3=new JButton("<<<<<���š�>>>>>");
		b4=new JButton("<<<<<����/����/��>>>>>");
		
		b1.setForeground(Color.RED);
		b2.setBackground(Color.ORANGE);
		b3.setForeground(Color.ORANGE);
		b4.setBackground(Color.RED);
		
		FlowLayout flow=new FlowLayout();
		f.setLayout(flow);
		
		f.add(me);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		MainClass main=new MainClass();
		b1.addActionListener(main);
		b2.addActionListener(main);
		b3.addActionListener(main);
		b4.addActionListener(main);
		
		f.setVisible(true);
	}	
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==b1) {
			
			MyCalculator cal = new MyCalculator();
			
		}
		if (e.getSource()==b2) {
			
			MyPicture pic1 = new MyPicture();
		}
		if (e.getSource()==b3) {
			
			MyPicture2 pic2 = new MyPicture2();
		}
		if (e.getSource()==b4) {
			
//			Game game=new Game();
		}
	}

}
