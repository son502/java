package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Game implements ActionListener {

	static JButton s,r,p;
	static JFrame f;
	
	public static void main(String[] args) {
		
		f=new JFrame();
		f.setTitle("���� �ڰ���/����/���� ����");
		f.setSize(500,1500);
		
		s=new JButton();
		r=new JButton();
		p=new JButton();
		
		ImageIcon icon1=new ImageIcon("s.png");
		ImageIcon icon2=new ImageIcon("r.png");
		ImageIcon icon3=new ImageIcon("p.png");
		
		s.setIcon(icon1);
		r.setIcon(icon2);
		p.setIcon(icon3);
		
		FlowLayout flow=new FlowLayout();
		f.setLayout(flow);
		
		f.add(s);
		f.add(r);
		f.add(p);
		
		Game game = new Game();
		s.addActionListener(game);
		r.addActionListener(game);
		p.addActionListener(game);
		
		f.setVisible(true);
		
		
		
	}
	
//	public static void main(String[] args) {
//
//		Game game=new Game();
//	}
	
	public void actionPerformed(ActionEvent e) {
		
		Random random = new Random();
		int comput=random.nextInt(3);
		
		if(e.getSource()==s) {
			if(comput==0) {
				f.setTitle("���");
			}
			if(comput==1) {
				f.setTitle("��ǻ�� ��");
			}
			if(comput==2) {
				f.setTitle("���� ��");
			}
			
		}
		if(e.getSource()==r) {
			if(comput==0) {
				f.setTitle("���� �� ");
			}
			if(comput==1) {
				f.setTitle("���");
			}
			if(comput==2) {
				f.setTitle("��ǻ�� ��");
			}
			
		}
		if(e.getSource()==p) {
			if(comput==0) {
				f.setTitle("��ǻ�� ��");
			}
			if(comput==1) {
				f.setTitle("���� ��");
			}
			if(comput==2) {
				f.setTitle("���");
			}
		}
	}
}
