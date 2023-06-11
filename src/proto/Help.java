package proto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class Help extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btnLogout;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help frame = new Help();
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
	public Help() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 998, 527);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Constantia", Font.BOLD, 21));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(-13, 0, 223, 490);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Help.class.getResource("/proto/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(761, 0, 223, 490);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Help.class.getResource("/proto/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
		panel_1.add(lblNewLabel_1);
		
		btnLogout = new JButton("return");
		btnLogout.setIcon(null);
		btnLogout.setOpaque(false);
		btnLogout.setForeground(Color.BLUE);
		btnLogout.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnLogout.setBorder(null);
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setBounds(691, 10, 53, 35);
		contentPane.add(btnLogout);
		
		lblNewLabel_2 = new JLabel("HELP");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(224, 25, 91, 25);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("SHANAVAS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setBounds(242, 351, 140, 35);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("contacts");
		lblNewLabel_3_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(412, 316, 502, 35);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("for more details ");
		lblNewLabel_3_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(412, 292, 502, 35);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_4 = new JLabel(" VIEW EVENT REQUESTS ->  Yes for approve the events");
		lblNewLabel_3_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(279, 147, 447, 35);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("No for the reject the events");
		lblNewLabel_3_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_5.setBounds(477, 171, 278, 35);
		contentPane.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("-VIEW EVENT REQUEST AND GIVE PERMISSION");
		lblNewLabel_3_6.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_6.setBounds(279, 116, 462, 35);
		contentPane.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("CREATE EVENTS -> ENTER THE DETAILS OF THE EVENTS -> SUBMIT.");
		lblNewLabel_3_5_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_5_1.setBounds(279, 247, 502, 35);
		contentPane.add(lblNewLabel_3_5_1);
		
		JLabel lblNewLabel_3_5_2 = new JLabel("ADMIN");
		lblNewLabel_3_5_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_5_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_5_2.setBounds(242, 91, 502, 35);
		contentPane.add(lblNewLabel_3_5_2);
		
		JLabel lblNewLabel_3_5_3 = new JLabel("Developer teams");
		lblNewLabel_3_5_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_5_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_5_3.setBounds(224, 292, 502, 35);
		contentPane.add(lblNewLabel_3_5_3);
		
		JLabel lblNewLabel_3_5_4 = new JLabel("FARHAN");
		lblNewLabel_3_5_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_5_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_5_4.setBounds(242, 328, 251, 35);
		contentPane.add(lblNewLabel_3_5_4);
		
		JLabel lblNewLabel_3_5_2_1 = new JLabel("HOD");
		lblNewLabel_3_5_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_5_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_5_2_1.setBounds(242, 202, 502, 35);
		contentPane.add(lblNewLabel_3_5_2_1);
		
		JLabel lblNewLabel_3_6_1 = new JLabel("-TO CREATE EVENTS");
		lblNewLabel_3_6_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_6_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_6_1.setBounds(282, 216, 462, 35);
		contentPane.add(lblNewLabel_3_6_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("ANOODH");
		lblNewLabel_3_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(242, 373, 251, 35);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_7 = new JLabel("ANZIL");
		lblNewLabel_3_7.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_7.setBounds(242, 396, 251, 35);
		contentPane.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_8 = new JLabel("JASNA");
		lblNewLabel_3_8.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_8.setBounds(242, 418, 251, 35);
		contentPane.add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_3_9 = new JLabel("email :");
		lblNewLabel_3_9.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_9.setBounds(422, 351, 58, 35);
		contentPane.add(lblNewLabel_3_9);
		
		JLabel lblNewLabel_3_5_4_1 = new JLabel("mohammedfarhanmk@gmail.com");
		lblNewLabel_3_5_4_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_5_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_5_4_1.setBounds(477, 356, 251, 35);
		contentPane.add(lblNewLabel_3_5_4_1);
		
		JLabel lblNewLabel_3_5_4_2 = new JLabel("shanshanu7025@gmail.com");
		lblNewLabel_3_5_4_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_5_4_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_5_4_2.setBounds(475, 378, 251, 35);
		contentPane.add(lblNewLabel_3_5_4_2);
		btnLogout.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		
			if(e.getSource()==btnLogout)
			{
				Proto frame = new Proto();
				frame.setVisible(true);
			}
		
	}
}
