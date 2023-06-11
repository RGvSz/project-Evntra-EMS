
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
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Label;

public class Proto extends JFrame implements ActionListener{
	
	static String DEPARTMENT;
	static String POSITION;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;
	JButton btnNewButton;
	JButton btnSignIn;
	private JTextField textField_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	JButton btnNewButton_1;
	JButton btnNewButton_1_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proto frame = new Proto();
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
	public Proto() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 520);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Sign In");
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(30, 144, 255));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(114, 321, 117, 35);
		contentPane.add(btnNewButton);
		
		btnSignIn = new JButton("to Create Account");
		btnSignIn.setVerifyInputWhenFocusTarget(false);
		btnSignIn.setBorder(null);
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignIn.setForeground(new Color(30, 144, 255));
		btnSignIn.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnSignIn.setBackground(new Color(255, 255, 255));
		btnSignIn.setBounds(163, 361, 132, 35);
		contentPane.add(btnSignIn);
		
		JLabel lblNewLabel = new JLabel("Click here ");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(90, 366, 74, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_1.setBackground(new Color(152, 251, 152));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(10, 141, 132, 25);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		textField.setBackground(new Color(255, 255, 255));
		textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField.setBounds(10, 165, 320, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_1.setBounds(10, 216, 132, 25);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JPasswordField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setBounds(10, 243, 320, 35);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("LOGIN");
		lblNewLabel_3.setForeground(new Color(30, 144, 255));
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3.setBounds(10, 10, 101, 52);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("X");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setForeground(new Color(30, 144, 255));
		lblNewLabel_2.setBounds(854, 0, 64, 44);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(114, 418, 126, 35);
		contentPane.add(textField_2);
		
		lblNewLabel_4 = new JLabel("WELCOME");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_4.setBounds(362, 54, 206, 57);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setFont(new Font("Noto Sans", Font.PLAIN, 30));
		lblNewLabel_5.setIcon(new ImageIcon(Proto.class.getResource("/proto/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBounds(340, 0, 567, 531);
		contentPane.add(lblNewLabel_5);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setIcon(new ImageIcon(Proto.class.getResource("/images/icon i.png")));
		btnNewButton_1.setBounds(10, 461, 35, 35);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon(Proto.class.getResource("/images/help.png")));
		btnNewButton_1_1.setBounds(71, 461, 35, 35);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Proto.class.getResource("/images/pro.png")));
		lblNewLabel_6.setBounds(114, 54, 85, 85);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("About");
		lblNewLabel_7.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(10, 506, 45, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Help");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(81, 506, 45, 13);
		contentPane.add(lblNewLabel_8);
		btnNewButton.addActionListener(this);
		btnSignIn.addActionListener(this);
		btnNewButton_1.addActionListener(this);
		btnNewButton_1_1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
		if(e.getSource()==btnNewButton)
		{
			int ch = 0;
			String user = textField.getText();
			String pass=String.valueOf(textField_1.getPassword());
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from userinfo");
			
			 while(rs.next())
			{
				if(user.equals(rs.getString(2))&&pass.equals(rs.getString(3)))
				{				
					if(rs.getString(8).equals("Admin"))
					{
						POSITION = rs.getString(8);
						AdminView frame = new AdminView();
						frame.setVisible(true);
						ch=1;
						break;
					}
					else 
					{
						POSITION = rs.getString(8);
						DEPARTMENT = rs.getString(5);
						HODMenu frame = new HODMenu();
						frame.setVisible(true);
						ch=1;
						break;
					}
				}
				
			}
			 if(ch==0)
			 {
				 textField_2.setText("Incorrect Input");
			 }
			
			}catch(Exception x) {textField_2.setText("Incorrect Input");}
		}
		else if(e.getSource()==btnSignIn)
		{
			Register frame = new Register();
			frame.setVisible(true);
		}
	}
		catch(Exception J) {textField_2.setText("Incorrect Input");}
		if(e.getSource()==btnNewButton_1)
		{
			About frame = new About();
			frame.setVisible(true);
		}
		if(e.getSource()==btnNewButton_1_1)
		{
			Help frame = new Help();
			frame.setVisible(true);
		}
	}
}
