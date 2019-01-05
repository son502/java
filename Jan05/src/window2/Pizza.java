package window2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pizza {
	JFrame f;
	JLabel top, count;
	JButton b1, b2, b3;
	JTextField total;
	int sum=0;
	int combo=0;
	int potato=0;
	int bulgoki=0;
	
	JTextArea list;
	private JLabel lblTotalSum;
	private JButton btnNewButton;
	
	public Pizza(){
		
		f=new JFrame();
		f.setSize(336,240);
		top=new JLabel("<<<<<<<자바피자에 오신것을 환영합니다>>>>>>>>");
		count=new JLabel("갯수");
		b1=new JButton("콤보피자");
		b1.setBackground(Color.MAGENTA);
		b2=new JButton("포테이토피자");
		b2.setBackground(Color.MAGENTA);
		b3=new JButton("불고기피자");
		b3.setBackground(Color.MAGENTA);
		total=new JTextField(20);
		
		FlowLayout flow=new FlowLayout();
		f.getContentPane().setLayout(flow);
		list=new JTextArea(3,30);
		list.setBackground(Color.YELLOW);
		
		f.getContentPane().add(top);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(count);
		f.getContentPane().add(total);
		f.getContentPane().add(list);
		
		lblTotalSum = new JLabel("\uCD1D\uACC4");
		lblTotalSum.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
		lblTotalSum.setBackground(Color.BLACK);
		lblTotalSum.setForeground(Color.RED);
		f.getContentPane().add(lblTotalSum);
		
		btnNewButton = new JButton("Click Me!!!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"정말 나를 누르셨군요!!");
			}
		});
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		f.getContentPane().add(btnNewButton);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum+"");
				combo++;
				
				list.setText("콤보 개수: "+combo+"개\n"
						+"포테이토 개수: "+potato+"개\n"
						+"불고기 개수: "+bulgoki+"개"
						);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum+"");
				potato++;
				list.setText("콤보 개수: "+combo+"개\n"
						+"포테이토 개수: "+potato+"개\n"
						+"불고개 개수: "+bulgoki+"개"
						);
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum+"");
				bulgoki++;
				list.setText("콤보 개수: "+combo+"개\n"
						+"포테이토 개수: "+potato+"개\n"
						+"불고개 개수: "+bulgoki+"개"
						);
			}
		});
		
		f.setVisible(true);
		
	}

	public static void main(String[] args) {

		Pizza p=new Pizza();
	}

}
