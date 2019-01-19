package diary;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyDiary extends JFrame {
	private JTextField noText;
	private JTextField titleText;

	public MyDiary() {
		getContentPane().setBackground(Color.GREEN);
		//컨트롤+쉬프트+f(자동 정리)
		setTitle("나의 일기장 작성화면");
		setSize(350, 750);
		
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		JLabel lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);
		
		ImageIcon icon = new ImageIcon("일기장-위.png");
		lblNewLabel.setIcon(icon);
		
		JLabel no = new JLabel("번호");
		getContentPane().add(no);
		
		noText = new JTextField();
		noText.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		getContentPane().add(noText);
		noText.setColumns(15);
		
		JLabel lblNewLabel_1 = new JLabel("제목");
		getContentPane().add(lblNewLabel_1);
		
		titleText = new JTextField();
		titleText.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		getContentPane().add(titleText);
		titleText.setColumns(15);
		
		JLabel label = new JLabel("내용");
		getContentPane().add(label);
		
		JTextArea contentText = new JTextArea();
		contentText.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		contentText.setColumns(15);
		contentText.setRows(5);
		getContentPane().add(contentText);
		
		JButton save = new JButton("일기저장");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String noT=noText.getText();
				String titleT=titleText.getText();
				String contentT=contentText.getText();
				
				try {
				
				FileWriter f = new FileWriter("c:/diary/"+noT+".txt");
				f.write(noT+"\r\n");
				f.write(titleT+"\r\n");
				f.write(contentT+"\r\n");
				f.flush();
				f.close();
				
				noText.setText("");
				titleText.setText("");
				contentText.setText("");
				
				JOptionPane.showMessageDialog(null, "화일로 저장 성공!!");
				
			} catch (Exception e) {
				
				JOptionPane.showMessageDialog(null, "화일로 저장 실패함!!");

			}
			}
				
				
		});
		save.setBackground(Color.MAGENTA);
		save.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 40));
		getContentPane().add(save);
		
		
		JButton read = new JButton("일기읽기");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String noT=noText.getText();
				
				try {
					
					FileReader f2=new FileReader("c:/diary/"+noT+".txt");

					BufferedReader reader=new BufferedReader(f2);
					String noR=reader.readLine();
					String titleR=reader.readLine();
					String contentR=reader.readLine();
					
					noText.setText(noR);
					titleText.setText(titleR);
					contentText.setText(contentR);
					
					noText.setForeground(Color.RED);
					
					
					JOptionPane.showMessageDialog(null, "화일로 읽기 성공!!");
					
				} catch (Exception e2) {
					
					JOptionPane.showMessageDialog(null, "화일로 읽기 실패함!!");
					
				}
				
				
			}
		});
		read.setBackground(Color.ORANGE);
		read.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 40));
		getContentPane().add(read);
		
		JButton btnNewButton = new JButton("초기화");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		getContentPane().add(btnNewButton);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		MyDiary name = new MyDiary();
	}

}
