package menu;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChinaFood extends JFrame {
	private JTextField textField_2;
	private JTextField textField_3;
	
	int count=0;
	final int price=5000;
	JLabel lblNewLabel_2;
	
		
	public ChinaFood() {
		getContentPane().setBackground(Color.YELLOW);

		setSize(550, 500);
		setTitle("주문하세요..");
		
		ImageIcon icon=new ImageIcon("중국집.png");
		
		FlowLayout flow=new FlowLayout();
		getContentPane().setLayout(flow);
		
		JButton button = new JButton("\uC9DC\uC7A5\uBA74");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField_2.setText(count+"");
				textField_3.setText(count*price+"");
				
				ImageIcon icon3=new ImageIcon("짜장면.jpg");
				
				lblNewLabel_2.setIcon(icon3);
			}
		});
		button.setBackground(Color.PINK);
		button.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		button.setForeground(Color.MAGENTA);
		getContentPane().add(button);
		
		JButton btnNewButton = new JButton("\uC9EC\uBF55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField_2.setText(count+"");
				textField_3.setText(count*price+"");
				
				ImageIcon icon3=new ImageIcon("짬뽕.jpg");
				
				lblNewLabel_2.setIcon(icon3);
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton.setForeground(Color.MAGENTA);
		getContentPane().add(btnNewButton);
		;
		
		JButton btnNewButton_1 = new JButton("\uC6B0\uB3D9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField_2.setText(count+"");
				textField_3.setText(count*price+"");
				
				ImageIcon icon2=new ImageIcon("우동.png");
				
				lblNewLabel_2.setIcon(icon2);
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton_1.setForeground(Color.MAGENTA);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC218");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.RED);
		textField_2.setFont(new Font("굴림", Font.PLAIN, 15));
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uAE08\uC561");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		getContentPane().add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.BLUE);
		textField_3.setFont(new Font("굴림", Font.PLAIN, 15));
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_2 = new JLabel("");
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_2.setIcon(icon);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {

		ChinaFood china=new ChinaFood();
		
		
	}

}
