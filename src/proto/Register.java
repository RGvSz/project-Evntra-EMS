package proto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Register extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_6;
	JButton btnNewButton;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton rdbtnNewRadioButton_1;
	private JTextField textField_7;
	private JTextField txt;
	JButton btnSignIn;
	JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 204, 255), new Color(0, 204, 255), new Color(0, 204, 255), new Color(0, 204, 255)));
		comboBox.setFont(new Font("Constantia", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"DEPARTMENT", "CSE", "Mech", "Civil", "EEE", "ECE", "ADMIN"}));
		comboBox.setBounds(10, 386, 320, 35);
		contentPane.add(comboBox);
		
		btnNewButton = new JButton("CREATE ACCOUNT");
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(488, 316, 225, 35);
		contentPane.add(btnNewButton);
		
		btnSignIn = new JButton("Go back to login");
		btnSignIn.setForeground(new Color(0, 0, 255));
		btnSignIn.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnSignIn.setBorder(null);
		btnSignIn.setBackground(new Color(0, 255, 255));
		btnSignIn.setBounds(488, 387, 225, 35);
		contentPane.add(btnSignIn);
		
		JLabel lblNewLabel = new JLabel("OR");
		lblNewLabel.setFont(new Font("Constantia", Font.PLAIN, 15));
		lblNewLabel.setBounds(581, 361, 45, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_2 = new JLabel("EMAIL");
		lblNewLabel_1_2.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_2.setBounds(10, 10, 132, 25);
		contentPane.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255)));
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(10, 45, 320, 35);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("USERNAME");
		lblNewLabel_1_3.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_3.setBounds(10, 100, 132, 25);
		contentPane.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255)));
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(10, 135, 320, 35);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("PASSWORD");
		lblNewLabel_1_4.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_4.setBounds(10, 190, 132, 25);
		contentPane.add(lblNewLabel_1_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255)));
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(10, 225, 320, 35);
		contentPane.add(textField_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255)));
		textField.setBackground(Color.WHITE);
		textField.setBounds(381, 45, 320, 35);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("AGE");
		lblNewLabel_1_3_1.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_3_1.setBounds(381, 10, 132, 25);
		contentPane.add(lblNewLabel_1_3_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255)));
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(381, 135, 320, 35);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("GENDER");
		lblNewLabel_1_3_2.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_3_2.setBounds(381, 100, 132, 25);
		contentPane.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("USER TYPE");
		lblNewLabel_1_3_3.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_3_3.setBounds(381, 214, 320, 25);
		contentPane.add(lblNewLabel_1_3_3);
		
		rdbtnNewRadioButton = new JRadioButton("ADMIN");
		rdbtnNewRadioButton.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 12));
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setBounds(381, 256, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("HOD");
		rdbtnNewRadioButton_1.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 12));
		rdbtnNewRadioButton_1.setOpaque(false);
		rdbtnNewRadioButton_1.setBounds(539, 256, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("CONFIRM PASSWORD");
		lblNewLabel_1_4_1.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_4_1.setBounds(10, 285, 171, 25);
		contentPane.add(lblNewLabel_1_4_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255)));
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(10, 321, 320, 35);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setOpaque(false);
		textField_7.setColumns(10);
		textField_7.setBorder(null);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(168, 285, 200, 20);
		contentPane.add(textField_7);
		
		txt = new JTextField();
		txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt.setOpaque(false);
		txt.setColumns(10);
		txt.setBorder(null);
		txt.setBackground(Color.WHITE);
		txt.setBounds(727, 323, 156, 87);
		contentPane.add(txt);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setIcon(new ImageIcon(Register.class.getResource("/proto/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
		lblNewLabel_1.setBounds(0, 0, 918, 520);
		contentPane.add(lblNewLabel_1);
		btnNewButton.addActionListener(this);
		btnSignIn.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
		if(e.getSource()==btnNewButton)
		{
			
			int id=0;
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT count(*) FROM userinfo");
			rs.next();
		    id = rs.getInt(1);
			}
			catch(Exception L) {}
			
			String email = textField_2.getText();
			String user = textField_3.getText();
			String pass = textField_4.getText();
			String conf = textField_6.getText();
			String pos = null;
			if(pass.equals(conf))
			{
			String dep = comboBox.getSelectedItem().toString();
			int age = Integer.parseInt(textField.getText());
			String gender = textField_1.getText();
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
			String q = "insert into userinfo (ID,Username,Password,Email,Department,Age,Gender,Position)values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1,id);
			ps.setString(2, user);
			ps.setString(3, pass);
			ps.setString(4, email);
			ps.setString(5, dep);
			ps.setInt(6, age);
			ps.setString(7, gender);
			if(rdbtnNewRadioButton.isSelected())
			{
				pos = "Admin";
			}
			else if(rdbtnNewRadioButton_1.isSelected())
			{
				pos = "HOD";
			}
			ps.setString(8, pos);
			int result = ps.executeUpdate();
			if(result == 1)
			{
				txt.setText("Successfully created");
			}
			else
			{
				txt.setText("Failed");
			}
			}
			catch(Exception E) {txt.setText("Incorrect Input");}
			}
			else
			{
				textField_7.setText("Does not match");
			}
		}
		else if(e.getSource()==btnSignIn)
		{
			Proto frame = new Proto();
			frame.setVisible(true);
		}
		
		}
		catch(Exception J) {txt.setText("Incorrect Input");}
	}
}
