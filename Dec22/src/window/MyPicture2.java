package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyPicture2 implements ActionListener{

	static JButton b1;
	static JButton b2;
	static JLabel img;
	
	public static void main(String[] args) {

		JFrame f= new JFrame();
		f.setTitle("나의 그래픽 프로그램");
		f.setSize(700, 700);
		
		JLabel l = new JLabel("나의 강아지");
		JLabel l2 = new JLabel("my dog");
		img = new JLabel();
		ImageIcon icon = new ImageIcon("dog.jpg");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		img.setIcon(icon);
		
		b1 = new JButton("change to dog2!");
		b2 = new JButton("back to dog1!!");
		
		
		f.add(l);
		f.add(img);
		f.add(l2);
		f.add(b1);
		f.add(b2);
		
		MyPicture2 pic=new MyPicture2();
		b1.addActionListener(pic);
		b2.addActionListener(pic);
		
		f.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b1) {
			ImageIcon icon2=new ImageIcon("dog2.jpg");
			img.setIcon(icon2);
		}else {
//		if (e.getSource()==b2) {
			ImageIcon icon1=new ImageIcon("dog.jpg");
			img.setIcon(icon1);
			//		}
		}
	}

}
