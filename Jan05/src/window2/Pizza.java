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
		top=new JLabel("<<<<<<<�ڹ����ڿ� ���Ű��� ȯ���մϴ�>>>>>>>>");
		count=new JLabel("����");
		b1=new JButton("�޺�����");
		b1.setBackground(Color.MAGENTA);
		b2=new JButton("������������");
		b2.setBackground(Color.MAGENTA);
		b3=new JButton("�Ұ������");
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
		lblTotalSum.setFont(new Font("HY������M", Font.PLAIN, 12));
		lblTotalSum.setBackground(Color.BLACK);
		lblTotalSum.setForeground(Color.RED);
		f.getContentPane().add(lblTotalSum);
		
		btnNewButton = new JButton("Click Me!!!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"���� ���� �����̱���!!");
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
				
				list.setText("�޺� ����: "+combo+"��\n"
						+"�������� ����: "+potato+"��\n"
						+"�Ұ�� ����: "+bulgoki+"��"
						);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum+"");
				potato++;
				list.setText("�޺� ����: "+combo+"��\n"
						+"�������� ����: "+potato+"��\n"
						+"�Ұ� ����: "+bulgoki+"��"
						);
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum+"");
				bulgoki++;
				list.setText("�޺� ����: "+combo+"��\n"
						+"�������� ����: "+potato+"��\n"
						+"�Ұ� ����: "+bulgoki+"��"
						);
			}
		});
		
		f.setVisible(true);
		
	}

	public static void main(String[] args) {

		Pizza p=new Pizza();
	}

}
