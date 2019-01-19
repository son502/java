package diary;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class DiaryMain2 extends JFrame {
	private JTextField id;
	private JTextField pw;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public DiaryMain2(){
		getContentPane().setBackground(Color.GREEN);
	
		setTitle("나의일기장 시작화면");
		setSize(400,600);
		
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		
		JLabel lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);
		ImageIcon icon = new ImageIcon("일기장.jpg");
		lblNewLabel.setIcon(icon);
		
		JLabel lblNewLabel_1 = new JLabel("아이디 :  ");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		getContentPane().add(lblNewLabel_1);
		
		id = new JTextField();
		id.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		getContentPane().add(id);
		id.setColumns(20);
		
		
		JLabel lblNewLabel_2 = new JLabel("패스워드 : ");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		getContentPane().add(lblNewLabel_2);
		
		pw = new JTextField();
		pw.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		getContentPane().add(pw);
		pw.setColumns(20);
		
		JButton login = new JButton("로그인");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sId="root";
				String sPw="1234";
				String gId=id.getText();
				String gPw=pw.getText();
				
				
				if ((sId.equals(gId)) && (sPw.equals(gPw))) {
					JOptionPane.showMessageDialog(null,"로그인 OK");
				} else {
					JOptionPane.showMessageDialog(null,"로그인 NO. 재입력요망");

				}
				
			}
		});
		login.setBackground(Color.RED);
		login.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		getContentPane().add(login);
		
		JButton reset = new JButton("초기화");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				id.setText("");
				pw.setText("");
			}
		});
		reset.setBackground(Color.YELLOW);
		reset.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		getContentPane().add(reset);
		
		JLabel lblNewLabel_8 = new JLabel("");
		getContentPane().add(lblNewLabel);
		ImageIcon icon2 = new ImageIcon("일기장타이틀.jpg");
		lblNewLabel.setIcon(icon2);
		
		
		
		
		
		
		getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_3 = new JLabel("<<<<<<<<<<<<<<<<오늘의 일기를 시작합니다.>>>>>>>>>>>>>>>>");
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("번호");
		getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		getContentPane().add(textField);
		textField.setColumns(30);
		
		JLabel lblNewLabel_5 = new JLabel("날짜");
		getContentPane().add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		getContentPane().add(textField_1);
		textField_1.setColumns(30);
		
		JLabel lblNewLabel_6 = new JLabel("제목");
		getContentPane().add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		getContentPane().add(textField_2);
		textField_2.setColumns(30);
		
		JLabel lblNewLabel_7 = new JLabel("내용");
		getContentPane().add(lblNewLabel_7);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(10);
		textArea.setColumns(30);
		getContentPane().add(textArea);
		
		JLabel lblNewLabel_9 = new JLabel("번호");
		getContentPane().add(lblNewLabel_9);
		
		textField_3 = new JTextField();
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("일기저장");
	
		getContentPane().add(btnNewButton);
		
		JButton button = new JButton("일기읽기");

		getContentPane().add(button);
		
		
		
		setVisible(true);
	}

	
	public static void main(String[] args) {

		DiaryMain2 name = new DiaryMain2();
	}

}
